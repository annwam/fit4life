package com.example.ann.fit4life.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min=4, max=15, message = "Password must be 4-15 characters")
    private String password;

    public User (){

    }

    public User (String email, String password){
        this.email=email;
        this.password=password;
    }

    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getId(){
        return id;
    }
}