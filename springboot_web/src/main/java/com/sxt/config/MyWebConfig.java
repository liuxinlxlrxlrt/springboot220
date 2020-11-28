package com.sxt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    /**
     * 注册静态资源地址
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 第一个参数：指的是url中的地址
         * 第二个参数：当匹配到这个url之后指定访问项目的静态资源,放在前面的优先级最高
         */
        registry.addResourceHandler("/test1/**").addResourceLocations("classpath:haolei2/","classpath:haolei/");
        registry.addResourceHandler("/test2/**").addResourceLocations("classpath:haolei/");
    }
}
