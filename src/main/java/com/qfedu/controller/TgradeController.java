package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.pojo.Tgrade;
import com.qfedu.service.TgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/19.
 */
@RestController
public class TgradeController {
    @Autowired
    private TgradeService tgradeService;

    @RequestMapping("/gradepage.do")
    public CommonBean findAll(){
        List<Tgrade> tgrade = tgradeService.findAll();
        System.out.println(tgrade);
        return new CommonBean(0,"",1000,tgrade);
    }

    @RequestMapping("/gradedelete.do")
    public  CommonBean deleteOne(Integer id){
        tgradeService.deleteOne(id);
        return new CommonBean(1000,"",1000,null);

    }
    @RequestMapping("/gradeadd.do")
    public CommonBean add(Tgrade tgrade){
        tgradeService.addOne(tgrade);
        return new CommonBean(1000,"",1000,null);


    }
    @RequestMapping("/gradeupdate.do")
    public CommonBean update(Tgrade tgrade){
        tgradeService.update(tgrade);
        return new CommonBean(1000,"",1000,null);

    }
}
