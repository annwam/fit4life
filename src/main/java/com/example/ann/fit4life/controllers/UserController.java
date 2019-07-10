package com.example.ann.fit4life.controllers;

import com.example.ann.fit4life.data.UserDao;
import com.example.ann.fit4life.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("fit4life")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping (value = "signup", method = RequestMethod.GET)
    public String displaySignUpForm(Model model){
        model.addAttribute(new User());
        model.addAttribute("title","Sign Up");
        return "fit4life/signUp";
    }







//    @RequestMapping (value="login")
//    public String displayLoginForm(Model model){
//        model.addAttribute("title","log in");
//        model.addAttribute(new User());
//        return "fit4life/login";
//
//    }
}
