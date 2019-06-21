package com.qfedu.dao;

import com.qfedu.pojo.Leader;
import com.qfedu.pojo.Request;

import java.util.List;

/**
 * Created by C on 2019/6/19.
 */
public interface RequestDao {
    void insert(Request request);


    List<Request> processlist();

    void update(Request request);

    void del(Integer id);
}
