package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 张齐 on 2019/6/13.
 */
@Controller
@ResponseBody
public class UserController {


    @RequestMapping("/login.do")
    public JsonBean login(String no,String password){
        UsernamePasswordToken token = new UsernamePasswordToken(no,password);
        Subject subject = SecurityUtils.getSubject();
        //设置记住我
        try {
            subject.login(token);
            return new JsonBean(1,"登陆成功");
        }catch (Exception e){
            e.printStackTrace();
            return new JsonBean(0,"登陆失败");
        }


    }

}
