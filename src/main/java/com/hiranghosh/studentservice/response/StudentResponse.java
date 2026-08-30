package com.hiranghosh.studentservice.response;

import com.hiranghosh.studentservice.entity.Student;

import java.time.LocalDate;

public class StudentResponse {

    private long studentId;
    private String department;
    private String yearofstudy;
    private LocalDate dob;

    public StudentResponse(Student student){
        this.studentId = student.getStudentId();
        this.department = student.getDepartment();
        this.yearofstudy = student.getYearofstudy();
        this.dob = student.getDob();
    }
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
