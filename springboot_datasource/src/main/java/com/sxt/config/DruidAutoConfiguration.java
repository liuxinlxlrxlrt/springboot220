package com.sxt.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Data
@Configuration
//加上包报错，找不到DruidDataSource.class所以注释掉
//@ConditionalOnBean(value = {DruidDataSource.class})
@ConfigurationProperties(prefix = "spring.datasource.web")
public class DruidAutoConfiguration {


    @Bean(initMethod = "init")
    @ConfigurationProperties(prefix = "spring.druid") //也可以用spring.datasource,spring.druid
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    private String urlMapping="/druid/*";
    private String loginUsername="root";
    private String loginPassword="lx@lx19870613";
    //多个ip地址：allow ="192.168.31.20,x.x.x.x"
    private String allow =""; //白名单：为空代表所有IP都可以访问
    private String deny =""; //黑名单

    /**
     * 配置监控页面
     */
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServletServletRegistrationBean(){
        //创建servlet
        StatViewServlet servlet = new StatViewServlet();
        //创建注册器
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>();
        //注入servlet
        registrationBean.setServlet(servlet);
        //注入url
        registrationBean.addUrlMappings(urlMapping);
        //注入属性
        Map<String,String> initParams= new HashMap<>();
        initParams.put("loginUsername",loginUsername);
        initParams.put("loginPassword",loginPassword);
        initParams.put("allow",allow);
        initParams.put("deny",deny);
        registrationBean.setInitParameters(initParams);

        return registrationBean;
    }

    /**
     * 设置过滤器
     */
    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        WebStatFilter webStatFilter = new WebStatFilter();
        filterRegistrationBean.setFilter(webStatFilter);
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        filterRegistrationBean.setInitParameters(initParams);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}
