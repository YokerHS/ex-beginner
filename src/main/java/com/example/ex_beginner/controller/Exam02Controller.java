package com.example.ex_beginner.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    @GetMapping("")
    public String index(){
        return "exam02";
    }

    @PostMapping("result")
    public String result(String num1, String num2){
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        String result = num1 + " + " + num2 + " = " + (n1 + n2);
        session.setAttribute("result",result);
        return "redirect:/exam02/result";
    }

    @GetMapping("result")
    public String result(){
        return "exam02-result";
    }

    @GetMapping("result2")
    public String result2(){
        return "exam02-result2";
    }
}
