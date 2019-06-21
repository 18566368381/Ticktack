package com.qfedu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 张齐 on 2019/6/20.
 */
public class Tstudent {
    private String no;
    private String name;
    private Integer gid;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String cardno;
    private String school;
    private String education;
    private Integer flag;
    private String email;
    private  String qq;
    private  String phone;
    private String introno;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    private Tgrade tgrade;

    @Override
    public String toString() {
        return "Tstudent{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", gid=" + gid +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", cardno='" + cardno + '\'' +
                ", school='" + school + '\'' +
                ", education='" + education + '\'' +
                ", flag=" + flag +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", introno='" + introno + '\'' +
                ", createdate=" + createdate +
                ", tgrade=" + tgrade +
                '}';
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Tgrade getTgrade() {
        return tgrade;
    }

    public void setTgrade(Tgrade tgrade) {
        this.tgrade = tgrade;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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

    public String getIntrono() {
        return introno;
    }

    public void setIntrono(String introno) {
        this.introno = introno;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
