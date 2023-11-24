package com.example.testproject;

public class ReportFragmentModel {
    private String unitName;
    private String unitGrade;

    public ReportFragmentModel(String unitName, String unitGrade) {
        this.unitName = unitName;
        this.unitGrade = unitGrade;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitGrade() {
        return unitGrade;
    }

    public void setUnitGrade(String unitGrade) {
        this.unitGrade = unitGrade;
    }
}
