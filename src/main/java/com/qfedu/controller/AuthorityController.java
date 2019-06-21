package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by C on 2019/6/18.
 */
@Controller
@ResponseBody
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;
    @RequestMapping("/authoritylist.do")
    public CommonBean getList(){
        List<Authority> list = authorityService.getList();
        return new CommonBean(0,"",1000,list);
    }
    @RequestMapping("/delauthority.do")
    public CommonBean delauthority(Integer id){
        authorityService.delauthority(id);
        return new CommonBean(1000,"",1000,null);
    }
    @RequestMapping("/authorityadd.do")
    public CommonBean authorityadd(Authority authority){
        authorityService.authorityadd(authority);
        return new CommonBean(1000,"",1000,null);
    }
}
