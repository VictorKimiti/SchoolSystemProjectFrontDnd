package com.example.testproject;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class LecturerTaskModel {
    private String task_name;
    private String unit;

    public LecturerTaskModel(String task_name, String unit) {
        this.task_name = task_name;
        this.unit = unit;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setStatus(String unit) {
        this.unit = unit;
    }
}
