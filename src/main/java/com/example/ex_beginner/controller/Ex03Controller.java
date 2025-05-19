package com.example.ex_beginner.controller;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam03")
public class Ex03Controller {
    @Autowired
    ServletContext application;

    @GetMapping("")
    public String index(){
        return "exam03";
    }

    @PostMapping("result")
    public String result(Integer num1,Integer num2,Integer num3){
        int sum1 = num1 + num2 + num3;
        int sum2 = sum1*110/100;
        application.setAttribute("sum1",sum1);
        application.setAttribute("sum2",sum2);
        return "exam03-result";
    }
}
