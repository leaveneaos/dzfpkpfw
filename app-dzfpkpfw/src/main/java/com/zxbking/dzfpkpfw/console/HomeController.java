package com.zxbking.dzfpkpfw.console;

import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import com.zxbking.dzfpkpfw.base.AbstractRestController;
import com.zxbking.dzfpkpfw.config.SystemConfig;
import com.zxbking.dzfpkpfw.model.Account;
import com.zxbking.dzfpkpfw.model.UserInfo;
import com.zxbking.dzfpkpfw.service.AccountService;
import com.zxbking.dzfpkpfw.service.UserInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Api(value = "Home",description="Home")
@RestController
@RequestMapping("")
public class HomeController extends AbstractRestController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserInfoService userInfoService;
    /**
     * 查询svn用户
     */
    @RequestMapping(path="/login",method = RequestMethod.POST)
    public RestResponse login(String accountName,String password,HttpServletRequest request ) throws IOException {
        if(accountName == null || accountName.equals("")){
            return  RestResponse.failed(ApiReturnCodeEnum.Account17);
        }
        if(password == null || password.equals("")){
            return  RestResponse.failed(ApiReturnCodeEnum.Account13);
        }
        Account account = accountService.findAccountName(accountName);

        if(account!=null){
            if(account.getPassword().equals(password)){
                UserInfo user = userInfoService.findById(account.getId());
                request.getSession().setAttribute(SystemConfig.USER_NAME,user.getAccountId());
                return  RestResponse.success(user);
            }
        }
        return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
    }
}