package com.sxt.config;


import com.sxt.domain.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TeacherConfig {

    @Bean
    @Profile(value = "dev") //相当于一个条件，在测试开发环境生效
    public Teacher getTeacher1() {
        return new Teacher(1, "关芯", 22);
    }

    @Bean
    @Profile(value = "pro")//在生产环境生效
    public Teacher getTeacher2() {
        return new Teacher(2, "杨祺如", 23);
    }

//    @Bean  //不加就是任何环境都会生效
//    public Teacher getTeacher3() {
//        return new Teacher(3, "单依纯", 20);
//    }
}
