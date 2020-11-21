package com.sxt;

import com.sxt.domain.Person02;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValidatedTest {
    @Autowired
    private Person02 person02;


    @Test
    public void test(){
        System.out.println(person02);
    }
}
