package com.zxbking.dzfpkpfw.console;

import com.github.pagehelper.PageInfo;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import com.zxbking.dzfpkpfw.base.AbstractRestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;


@Api(value = "发票信息表",description="发票信息表")
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
        Boolean flag = invoiceService.updateInvoice(ceShi);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.updateFail);
        }
    }

    @RequestMapping(path="/plist",method = RequestMethod.GET)
    @ApiOperation(value = "分页带条件查询")
    public RestResponse selectCeShiByExample(@ModelAttribute Invoice invoice, @RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "20") Integer pageSize){
        PageInfo p = invoiceService.selectInvoiceByExample(invoice,pageNo,pageSize);
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