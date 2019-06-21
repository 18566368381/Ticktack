package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.pojo.Tstudent;
import com.qfedu.service.TstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/20.
 */
@RestController
public class TstudentController {
    @Autowired
    private TstudentService tstudentService;
    @RequestMapping("/studentpage.do")
    public CommonBean findAll(){
        List<Tstudent> student = tstudentService.findAll();
        System.out.println(student);
        return new CommonBean(0,"",1000,student);

    }

    @RequestMapping("/studentadd.do")
    public CommonBean add(Tstudent tstudent){
        tstudentService.addOne(tstudent);
        return new CommonBean(1000,"",1000,null);
    }

}
