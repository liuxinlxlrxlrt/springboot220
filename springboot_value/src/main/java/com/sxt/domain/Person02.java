package com.sxt.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
@ConfigurationProperties(prefix = "student")
//@Validated
public class Person02 {

    private Integer id;
    private String name;
    private String userName;
    private Integer age;
    private String[] hobbys;
    private List<String> lists;
    private Map<String,String> maps;
    private Set<String> sets;
    private Date birthday;
    @Email
    private String email;
}
