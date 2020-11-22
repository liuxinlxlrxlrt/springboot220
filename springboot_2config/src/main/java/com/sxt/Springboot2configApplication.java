package com.sxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(value = {"classpath:beans.xml"})
public class Springboot2configApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2configApplication.class, args);
	}

}
