package com.qfedu.service.impl;

import com.qfedu.dao.TgradeDao;
import com.qfedu.pojo.Tgrade;
import com.qfedu.service.TgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/19.
 */
@Service
public class TgradeServiceImpl implements TgradeService {
    @Autowired
    private TgradeDao tgradeDao;


    @Override
    public List<Tgrade> findAll() {
        return tgradeDao.findAll();
    }

    @Override
    public void deleteOne(Integer id) {
        tgradeDao.deleteOne(id);
    }

    @Override
    public void addOne(Tgrade tgrade) {
        tgradeDao.addOne(tgrade);
    }

    @Override
    public void update(Tgrade tgrade) {
        tgradeDao.update(tgrade);
    }
}
