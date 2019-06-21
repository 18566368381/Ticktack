package com.qfedu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 张齐 on 2019/6/19.
 */
public class Tgrade {
    private Integer id;
    private  String name;
    private Integer flag;
    private Integer week;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    private String location;
    private Integer count;
    private String gname;

    @Override
    public String toString() {
        return "Tgrade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", week=" + week +
                ", createdate=" + createdate +
                ", location='" + location + '\'' +
                ", count=" + count +
                ", gname='" + gname + '\'' +
                '}';
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




}
