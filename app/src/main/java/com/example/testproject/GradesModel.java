package com.example.testproject;

/*********************************************************
 *
 * ****************LECTURER MODULE********************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class GradesModel {
    private String studentName;
    private String registrationNumber;
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

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

    public GradesModel(String studentName, String registrationNumber, int grade) {
        this.studentName = studentName;
        this.registrationNumber = registrationNumber;
        this.grade = grade;
    }
}
