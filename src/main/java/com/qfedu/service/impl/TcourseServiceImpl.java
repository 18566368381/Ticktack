package com.qfedu.service.impl;

import com.qfedu.dao.TcourseDao;
import com.qfedu.pojo.Tcourse;
import com.qfedu.service.TcourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/18.
 */
@Service
public class TcourseServiceImpl implements TcourseService {
    @Autowired
    private TcourseDao tcourseDao;

    @Override
    public List<Tcourse> findAll() {
        return tcourseDao.findAll();
    }

    @Override
    public void deleteOne(Integer id) {
        tcourseDao.deleteOne(id);
    }

    @Override
    public void updateOne(Tcourse tcourse) {
        tcourseDao.updateOne(tcourse);
    }

    @Override
    public void addOne(Tcourse tcourse) {
        tcourseDao.addOne(tcourse);
    }
}
