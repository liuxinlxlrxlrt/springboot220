package com.sxt.config;

import com.sxt.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {

    @Bean("teacher01")
    public Teacher getTeacher1(){
        return new Teacher(2,"关芯",25);
    }

    @Bean("teacher02")
    public Teacher getTeacher2(){
        return new Teacher(3,"杨祺如",23);
    }

    /**
     *
     * Teacher teacher 形式参数等价于 @Autowired Teacher teacher
     * 默认添加上 @Autowired
     * @return
     */
    @Bean("teacher03")
    public Teacher getTeacher3(@Autowired @Qualifier("teacher02") Teacher teacher){

        teacher.setAge(22);
        return teacher;
    }
}
