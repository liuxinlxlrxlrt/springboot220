package com.sxt.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String name;

    private String address;

    /**
     * @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss"):
     * 此为Spring框架提供的注解：将JSON格式的日期信息信息解析转换并绑定到Date对象中，
     * 该注解用于Date字段即可，同时指定JSON日期的格式(pattern)
     *
     *@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTM+8")
     * 此为 Jackson 框架提供的注解，将Date对象数据解析转换为JSON格式，
     * 该注解用于Date字段即可，同时指定期望JSON日期的格式(pattern)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTM+8")
    private Date birthday;

}