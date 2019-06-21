package com.qfedu.service.impl;

import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by C on 2019/6/18.
 */
@Service
public class AuthorityServiceImpl implements AuthorityService{
    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public List<Authority> getList() {
        return authorityDao.getList();
    }

    @Override
    public void delauthority(Integer id) {
        authorityDao.delauthority(id);
    }

    @Override
    public void authorityadd(Authority authority) {
        authorityDao.authorityadd(authority);
    }
}
