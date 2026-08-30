package com.hiranghosh.studentservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private long studentId;

    @Column(name = "department")
    private String department;

    @Column(name ="yearofstudy")
    private String yearofstudy;

    @Column(name = "dateofbirth")
    private LocalDate dob;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYearofstudy() {
        return yearofstudy;
    }

    public void setYearofstudy(String yearofstudy) {
        this.yearofstudy = yearofstudy;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
