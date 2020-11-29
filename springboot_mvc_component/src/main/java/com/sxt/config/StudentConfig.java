package com.sxt.config;

import com.sxt.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setAge(22);
        return student;
    }
}
