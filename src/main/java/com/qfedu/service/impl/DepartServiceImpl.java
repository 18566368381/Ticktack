package com.qfedu.service.impl;

import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by C on 2019/6/20.
 */
@Service
public class DepartServiceImpl implements DepartService{
    @Autowired
    private DepartDao departDao;

    @Override
    public List<Depart> departpage() {
        return departDao.departpage();
    }

    @Override
    public void delete(Integer id) {
        departDao.delete(id);
    }

    @Override
    public void update(Depart depart) {
        departDao.update(depart);
    }

    @Override
    public void add(Depart depart) {
        departDao.add(depart);
    }
}
