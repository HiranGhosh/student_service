package com.hiranghosh.studentservice.service;

import com.hiranghosh.studentservice.entity.Student;
import com.hiranghosh.studentservice.repository.StudentRepository;
import com.hiranghosh.studentservice.request.CreateStudentRequest;
import com.hiranghosh.studentservice.response.StudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    StudentRepository studentRepository;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        Student student = new Student();
        student.setDepartment(createStudentRequest.getDepartment());
        student.setYearofstudy(createStudentRequest.getYearofStudy());
        student.setDob(createStudentRequest.getDob());
        studentRepository.save(student);
        return new StudentResponse(student);
    }
}
