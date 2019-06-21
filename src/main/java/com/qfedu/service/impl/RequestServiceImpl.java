package com.qfedu.service.impl;

import com.qfedu.dao.RequestDao;
import com.qfedu.pojo.Leader;

import com.qfedu.pojo.Request;
import com.qfedu.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by C on 2019/6/19.
 */
@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private RequestDao requestDao;

    @Override
    public void insert(Request request) {
        requestDao.insert(request);
    }

    @Override
    public List<Request> processlist() {
        return requestDao.processlist();
    }

    @Override
    public void update(Integer id,Integer logo) {
        Request request = new Request();
        request.setId(id);
        if(logo!=null&&!"".equals(logo)){
            request.setFlag(2);
        }else{
            request.setFlag(3);
        }

        requestDao.update(request);
    }

    @Override
    public void del(Integer id) {
        requestDao.del(id);
    }


}
