package com.qfedu.service;

import com.qfedu.pojo.Leader;
import com.qfedu.pojo.Request;

import java.util.List;

/**
 * Created by C on 2019/6/19.
 */
public interface RequestService {
    void insert(Request request);


    List<Request> processlist();

    void update(Integer id,Integer logo);

    void del(Integer id);
}
