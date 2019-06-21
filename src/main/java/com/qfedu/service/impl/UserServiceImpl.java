package com.qfedu.service.impl;

import com.qfedu.common.JsonBean;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.LoginLog;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 张齐 on 2019/6/13.
 */
@Service
public class
UserServiceImpl  implements UserService{
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> selectUser(User user) {
        return userDao.selectUser(user);
    }

    @Override
    public void deleteUser(String no) {
        userDao.deleteUser(no);
    }

    @Override
    public List<User> selectUserBy(Map map) {
        return userDao.selectUserBy(map);
    }

    @Override
    public void editUser(User user) {
        userDao.editUser(user);
    }
}
