package com.hiranghosh.studentservice.controller;

import com.hiranghosh.studentservice.request.CreateStudentRequest;
import com.hiranghosh.studentservice.response.StudentResponse;
import com.hiranghosh.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        return studentService.createStudent(createStudentRequest);
    }
}
