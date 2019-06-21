package com.qfedu.controller;

import com.qfedu.common.CommonBean;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by C on 2019/6/17.
 */
@Controller
@ResponseBody
public class LoginLogController {
    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping("/loginloglist.do")
    public CommonBean loginLogList(){
        List<LoginLog> list = loginLogService.loginLogList();

        return new CommonBean(0,"",1000,list);

    }
}
