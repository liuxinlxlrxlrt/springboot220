package com.sxt;

import com.sxt.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot9ProfilesApplicationTests {

	@Autowired
	private Teacher teacher;

	@Test
	void contextLoads() {
		System.out.println(teacher);
	}
}
