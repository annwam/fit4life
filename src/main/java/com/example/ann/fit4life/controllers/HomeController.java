package com.example.ann.fit4life.controllers;

import com.example.ann.fit4life.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("fit4life")
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String homePage(Model model){
        return "home";
    }


    @RequestMapping(value="profile", method = RequestMethod.GET)
    public String displayProfile(){
        return "profile";
    }
}
