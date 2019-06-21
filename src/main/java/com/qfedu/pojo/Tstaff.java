package com.qfedu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 张齐 on 2019/6/17.
 */
public class Tstaff {
   private  Integer  no;
   private String name;
   private Integer did;
   private Integer flag;
   private String sex;
   private String email;
   private String qq;
   private String phone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date createdate;
    private String photo;
    private Tdepart tdepart;

    public Tstaff (){
        super();
    }

    public Tstaff(Integer no, String name, Integer did, Integer flag, String sex, String email, String qq, String phone, Date createdate, String photo) {
        this.no = no;
        this.name = name;
        this.did = did;
        this.flag = flag;
        this.sex = sex;
        this.email = email;
        this.qq = qq;
        this.phone = phone;
        this.createdate = createdate;
        this.photo = photo;

    }

    public Tdepart getTdepart() {
        return tdepart;
    }

    public void setTdepart(Tdepart tdepart) {
        this.tdepart = tdepart;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Tstaff{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", did=" + did +
                ", flag=" + flag +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", createdate=" + createdate +
                ", photo='" + photo + '\'' +
                ", tdepart=" + tdepart +
                '}';
    }
}
