package com.sxt.contoller;

import com.sxt.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("showOneStudent")
    public String showOneStudent(){
        return "showOneStudent";
    }

    @RequestMapping("showOneStudentModel")
    public String showOneStudentModel(Model model){
        model.addAttribute("student",new Student(1,"江疏影","女",25,new Date(),"1234567890"));
        return "showOneStudentModel";
    }


    @RequestMapping("showObject")
    public String showObject(Model model, HttpServletRequest request){
        HttpSession session= request.getSession();
        ServletContext context = request.getServletContext();
        //model和request的作用于是一样的
        model.addAttribute("name","name-model");
        request.setAttribute("name","name-request");
        session.setAttribute("name","name-session");
        context.setAttribute("name","name-content");
        return "showObject";
    }
}
