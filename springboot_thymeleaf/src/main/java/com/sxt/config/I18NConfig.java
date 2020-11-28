package com.sxt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class I18NConfig {
    @Bean
    public ResourceBundleMessageSource messageSource(){
        //创建资源绑定的信息源
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        //配置可使用编码访问
        messageSource.setUseCodeAsDefaultMessage(true);
        //禁用系统环境变量，禁止去本机系统的属性值
        messageSource.setFallbackToSystemLocale(false);
        //设置资源文件有前缀
        messageSource.setBasename("application");
        messageSource.setDefaultEncoding("UTF-8");
        //设置缓存时间
        messageSource.setCacheSeconds(2);
        return messageSource;
    }
}
