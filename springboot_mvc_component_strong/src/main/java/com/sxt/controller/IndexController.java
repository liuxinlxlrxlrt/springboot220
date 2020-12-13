package com.sxt.controller;

import com.sxt.domain.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("hello2")
    public String hello2(Date birth){
        System.out.println(birth);
        return "hello";
    }

    @RequestMapping(value = "getStu")
    @ResponseBody
    public Student getStu(){
        return new Student(1,"杨祺如",new Date());
    }

}
