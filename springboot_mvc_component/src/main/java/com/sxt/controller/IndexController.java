package com.sxt.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("hello1")
    public String hello1(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date birth){
        return "hello";
    }
}
