package com.sxt.config;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ConditionalOnClass(value = {PageHelper.class, MybatisAutoConfiguration.class})
//public class PageHelperAutoConfiguration {
//
//    @Bean
//    public PageInterceptor pageInterceptor(){
//        return new PageInterceptor();
//    }
//}
