package com.example.testproject;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class LecturerActivityModel {
    private String activityTaskName;
    private String activityStatus;

    public LecturerActivityModel(String activityTaskName, String activityStatus) {
        this.activityTaskName = activityTaskName;
        this.activityStatus = activityStatus;
    }

    public String getActivityTaskName() {
        return activityTaskName;
    }

    public void setActivityTaskName(String activityTaskName) {
        this.activityTaskName = activityTaskName;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }
}
