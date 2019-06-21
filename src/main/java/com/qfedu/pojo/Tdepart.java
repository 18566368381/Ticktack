package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by 张齐 on 2019/6/17.
 */
public class Tdepart {
     private Integer id;
     private String name;
     private Date createtime;
     private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Tdepart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", flag=" + flag +
                '}';
    }
}
