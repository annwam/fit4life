package com.example.ann.fit4life.models.forms;

import com.example.ann.fit4life.models.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity
public class ProfilePost {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User user;

    private String goal;
    private String userEmail;
    private int weight;
    private int armInches;
    private int waistInches;
    private int chestInches;
    private int thighInches;
    private String date;
    //private List<ProgressForm> progressFormList;

    public ProfilePost() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        LocalDateTime now = LocalDateTime.now();
                this.date=dtf.format(now);
    }

    public ProfilePost(String goal, int weight, int armInches, int chestInches, int waistInches, int thighInches, List<ProgressForm> progressFormList) {
        this.goal = goal;
        this.armInches = armInches;
        this.chestInches = chestInches;
        this.waistInches = waistInches;
        this.thighInches = thighInches;
        this.weight = weight;
        //this.progressFormList = progressFormList;

    }

//    public List<ProgressForm> getProgressFormList() {
//        return progressFormList;
//    }
//
//    public void setProgressFormList(List<ProgressForm> progressFormList) {
//        this.progressFormList = progressFormList;
//    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getArmInches() {
        return armInches;
    }

    public void setArmInches(int armInches) {
        this.armInches = armInches;
    }

    public int getWaistInches() {
        return waistInches;
    }

    public void setWaistInches(int waistInches) {
        this.waistInches = waistInches;
    }

    public int getChestInches() {
        return chestInches;
    }

    public void setChestInches(int chestInches) {
        this.chestInches = chestInches;
    }

    public int getThighInches() {
        return thighInches;
    }

    public void setThighInches(int thighInches) {
        this.thighInches = thighInches;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getId() {
        return id;
    }
}
