package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.pojo.Leader;
import com.qfedu.pojo.Request;
import com.qfedu.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by C on 2019/6/19.
 */
@Controller
@ResponseBody
public class RequestController {
    @Autowired
    private RequestService requestService;
    @RequestMapping("/processadd.do")
    public CommonBean processadd(Request request, HttpSession session){
        request.setStartname((String)session.getAttribute("no"));
        request.setFlag(1);
        request.setTname(request.getInfo());
        requestService.insert(request);
        return new CommonBean(0,"提交成功",1000,null);
    }
    @RequestMapping("/processnolist.do")
    public CommonBean processlist(){
       List<Request> list =  requestService.processlist();
        return new CommonBean(0,"",1000,list);
    }
    @RequestMapping("/processupdate.do")
    public CommonBean update(Integer id,Integer logo){
        requestService.update(id,logo);
        return new CommonBean(1000,"",1000,null);
    }
    @RequestMapping("/processdel.do")
    public CommonBean del(Integer id){
        requestService.del(id);
        return new CommonBean(1000,"",1000,null);
    }


}
