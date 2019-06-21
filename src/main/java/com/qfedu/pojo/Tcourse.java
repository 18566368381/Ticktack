package com.qfedu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 张齐 on 2019/6/18.
 */
public class Tcourse {
   private Integer  id;
   private String name;
   private Integer flag;
   private Integer  week;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date createdate;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tcourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", week=" + week +
                ", createdate=" + createdate +
                ", type=" + type +
                '}';
    }
}
