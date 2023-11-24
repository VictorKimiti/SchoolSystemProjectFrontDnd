package com.example.testproject;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class AdminTaskModel {
    private String adminTaskName;
    private String adminTaskUnit;

    public AdminTaskModel(String adminTaskName, String adminTaskUnit) {
        this.adminTaskName = adminTaskName;
        this.adminTaskUnit = adminTaskUnit;
    }

    public String getAdminTaskName() {
        return adminTaskName;
    }

    public void setAdminTaskName(String adminTaskName) {
        this.adminTaskName = adminTaskName;
    }

    public String getAdminTaskUnit() {
        return adminTaskUnit;
    }

    public void setAdminTaskUnit(String adminTaskUnit) {
        this.adminTaskUnit = adminTaskUnit;
    }
}
