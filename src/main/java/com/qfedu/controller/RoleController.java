package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
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
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/rolepage.do")
    public CommonBean roleList(Role role){
       List<Role> list =  roleService.roleList(role);
        return  new CommonBean(0,"",1000,list);
    }
}
