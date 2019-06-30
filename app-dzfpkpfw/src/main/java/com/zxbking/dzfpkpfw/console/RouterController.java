package com.zxbking.dzfpkpfw.console;

import com.ihyht.commons.lang.StringUtils;
import com.zxbking.dzfpkpfw.base.AbstractRestController;
import com.zxbking.dzfpkpfw.config.SystemConfig;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Api(value = "Home",description="Home")
@Controller
@RequestMapping("")
public class RouterController extends AbstractRestController {

    /**
     * 首页
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(HttpServletRequest request){
        String username = (String) request.getSession().getAttribute(SystemConfig.USER_NAME);
        if(StringUtils.isNotEmpty(username)){
            return "index";
        }else{
            return "login";
        }

    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute(SystemConfig.USER_NAME);
        return "login";
    }

}