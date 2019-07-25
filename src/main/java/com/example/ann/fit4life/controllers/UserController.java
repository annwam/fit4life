package com.example.ann.fit4life.controllers;

import com.example.ann.fit4life.data.UserDao;
import com.example.ann.fit4life.models.Address;
import com.example.ann.fit4life.models.User;
import com.example.ann.fit4life.models.forms.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("fit4life")
public class UserController {

   @Autowired
   private UserDao userDao;


    @RequestMapping (value = "signup", method = RequestMethod.GET)
    public String displaySignUpForm(Model model){
        model.addAttribute("title","Sign Up");
        model.addAttribute(new User ());
        return "signUp";
    }

    @RequestMapping (value = "signup", method = RequestMethod.POST)
    public String processSignUpForm(Model model, @ModelAttribute @Valid User user, Errors errors){
//       System.out.println( "ssssssssssssssssss?" + user.getFirstName());
        if(errors.hasErrors()){
            return "signUp";
        }

        userDao.save(user);
        return "login";
    }

    @RequestMapping (value="login", method = RequestMethod.GET)
    public String displayLoginForm(Model model){
        model.addAttribute("title","Log in");
        model.addAttribute(new LoginForm());
        return "login";
    }

    @RequestMapping (value = "login", method = RequestMethod.POST)
    public String processLoginForm(Model model, @ModelAttribute @Valid LoginForm loginForm, Errors errors){



        User thisUser =userDao.findByEmail(loginForm.getEmail());

        if (!thisUser.equals(null)) {
            if (loginForm.getPassword().equals(thisUser.getPassword()))
            return "home";
        }
//        System.out.println("ssssssssssssssssssssssss");

        return "login";


    }


}
