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
    private String weight;
    private String armInches;
    private String waistInches;
    private String chestInches;
    private String thighInches;
    private String date;
    //private List<ProgressForm> progressFormList;

    public ProfilePost() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        LocalDateTime now = LocalDateTime.now();
                this.date=dtf.format(now);
    }

    public ProfilePost(String goal, String weight, String armInches, String chestInches, String waistInches, String thighInches, List<ProgressForm> progressFormList) {
        this.goal = goal;
        this.armInches = armInches;
        this.chestInches = chestInches;
        this.waistInches = waistInches;
        this.thighInches = thighInches;
        this.weight = weight;

//        TODO #3 Implement a fit test with sit ups, push ups and cardio
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getArmInches() {
        return armInches;
    }

    public void setArmInches(String armInches) {
        this.armInches = armInches;
    }

    public String getWaistInches() {
        return waistInches;
    }

    public void setWaistInches(String waistInches) {
        this.waistInches = waistInches;
    }

    public String getChestInches() {
        return chestInches;
    }

    public void setChestInches(String chestInches) {
        this.chestInches = chestInches;
    }

    public String getThighInches() {
        return thighInches;
    }

    public void setThighInches(String thighInches) {
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
