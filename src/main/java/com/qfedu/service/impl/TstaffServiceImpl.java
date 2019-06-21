package com.qfedu.service.impl;

import com.qfedu.dao.TstaffDao;
import com.qfedu.pojo.Tstaff;
import com.qfedu.service.TstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/17.
 */
@Service
public class TstaffServiceImpl implements TstaffService {

    @Autowired
    private TstaffDao tstaffDao;


    @Override
    public List<Tstaff> findAll() {
        return tstaffDao.findAll();
    }

    @Override
    public void updateStaff(Tstaff tstaff) {
        tstaffDao.updateStaff(tstaff);
    }

    @Override
    public void insertStaff(Tstaff tstaff) {
        tstaffDao.insertStaff(tstaff);
    }

    @Override
    public void deleteStaff(Integer no) {
        tstaffDao.deleteStaff(no);
    }

    @Override
    public Tstaff findOne(Integer no) {
        return tstaffDao.findOne(no);
    }
}
