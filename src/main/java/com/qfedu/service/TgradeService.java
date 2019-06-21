package com.qfedu.service;

import com.qfedu.pojo.Tgrade;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/19.
 */
public interface TgradeService {
    List<Tgrade> findAll();
    void deleteOne(Integer id);
    void addOne(Tgrade tgrade);
    void update(Tgrade tgrade);
}
