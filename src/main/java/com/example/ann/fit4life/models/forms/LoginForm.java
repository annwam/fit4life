package com.example.ann.fit4life.models.forms;

import javax.validation.constraints.Email;

public class LoginForm {

    @Email
    private String email;

    private String password;

//    private int id;


    public LoginForm(@Email String email, String password) {
        this.email = email;
        this.password = password;
    }
    public LoginForm(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
