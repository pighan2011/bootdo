package com.bootdo.mytest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MClass {
    private int id;
    private String testInput;
    private String testSort;
    private String testTextarea;
    private String testSelect;
    private String testSelectMultiple;
    private String testRadio;
    private String testCheckbox;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date testDate;
    private int mid;
    private int tid;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestInput() {
        return testInput;
    }

    public void setTestInput(String testInput) {
        this.testInput = testInput;
    }

    public String getTestSort() {
        return testSort;
    }

    public void setTestSort(String testSort) {
        this.testSort = testSort;
    }

    public String getTestTextarea() {
        return testTextarea;
    }

    public void setTestTextarea(String testTextarea) {
        this.testTextarea = testTextarea;
    }

    public String getTestSelect() {
        return testSelect;
    }

    public void setTestSelect(String testSelect) {
        this.testSelect = testSelect;
    }

    public String getTestSelectMultiple() {
        return testSelectMultiple;
    }

    public void setTestSelectMultiple(String testSelectMultiple) {
        this.testSelectMultiple = testSelectMultiple;
    }

    public String getTestRadio() {
        return testRadio;
    }

    public void setTestRadio(String testRadio) {
        this.testRadio = testRadio;
    }

    public String getTestCheckbox() {
        return testCheckbox;
    }

    public void setTestCheckbox(String testCheckbox) {
        this.testCheckbox = testCheckbox;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    @Override
    public String toString() {
        return "MClass{" +
                "id=" + id +
                "tid=" + tid +
                ", testInput='" + testInput + '\'' +
                ", testSort='" + testSort + '\'' +
                ", testTextarea='" + testTextarea + '\'' +
                ", testSelect='" + testSelect + '\'' +
                ", testSelectMultiple='" + testSelectMultiple + '\'' +
                ", testRadio='" + testRadio + '\'' +
                ", testCheckbox='" + testCheckbox + '\'' +
                ", testDate='" + testDate + '\'' +
                '}';
    }
}
