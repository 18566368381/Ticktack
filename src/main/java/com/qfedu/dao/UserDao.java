package com.qfedu.dao;

import com.qfedu.pojo.LoginLog;
import com.qfedu.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by C on 2019/6/13.
 */
public interface UserDao {
     User findByName(String name);
    // 根据用户查询用户拥有的角色
     List<String> findRolesByName(String name);
    // 查询用户拥有的权限
     List<String> findPermsByName(String name);


    List<User> selectUser(User user);

    void deleteUser(String no);

    List<User> selectUserBy(Map map);

    void editUser(User user);
}
