package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by C on 2019/6/18.
 */
public interface AuthorityDao {
    List<Authority> getList();

    void delauthority(Integer id);

    void authorityadd(Authority authority);
}
