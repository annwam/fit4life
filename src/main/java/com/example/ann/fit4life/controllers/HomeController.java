package com.example.ann.fit4life.controllers;

import com.example.ann.fit4life.data.PostDao;
import com.example.ann.fit4life.data.UserDao;
import com.example.ann.fit4life.models.User;
import com.example.ann.fit4life.models.forms.ProfilePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping ("fit4life")
public class HomeController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserController userController;

    @Autowired
    private PostDao postDao;



    @RequestMapping(value="", method = RequestMethod.GET)
    public String homePage(Model model){
        return "home";
    }

//

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
        model.addAttribute(new ProfilePost());
        model.addAttribute("topic", "my profile");
        return "profile";
    }

//    @RequestMapping (value = "signup", method = RequestMethod.POST)
//    public String processSignUpForm(Model model, @ModelAttribute @Valid User user, Errors errors){
////       System.out.println( "ssssssssssssssssss?" + user.getFirstName());
//        if(errors.hasErrors()){
//            return "signUp";
//        }
//
//        userDao.save(user);
//        return "login";
//    }

    @RequestMapping (value = "profile/{email}", method= RequestMethod.POST)
    public String processProfilePost(Model model, @ModelAttribute @Valid ProfilePost profilePost, @PathVariable String email, Errors errors){

        //TODO Save profilepost
        System.out.println(profilePost.getUserEmail());
        //TODO Save profilepost to db
        postDao.save(profilePost);

        //TODO pull user from db that sent post
        User this_user=userDao.findByEmail(profilePost.getUserEmail());

        //TODO save posts to the user
        this_user.setProfilePosts(profilePost);


        //TODO Now we can redirect to login form
        return displayProfilePage(model, profilePost.getUserEmail());
    }


}
