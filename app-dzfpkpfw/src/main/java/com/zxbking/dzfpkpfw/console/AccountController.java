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

@Api(value = "账号信息",description="账号信息")
@RestController
@RequestMapping("/rest/account")
public class AccountController extends AbstractRestController {

    @Autowired
    private AccountService accountService;


    @RequestMapping(path="",method = RequestMethod.PUT)
    @ApiOperation(value = "增加")
    public RestResponse addAccount(@RequestBody Account account) {
        Boolean flag = accountService.addAccount(account);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "通过id标识查找")
    public RestResponse findById(@PathVariable String id) {
        Account account = accountService.findById(id);
        if(account!=null){
            return  RestResponse.success(account);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping(path="/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "通过id标识删除")
    public RestResponse deleteCeShiById(@PathVariable String id) {
        Boolean flag = accountService.deleteAccountById(id);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.deleteFail);
        }
    }

    @RequestMapping(path="",method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public RestResponse updateCeShi(@RequestBody Account ceShi) {
        Boolean flag = accountService.updateAccount(ceShi);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.updateFail);
        }
    }

    @RequestMapping(path="/plist",method = RequestMethod.GET)
    @ApiOperation(value = "分页带条件查询")
    public RestResponse selectCeShiByExample(@ModelAttribute Account account, @RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "20") Integer pageSize){
        PageInfo p = accountService.selectAccountByExample(account,pageNo,pageSize);
        if(p!=null){
            return  RestResponse.success(p);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping(path="/list",method = RequestMethod.GET)
    @ApiOperation(value = "查询全部数据")
    public RestResponse selectAll(){
        List<Account> list = accountService.selectAll();
        if(list!=null){
            return  RestResponse.success(list);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }
}