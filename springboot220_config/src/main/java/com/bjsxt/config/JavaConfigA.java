package com.bjsxt.config;

import com.sxt.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //相当于application-a.xml
public class JavaConfigA {

    /**
     * @Bean //相当于id = "user" class="com.sxt.domain.User"/>
     * new User("1","小明","武汉");相当于配置属性
     * @return
     */
    @Bean("user1") //相当于id = "user" class="com.sxt.domain.User"/>
    public User getUser1(){
        return  new User(1,"小明","武汉");
    }
}
