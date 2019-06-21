package com.qfedu.service;

import com.qfedu.pojo.Tstudent;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/20.
 */
public interface TstudentService {
    List<Tstudent> findAll();
    void addOne(Tstudent tstudent);
}
