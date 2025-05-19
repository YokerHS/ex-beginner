package com.example.ex_beginner.controller;

import com.example.ex_beginner.domain.User;
import com.example.ex_beginner.form.UserForm;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam04")
public class Exam04Controller {
    @GetMapping("")
    public String index(UserForm form){
        return "exam04";
    }

    @PostMapping("result")
    public  String  result(UserForm form, Model model){
        User user = new User();
        BeanUtils.copyProperties(form,user);
        model.addAttribute("user",user);
        return "exam04-result";
    }
}
