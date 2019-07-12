package com.example.ann.fit4life.models;



import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

//    @NotNull
//    @Email
    private String email;

//    @NotNull
//    @Size(min=4, max=15, message = "Password must be 4-15 characters")
    private String password;

//    @NotNull
//    @Size(min=4, max=15, message = "Password must be 4-15 characters")
    private String verifyPassword;

//    @NotNull
    private String firstName;

//    @NotNull
    private String lastName;

    @OneToOne
    private Address address;

    public User (){

    }

    public User (String email, String password){
        this.email=email;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
