package com.qfedu.service;

import com.qfedu.pojo.Depart;

import java.util.List;

/**
 * Created by C on 2019/6/20.
 */
public interface DepartService {
    List<Depart> departpage();

    void delete(Integer id);

    void update(Depart depart);

    void add(Depart depart);
}
