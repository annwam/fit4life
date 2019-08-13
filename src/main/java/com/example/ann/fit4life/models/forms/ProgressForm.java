package com.example.ann.fit4life.models.forms;

public class ProgressForm {
    private int pushUps;
    private int sitUps;
    private int amileWalk;

    public ProgressForm(){}

    public ProgressForm(int pushUps, int sitUps, int amileWalk){
        this.pushUps=pushUps;
        this.sitUps=sitUps;
        this.amileWalk=amileWalk;

    }

    public int getPushUps() {
        return pushUps;
    }

    public void setPushUps(int pushUps) {
        this.pushUps = pushUps;
    }

    public int getSitUps() {
        return sitUps;
    }

    public void setSitUps(int sitUps) {
        this.sitUps = sitUps;
    }

    public int getAmileWalk() {
        return amileWalk;
    }

    public void setAmileWalk(int amileWalk) {
        this.amileWalk = amileWalk;
    }
}
