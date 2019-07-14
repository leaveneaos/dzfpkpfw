package com.zxbking.dzfpkpfw.console;

import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.alyxjs.wfw.component.cache.redis.RedisCacheService;
import com.ihyht.commons.lang.JsonUtils;
import com.ihyht.commons.lang.model.RestResponse;
import com.zxbking.dzfpkpfw.base.AbstractRestController;
import com.zxbking.dzfpkpfw.config.SystemConfig;
import com.zxbking.dzfpkpfw.model.Account;
import com.zxbking.dzfpkpfw.model.UserInfo;
import com.zxbking.dzfpkpfw.service.AccountService;
import com.zxbking.dzfpkpfw.service.UserInfoService;
import io.swagger.annotations.Api;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Api(value = "Home",description="Home")
@RestController
@RequestMapping("")
public class HomeController extends AbstractRestController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private RedisCacheService redisCacheService;
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

                List<Account> list1 = accountService.selectAll();
                Map<String,String> map1 = new HashMap<>();
                if(list1!=null){
                    for (int i = 0; i <list1.size() ; i++) {
                        map1.put(list1.get(i).getId(),list1.get(i).getAccountName());
                    }
                }
                List<UserInfo> list2 = userInfoService.selectAll();
                Map<String,String> map2 = new HashMap<>();
                if(list2!=null){
                    for (int i = 0; i <list2.size() ; i++) {
                        map2.put(list2.get(i).getAccountId(),list2.get(i).getUserName());
                    }
                }
                Map<String,String> map3 = new HashedMap();
                for (Map.Entry<String, String> entry : map1.entrySet()) {
                    map3.put(map1.get(entry.getKey()),map2.get(entry.getKey()));
                }
                redisCacheService.set(SystemConfig.USER_NAME+user.getAccountId(), JsonUtils.obj2String(map3));
                return  RestResponse.success(user);
            }
        }
        return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
    }
}