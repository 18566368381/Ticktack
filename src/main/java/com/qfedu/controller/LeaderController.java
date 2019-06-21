package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.pojo.Leader;
import com.qfedu.service.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by C on 2019/6/19.
 */
@Controller
@ResponseBody
public class LeaderController {
    @Autowired
    private LeaderService leaderService;
    @RequestMapping("/leaderall.do")
    public Leader[] selectLeader(){
        Leader[] leaderArr =  leaderService.leaderAll();
        return leaderArr;
    }
}
