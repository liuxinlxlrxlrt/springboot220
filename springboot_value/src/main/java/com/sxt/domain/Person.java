package com.sxt.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
//@ConfigurationProperties(prefix = "student")
public class Person {
//    @Value("${a}")
    @Value("${student.id}")
    private Integer id;
    @Value("${student.name}")
    private String name;
    @Value("${student.user-name}")
    private String userName;
    @Value("${student.age}")//占位符
    private Integer age;
//    @Value("${student.hobbys}")不支持
    private String[] hobbys;
//    @Value("${student.lists}")不支持
    private List<String> lists;
//    @Value("${student.maps}")不支持
    private Map<String,String> maps;
//    @Value("${student.sets}")不支持
    private Set<String> sets;
    @Value("${student.birthday}")
    private Date birthday;

}
