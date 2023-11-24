package com.example.testproject;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class LecturerReportModel {
    private String reportName;
    private String reportCategory;

    public LecturerReportModel(String reportName, String reportCategory) {
        this.reportName = reportName;
        this.reportCategory = reportCategory;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

}
