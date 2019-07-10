package com.example.ann.fit4life.controllers;

import com.example.ann.fit4life.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("fit4life")
public class LoginController {

    @RequestMapping (value="login")
    public String displayLoginForm(Model model){
        model.addAttribute("title","log in");
        model.addAttribute(new User());
        return "fit4life/login";

    }
}
