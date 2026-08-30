package com.hiranghosh.studentservice.request;

import java.time.LocalDate;

public class CreateStudentRequest {

    private String department;
    private String yearofStudy;
    private LocalDate dob;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYearofStudy() {
        return yearofStudy;
    }

    public void setYearofStudy(String yearofStudy) {
        this.yearofStudy = yearofStudy;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
