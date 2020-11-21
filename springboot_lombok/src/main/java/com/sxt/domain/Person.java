package com.sxt.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
@ConfigurationProperties(prefix = "student")
public class Person {
    private Integer id;
    private String name;
    private String[] hobbys;
    private List<String> lists;
    private Map<String,String> maps;
    private Set<String> sets;
    private Integer age;
    private Date birthday;

}
