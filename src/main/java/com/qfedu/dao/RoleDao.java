package com.qfedu.dao;

import com.qfedu.pojo.Role;

import java.util.List;

/**
 * Created by C on 2019/6/18.
 */
public interface RoleDao {
    List<Role> roleList(Role role);

}
