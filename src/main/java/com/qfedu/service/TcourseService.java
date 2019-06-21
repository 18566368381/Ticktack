package com.qfedu.service;

import com.qfedu.pojo.Tcourse;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/18.
 */
public interface TcourseService {
    List<Tcourse> findAll();
    void deleteOne(Integer id);
    void updateOne(Tcourse tcourse);
    void addOne(Tcourse tcourse);
}
