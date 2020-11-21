package com.sxt;

import com.sxt.domain.Student;
import com.sxt.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot2configApplicationTests {

	@Autowired
	private Student student;

	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(student);
		System.out.println(person);
	}
}
