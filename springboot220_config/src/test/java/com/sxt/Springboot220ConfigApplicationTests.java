package com.sxt;

import com.sxt.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot220ConfigApplicationTests {

	//默认是根据type注入
	@Autowired
	@Qualifier("user1") //合格者
	private User user;

	@Test
	void contextLoads() {
		System.out.println(user);
	}

}
