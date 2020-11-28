package com.sxt;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootWebApplication.class, args);
		SpringApplication application = new SpringApplication(SpringbootWebApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);

	}

}
