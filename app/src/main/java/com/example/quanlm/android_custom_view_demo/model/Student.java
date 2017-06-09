package com.example.quanlm.android_custom_view_demo.model;

/**
 * Created by QuanLM on 6/9/2017.
 */

public class Student {
    String rollNo;
    String fullName;
    String email;

    public Student(String rollNo, String fullName, String email) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
