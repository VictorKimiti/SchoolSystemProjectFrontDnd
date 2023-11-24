package com.example.testproject;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class LecturerReportActivityModel {
    private String studentName;
    private String registrationNumber;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LecturerReportActivityModel(String studentName, String registrationNumber) {
        this.studentName = studentName;
        this.registrationNumber = registrationNumber;
    }
}
