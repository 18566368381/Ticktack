package com.qfedu.pojo;

/**
 * Created by C on 2019/6/18.
 */
public class Authority {
    private Integer id;
    private String pname;
    private String pdesc;
    private Integer ptype;
    private Integer parentid;
    private String aurl;
    private String icon;

    public String getAurl() {
        return aurl;
    }

    public void setAurl(String aurl) {
        this.aurl = aurl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
