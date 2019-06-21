package com.qfedu.service.impl;

import com.qfedu.dao.TstudentDao;
import com.qfedu.pojo.Tstudent;
import com.qfedu.service.TstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/20.
 */
@Service
public class TstudentServiceImpl implements TstudentService{
    @Autowired
    private TstudentDao tstudentDao;
    @Override
    public List<Tstudent> findAll() {
        return tstudentDao.findAll();
    }

    @Override
    public void addOne(Tstudent tstudent) {
        tstudentDao.addOne(tstudent);
    }
}
