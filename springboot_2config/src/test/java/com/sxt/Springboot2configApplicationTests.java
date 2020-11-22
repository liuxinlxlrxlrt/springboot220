package com.sxt;

import com.sxt.domain.Student;
import com.sxt.domain.Person;
import com.sxt.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot2configApplicationTests {

	@Autowired
	private Student student;

	@Autowired
	private Person person;

	@Autowired
	@Qualifier("teacher03")
	private Teacher teacher;

	@Test
	void contextLoads() {
//		System.out.println(student);
//		System.out.println(person);
		System.out.println(teacher);
	}
}
