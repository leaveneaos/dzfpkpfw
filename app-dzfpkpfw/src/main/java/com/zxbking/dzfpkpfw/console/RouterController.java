package com.zxbking.dzfpkpfw.console;

import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.StringUtils;
import com.ihyht.commons.lang.model.RestResponse;
import com.zxbking.dzfpkpfw.base.AbstractRestController;
import com.zxbking.dzfpkpfw.config.SystemConfig;
import com.zxbking.dzfpkpfw.model.Invoice;
import com.zxbking.dzfpkpfw.model.UserInfo;
import com.zxbking.dzfpkpfw.service.InvoiceService;
import com.zxbking.dzfpkpfw.service.UserInfoService;
import com.zxbking.dzfpkpfw.utils.QRCodeUtil;
import com.zxbking.dzfpkpfw.utils.ShortNetAddressUtil;
import io.swagger.annotations.Api;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Date;


@Api(value = "Home",description="Home")
@Controller
@RequestMapping("")
public class RouterController extends AbstractRestController {
    private int len = 2;

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute(SystemConfig.USER_NAME);
        if (StringUtils.isNotEmpty(username)) {
            return "index";
        } else {
            return "login";
        }

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute(SystemConfig.USER_NAME);
        return "login";
    }

    @Autowired
    private InvoiceService invoiceService;
    @Value("${qymc:}")
    private String qymc;
    @Value("${qyphone:}")
    private String qyphone;
    @Value("${invoice.hs:0.15}")
    private String invoiceHs;
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "/ewm", method = RequestMethod.GET)
    public String sayHelloForm(HttpServletRequest request,@RequestParam(name = "orderId", required = false) String orderId, @RequestParam(name = "amount", required = false) String amount, Model model) {
        Invoice invoice = null;
        if (StringUtils.isNotEmpty(orderId)) {
            invoice = invoiceService.findById(orderId);
        } else {
            if (StringUtils.isEmpty(amount)) {
                return "html/error";
            }
            invoice = new Invoice();
            invoice.setCreateTime(new Date());
            BigDecimal decimal = new BigDecimal(amount);
            decimal = decimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
            invoice.setTaxAbleAmount(decimal.longValue());

            BigDecimal invoiceHsBigDecimal = new BigDecimal(invoiceHs);
            invoiceHsBigDecimal = invoiceHsBigDecimal.setScale(len, BigDecimal.ROUND_HALF_DOWN);
//            invoiceHsBigDecimal = (new BigDecimal(1)).subtract(invoiceHsBigDecimal);
//            decimal = decimal.multiply(invoiceHsBigDecimal);
            decimal = decimal.divide(invoiceHsBigDecimal, len, BigDecimal.ROUND_HALF_DOWN);
            invoice.setTaxFreeAmount(decimal.longValue());
            String accountId = (String)request.getSession().getAttribute(SystemConfig.USER_NAME);
            if(accountId!=null){
                UserInfo user = userInfoService.findById(accountId);
                invoice.setLastUser(user.getUserName());
            }
            Boolean flag = invoiceService.addInvoice(invoice);
            if (!flag) {
                logger.error("订单[" + invoice.getId() + "]保存出错，请人工处理！数据详情：" + invoice);
            }
        }
        if (invoice != null) {
            model.addAttribute("success", true);
            model.addAttribute("invoice", invoice);
            model.addAttribute("qymc", qymc);
            model.addAttribute("qyphone", qyphone);
            model.addAttribute("createTime", DateUtils.format(new Date(), "yyyy年MM月dd日 hh:mm:ss"));//invoice.getCreateTime()
            BigDecimal bigDecimal = new BigDecimal(invoice.getTaxAbleAmount());
            bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
            model.addAttribute("amount", bigDecimal.toString());
        } else {
            model.addAttribute("success", false);
        }
        return "html/ewm";
    }

    @Value("${server.port}")
    String port;
    @Value("${ip.addr}")
    String ipAddr;

    @RequestMapping(value = "/qrcode/generateqrcode/{orderId}", method = RequestMethod.GET)
    @ResponseBody
    public void generateQRCode4Product(HttpServletRequest request, @PathVariable String orderId, HttpServletResponse response) {
        String longUrl;
        try {
            longUrl =  ipAddr + ":" + port + "/invoice/" + orderId;
            // 转换成短url
//            String shortUrl = ShortNetAddressUtil.generateShortUrl(longUrl);
            // 生成二维码
            BitMatrix qRcodeImg = QRCodeUtil.generateQRCodeStream(longUrl, response);
            // 将二维码输出到页面中
            MatrixToImageWriter.writeToStream(qRcodeImg, "png", response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/invoice/{orderId}", method = RequestMethod.GET)
    public String sayHelloForm(@PathVariable String orderId, Model model) {
        Invoice invoice = invoiceService.findById(orderId);
        if(invoice.getStatus()==1||invoice.getStatus()==2){
            if (invoice != null) {
                model.addAttribute("success", true);
                model.addAttribute("invoice", invoice);
                model.addAttribute("qymc", qymc);
                model.addAttribute("qyphone", qyphone);
            } else {
                model.addAttribute("success", false);
            }
            return "html/invoice";
        }else{
            return "html/invoice-s";
        }
    }
}