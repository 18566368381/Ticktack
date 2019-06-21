package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Tcourse;
import com.qfedu.service.TcourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/18.
 */
@RestController
public class TcourseController {
    @Autowired
    private TcourseService tcourseService;

    @RequestMapping("/coursepage.do")
    public CommonBean findAll(){
        List<Tcourse> tcourse = tcourseService.findAll();
        System.out.println(tcourse);
        return new CommonBean(0,"",1000,tcourse);
    }
    //学科删除
    @RequestMapping("/coursedelete.do")
    public  CommonBean deleteOne(Integer id){
        tcourseService.deleteOne(id);
        return  new CommonBean(1000,"",1000,null);
    }
    //学科修改
    @RequestMapping("/courseupdate.do")
    public  CommonBean update(Tcourse tcourse){
        tcourseService.updateOne(tcourse);
        System.out.println("进来了");
        System.out.println(tcourse);
        return  new CommonBean(1000,"",1000,null);
    }

    //学科新增
    @RequestMapping("/courseadd.do")
    public  CommonBean addCourse(Tcourse tcourse){
        tcourseService.addOne(tcourse);
        return  new CommonBean(1000,"",1000,null);
    }


}
