package com.bootdo.mytest.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    private int id;
    private String xname;
    private String age;
    private int deptId;
    private String deptName;

    private String  mclass;
    private String map;
    private String  myteacher;
    private String tmap;

    public String getMyteacher() {
        return myteacher;
    }

    public void setMyteacher(String myteacher) {
        this.myteacher = myteacher;
    }

    public String getTmap() {
        return tmap;
    }

    public void setTmap(String tmap) {
        this.tmap = tmap;
    }

    public String getMclass() {
        return mclass;
    }

    public void setMclass(String mclass) {
        this.mclass = mclass;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "id=" + id +
                ", xname='" + xname + '\'' +
                ", age='" + age + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", mclass=" + mclass +
                ", map=" + map +
                '}';
    }
}
