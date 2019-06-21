package com.qfedu.service.impl;

import com.qfedu.dao.LeaderDao;
import com.qfedu.pojo.Leader;
import com.qfedu.service.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by C on 2019/6/19.
 */
@Service
public class LeaderServiceImpl implements LeaderService {
    @Autowired
    private LeaderDao leaderDao;
    @Override
    public Leader[] leaderAll() {
        List<Leader> list = leaderDao.leaderAll();
        Leader[] array = list.toArray(new Leader[0]);
        return array;
    }
}
