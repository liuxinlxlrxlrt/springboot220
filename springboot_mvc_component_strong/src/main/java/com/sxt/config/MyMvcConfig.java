package com.sxt.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {

    /**
     * 1.在容器中注册视图解析器
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/index/hello").setViewName("classpath:templates/hello.html");
        registry.addViewController("index/hello").setViewName("hello");
    }

    /**
     * 注册格式化器
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new Formatter<Date>() {
            @Override
            public String print(Date date, Locale locale) {
                return null;
            }

            /**
             *注册格式化器
             * @param s
             * @param locale
             * @return
             * @throws ParseException
             */
            @Override
            public Date parse(String s, Locale locale) throws ParseException {
                System.out.println(s+"-----------------");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return dateFormat.parse(s);
            }
        });
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //定义一个convert 转换消息的对象
        HttpMessageConverter converter=new FastJsonHttpMessageConverter();
        // 2 添加fastjson 的配置信息 比如 是否要格式化 返回的json数据
        FastJsonConfig config = new FastJsonConfig();
        //设置序列化的值
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        ((FastJsonHttpMessageConverter) converter).setFastJsonConfig(config);
        converters.add(converter);
    }

    /**
     * 拦截器注册
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建拦截器对象
        MyIntercptor intercptor = new MyIntercptor();

        //注册
        registry.addInterceptor(intercptor)
        //设置拦截器,所有路径都被拦截
        .addPathPatterns("/**")
                //添加不拦截路径
                .excludePathPatterns("/index/hello");
    }
}
