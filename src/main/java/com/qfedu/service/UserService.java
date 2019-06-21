package com.qfedu.service;

import com.qfedu.pojo.LoginLog;
import com.qfedu.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by 张齐 on 2019/6/13.
 */
public interface UserService {

    List<User> selectUser(User user);

    void deleteUser(String no);

    List<User> selectUserBy(Map map);

    void editUser(User user);
}
