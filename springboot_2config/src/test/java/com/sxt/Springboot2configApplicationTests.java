package com.sxt;

import com.sxt.domain.Student;
import com.sxt.domain.Person;
import com.sxt.domain.Student02;
import com.sxt.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
//@RunWith(SpringRunner.class)
class Springboot2configApplicationTests {

	@Autowired
	private Student student;

	@Autowired
	private Person person;

	@Autowired
	@Qualifier("teacher03")
	private Teacher teacher;

	@Autowired
	private Student02 student02;

	@Test
	void contextLoads() {
		System.out.println(student);
		System.out.println(person);
		System.out.println(teacher);
		System.out.println(student02);
	}
}
