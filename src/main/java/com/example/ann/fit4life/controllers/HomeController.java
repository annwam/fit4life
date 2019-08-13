package com.example.ann.fit4life.controllers;

import com.example.ann.fit4life.data.UserDao;
import com.example.ann.fit4life.models.User;
import com.example.ann.fit4life.models.forms.ProfilePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("fit4life")
public class HomeController {
    @Autowired
    private UserDao userDao;



    @RequestMapping(value="home", method = RequestMethod.GET)
    public String homePage(Model model){
        return "home";
    }


//    @RequestMapping(value="profile", method = RequestMethod.GET)
//    public String displayProfile(Model model){
//
//        model.addAttribute("users", userDao.findAll());
//        model.addAttribute("firstName", "Ann");
//        model.addAttribute("lastName", "Wambui");
//
//        return "profile";
//    }

    public  String displayProfilePage(Model model, String email){

        model.addAttribute("user",userDao.findByEmail(email));
        model.addAttribute("topic", "my profile");
        return "profile";
    }

    @RequestMapping(value = "profile", method= RequestMethod.GET)
    public String displayProfilePosts(Model model){
        model.addAttribute("title","post");
        model.addAttribute(new ProfilePost());

        return "profile";
    }

}
