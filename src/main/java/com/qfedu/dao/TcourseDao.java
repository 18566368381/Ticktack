package com.qfedu.dao;

import com.qfedu.pojo.Tcourse;

import java.util.List;

/**
 * Created by 张齐 on 2019/6/18.
 */
public interface TcourseDao {
    List<Tcourse> findAll();
    //删除一个
    void deleteOne(Integer id);
    //修改一个
    void updateOne(Tcourse tcourse);
    //添加一个
    void addOne(Tcourse tcourse);

}
