package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by C on 2019/6/20.
 */
@Controller
@ResponseBody
public class DepartController {
    @Autowired
    private DepartService departService;
    @RequestMapping("/departpage.do")
    public CommonBean departpage(){
       List<Depart> list =  departService.departpage();
        return new CommonBean(0,"",1000,list);
    }
    @RequestMapping("/departdelete.do")
    public CommonBean delete(Integer id){
        departService.delete(id);
        return new CommonBean(1000,"",1000,null);
    }
    @RequestMapping("/departupdate.do")
    public CommonBean update(Depart depart){
        departService.update(depart);
        return new CommonBean(1000,"",1000,null);
    }
    @RequestMapping("/departadd.do")
    public CommonBean add(Depart depart){
        departService.add(depart);
        return new CommonBean(1000,"",1000,null);
    }

}
