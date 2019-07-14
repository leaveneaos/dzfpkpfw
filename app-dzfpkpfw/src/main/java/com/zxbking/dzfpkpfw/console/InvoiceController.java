package com.zxbking.dzfpkpfw.console;

import com.github.pagehelper.PageInfo;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.alyxjs.wfw.component.cache.redis.RedisCacheService;
import com.ihyht.commons.lang.DateUtils;
import com.ihyht.commons.lang.JsonUtils;
import com.ihyht.commons.lang.StringUtils;
import com.ihyht.commons.lang.model.RestResponse;
import com.zxbking.dzfpkpfw.base.AbstractRestController;
import com.zxbking.dzfpkpfw.config.SystemConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;

import javax.servlet.http.HttpServletRequest;

@Api(value = "发票信息",description="发票信息")
@RestController
@RequestMapping("/rest/invoice")
public class InvoiceController extends AbstractRestController {

    @Autowired
    private InvoiceService invoiceService;


    @RequestMapping(path="",method = RequestMethod.PUT)
    @ApiOperation(value = "增加")
    public RestResponse addInvoice(@RequestBody Invoice invoice) {
        Boolean flag = invoiceService.addInvoice(invoice);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "通过id标识查找")
    public RestResponse findById(@PathVariable String id) {
        Invoice invoice = invoiceService.findById(id);
        if(invoice!=null){
            return  RestResponse.success(invoice);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping(path="/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "通过id标识删除")
    public RestResponse deleteCeShiById(@PathVariable String id) {
        Boolean flag = invoiceService.deleteInvoiceById(id);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.deleteFail);
        }
    }

    @RequestMapping(path="",method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public RestResponse updateCeShi(@RequestBody Invoice ceShi) {
        if(ceShi.getStatus()!=null && ceShi.getStatus()==3) {
            ceShi.setFpTime(new Date());
        }
        ceShi.setLastTime(new Date());
        Boolean flag = invoiceService.updateInvoice(ceShi);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.updateFail);
        }
    }
    @Autowired
    private AccountService accountService;
    @Autowired
    private RedisCacheService redisCacheService;
    @RequestMapping(path="/plist",method = RequestMethod.GET)
    @ApiOperation(value = "分页带条件查询")
    public RestResponse selectCeShiByExample(HttpServletRequest request,@ModelAttribute Invoice invoice, @RequestParam(required = false) String createTime1, @RequestParam(required = false) String createTime2, @RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "20") Integer pageSize){
        String accountId = (String)request.getSession().getAttribute(SystemConfig.USER_NAME);
        Map<String,String> map = new HashMap<>();
        if(accountId!=null) {
            Account account = accountService.findById(accountId);
            if(!"admin".equals(account.getAccountName())) {
                invoice.setLastUser(account.getAccountName());
            }
            String str = redisCacheService.get(SystemConfig.USER_NAME+accountId);
            if(StringUtils.isNotEmpty(str)){
                map = JsonUtils.string2Obj(str,new TypeReference<Map<String,String>>(){});
            }
        }
        Date createTime11 = null;
        Date createTime22 = null;
        try{
            createTime11 = new Date(Long.parseLong(createTime1));
            createTime22 = DateUtils.parseDate((DateUtils.formatDate((new Date(Long.parseLong(createTime2))),"yyyy-MM-dd")+" 23:59:59"),"yyyy-MM-dd hh:mm:ss");
        }catch (Exception e){}
        PageInfo<Invoice> p = invoiceService.selectInvoiceByExample(invoice, createTime11,createTime22,pageNo,pageSize);
        Map<String, String> finalMap = map;
        p.getList().stream().forEach(obj -> obj.setLastUser(finalMap.get(obj.getLastUser())));
        if(p!=null){
            return  RestResponse.success(p);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping(path="/list",method = RequestMethod.GET)
    @ApiOperation(value = "查询全部数据")
    public RestResponse selectAll(){
        List<Invoice> list = invoiceService.selectAll();
        if(list!=null){
            return  RestResponse.success(list);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }
}