package com.sxt;

import com.sxt.domain.Person;
import com.sxt.domain.Person02;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValueTests {
	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
