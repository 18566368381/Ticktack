package com.qfedu.service.impl;

import com.qfedu.dao.LoginLogDao;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by C on 2019/6/17.
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Autowired
    private LoginLogDao loginLogDao;

    @Override
    public List<LoginLog> loginLogList() {
        return loginLogDao.loginLogList();
    }
}
