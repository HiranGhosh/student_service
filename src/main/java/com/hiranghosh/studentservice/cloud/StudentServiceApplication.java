package com.hiranghosh.studentservice.cloud;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.hiranghosh.studentservice.controller", "com.hiranghosh.studentservice.service"})
@EntityScan("com.hiranghosh.studentservice.entity")
@EnableJpaRepositories("com.hiranghosh.studentsetvice.repository")
public class StudentServiceApplication {

    public static void main(String[] args){

        SpringApplication.run(StudentServiceApplication.class, args);
    }
}
