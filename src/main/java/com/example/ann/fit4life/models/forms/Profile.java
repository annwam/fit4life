package com.example.ann.fit4life.models.forms;

public class Profile{

    private String goal;
    private int weight;
    private int armInches;
    private int waistInches;
    private int chestInches;
    private int thighInches;

    public Profile (){}

    public Profile (String goal, int weight, int armInches, int chestInches, int waistInches, int thighInches){
        this.goal = goal;
        this.armInches=armInches;
        this.chestInches=chestInches;
        this.waistInches=waistInches;
        this.thighInches=thighInches;
        this.weight=weight;

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
}
