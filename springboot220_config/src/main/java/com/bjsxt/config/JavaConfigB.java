package com.bjsxt.config;

import com.sxt.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigB {

    @Bean("user2")
    public User getUser2(){
        return  new User(1,"小明","武汉");
    }
}
