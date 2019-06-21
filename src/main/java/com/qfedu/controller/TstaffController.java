package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Tstaff;
import com.qfedu.service.TstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 张齐 on 2019/6/17.
 */
@Controller
@ResponseBody
public class TstaffController {
    @Autowired
    private TstaffService tstaffService;
    //员工展示
    @RequestMapping("/staffpage.do")
    public CommonBean list(){
        List<Tstaff> tstaff = tstaffService.findAll();
        System.out.println(tstaff);
        return  new CommonBean(0,"",1000,tstaff);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    //员工修改
    @RequestMapping("/staffupdate.do")
    public CommonBean update(Tstaff tstaff){
        System.out.println(tstaff);
        tstaffService.updateStaff(tstaff);
        return new CommonBean(1000,"",1000,null);
    }
    //员工添加
   @RequestMapping("/staffadd.do")
    public CommonBean add(Tstaff tstaff){
        System.out.println("进来了");
        System.out.println(tstaff);
        tstaffService.insertStaff(tstaff);
        return  new CommonBean(0,"",1000,null);
    }
    //员工删除
    @RequestMapping("/staffdelete.do")
    public CommonBean delete(Integer no){
        tstaffService.deleteStaff(no);
        return new CommonBean(1000,"",1000,null);

    }
    //查询一个员工
    @RequestMapping("/findone.do")
    public JsonBean findone(Integer no){
        Tstaff one = tstaffService.findOne(no);
        return new JsonBean(1,one);
    }

}
