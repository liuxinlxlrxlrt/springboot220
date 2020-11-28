package com.sxt;

import com.sxt.domain.Man;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootAopApplicationTests {

	@Autowired
	private Man man;

	@Test
	void contextLoads() {
		man.eat("饭");
	}
}
