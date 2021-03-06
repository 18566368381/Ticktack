package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.LoginLog;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by 张齐 on 2019/6/13.
 */
@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/login.do")
    public JsonBean login(String no, String password, HttpSession session){

        session.setAttribute("no",no);
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
    @RequestMapping("/userall.do")
    public CommonBean selectUser(User user){
        List<User> list = userService.selectUser(user);
        return new CommonBean(0,"",1000,list);
    }
    @RequestMapping("/userdel.do")
    public CommonBean deleteUser(String no){
        userService.deleteUser(no);
        return new CommonBean(0,"删除成功",1000,null);
    }
    @RequestMapping("/selectUser.do")
    public JsonBean selectUser(String no,Integer flag){
        Map map = new HashMap();
        map.put("no",no);
        map.put("flag",flag);
        List<User> list = userService.selectUserBy(map);
        return new JsonBean(1,list);
    }
    @RequestMapping("/userroleedit.do")
    public CommonBean editUser(User user){
        userService.editUser(user);
        return new CommonBean(0,"编辑成功",1000,null);
    }



}
