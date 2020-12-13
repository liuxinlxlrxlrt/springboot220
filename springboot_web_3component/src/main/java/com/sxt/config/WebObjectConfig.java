package com.sxt.config;

import com.sxt.filter.MyFilter;
import com.sxt.listener.MyListener;
import com.sxt.servlet.UserServlet;
import lombok.Data;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collection;

@Configuration
@Data
@ConfigurationProperties(prefix = "myweb")
public class WebObjectConfig {

    /*****************servlet开始****************************************/
    private static final String USER_SERVLET_NAME = "userServlet";



    //可变参数

    private String[] servletUrl;


    /**
     * 创建servlet对象
     *
     * @return
     */
    @Bean(name = USER_SERVLET_NAME)
    public UserServlet getUserServlet() {
        return new UserServlet();
    }

    @Bean
    @ConditionalOnBean(value = UserServlet.class, name = USER_SERVLET_NAME)
    public ServletRegistrationBean<UserServlet> servletRegistrationBeanUserServlet(UserServlet userServlet) {
        //创建一个注册器
        ServletRegistrationBean<UserServlet> registrationBean = new ServletRegistrationBean<>();
        //注入servlet
        registrationBean.setServlet(userServlet);
        //注入url-patten
//        registrationBean.addUrlMappings("/user.do","/user.action");
        registrationBean.addUrlMappings(servletUrl);
        //注入参数
        registrationBean.addInitParameter("env", "UTF-8");
        //设置启动时加载
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }
    /*****************servlet结束****************************************/

    /*****************filter开始****************************************/
    private static final String MYFILTER_NAME = "myfilter";

    /**
     * 创建filter对象
     */
    @Bean(name = MYFILTER_NAME)
    public MyFilter myFilter() {
        return new MyFilter();
    }

    @Bean
    @ConditionalOnBean(value = MyFilter.class, name = MYFILTER_NAME)
    public FilterRegistrationBean<MyFilter> filterFilterRegistrationBean(MyFilter myFilter) {
        //创建一个注册器
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        //注入filter
        registrationBean.setFilter(myFilter);
        //注入url-patten
        Collection<String> urlPatterns = new ArrayList<>();
        ((ArrayList<String>) urlPatterns).add("/*");
        registrationBean.setUrlPatterns(urlPatterns);
//        registrationBean.setServletNames(servletNames);
        //注入参数
        registrationBean.addInitParameter("env", "GBK");
        return registrationBean;
    }
    /*****************filter结束****************************************/

    /*****************listener开始****************************************/
    private static final String MYLISTENER_NAME = "mylistener";

    @Bean(value = MYLISTENER_NAME)
    public MyListener myListener() {
        return new MyListener();
    }

    @Bean
    @ConditionalOnBean(value = MyListener.class,name = MYFILTER_NAME)
    public ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean(MyListener myListener){
        //创建一个注册器
        ServletListenerRegistrationBean<MyListener> listenerRegistrationBean = new ServletListenerRegistrationBean<>();
        //注入listener
        listenerRegistrationBean.setListener(myListener);

        return listenerRegistrationBean;

    }

    /*****************listener结束***************************************/
}
