package com.sxt.config;

import com.sxt.domain.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @ConfigurationProperties(prefix = "student") //设置属性
    @Bean
    public Student getStu(){
        return new Student();
    }
}
