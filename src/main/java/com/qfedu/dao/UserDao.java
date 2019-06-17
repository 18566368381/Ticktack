package com.qfedu.dao;

import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by C on 2019/6/13.
 */
public interface UserDao {
     User findByName(String name);
    // 根据用户查询用户拥有的角色
     List<String> findRolesByName(String name);
    // 查询用户拥有的权限
     List<String> findPermsByName(String name);

}
