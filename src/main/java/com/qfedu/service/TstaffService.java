package com.qfedu.service;

import com.qfedu.pojo.Tstaff;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/17.
 */
public interface TstaffService {
    //员工展示
    List<Tstaff> findAll();
    //员工修改
    void  updateStaff(Tstaff tstaff);
    //员工新增
    void insertStaff(Tstaff tstaff);
    //员工删除
    void deleteStaff(Integer no);
    //查询一个员工
    Tstaff findOne(Integer no);

}
