package com.bootdo.mytest.entity;

import java.util.Date;

public class MyTeacher {
    private int id;
    private String tname;
    private Date tage;
    private String tsex;
    private Date tstartdate;
    private Date tenddate;
    private int mid;
    private int tid;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getTage() {
        return tage;
    }

    public void setTage(Date tage) {
        this.tage = tage;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Date getTstartdate() {
        return tstartdate;
    }

    public void setTstartdate(Date tstartdate) {
        this.tstartdate = tstartdate;
    }

    public Date getTenddate() {
        return tenddate;
    }

    public void setTenddate(Date tenddate) {
        this.tenddate = tenddate;
    }

    @Override
    public String toString() {
        return "MyTeacher{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", tage=" + tage +
                ", tsex='" + tsex + '\'' +
                ", tstartdate=" + tstartdate +
                ", tenddate=" + tenddate +
                '}';
    }
}
