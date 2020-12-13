package com.sxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//只要接口被扫描，接口就会被mybatis创建代理对象
@MapperScan(basePackages = {"com.sxt.dao"}) //添加此注解
@EnableTransactionManagement  //开启事务注解
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}
}
