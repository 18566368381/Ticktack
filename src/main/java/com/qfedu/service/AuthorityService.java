package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by C on 2019/6/18.
 */
public interface AuthorityService {
    List<Authority> getList();

    void delauthority(Integer id);

    void authorityadd(Authority authority);
}
