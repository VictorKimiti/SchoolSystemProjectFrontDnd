package com.example.testproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*********************************************************************************************************************
 *
 * ****************ADMIN MODULE******************
 *
 * This code is what controls display and functionality of admin report screen
 * It uses activity_admin_report.xml layout file for the display
 * Appropriate buttons and textviews have been provided in the code. If there are none it's because Victor felt they
 * were not needed but if you feel like some are needed please feel free to contact Victor about it.
 *
 * * *********************************************************************************************
 * * ********************   GREAT PAINS have been taken to ensure your work is AS SIMPLE AS POSSIBLE **********
 * * *********************************************************************************************
 *
 * **********************************
 * MAKE CHANGES AS YOU SEE FIT ******
 * **********************************
 *
 * **********************************************************************************************************************/

public class AdminReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_report);

        RecyclerView reportsRV = findViewById(R.id.idRVAdminReport);

        String reportName = getIntent().getStringExtra("REPORT_NAME");
        String reportCategory = getIntent().getStringExtra("REPORT_CATEGORY");

        //use the above strings i.e reportName and reportCategory
        //in the database query to get appropriate data for example:
        /*****
         *
         * lets consider the reportName to be 'Pass List' and the reportCategory to be 'Computer Science'
         * write appropriate code that will access the only the Pass List for Computer Science students and
         * bring back the data to be displayed in the constructors further below
         *
         * *****/

        TextView reportNameTV = findViewById(R.id.reportName);
        TextView reportCategoryTV = findViewById(R.id.reportCategory);

        reportNameTV.setText(reportName);
        reportCategoryTV.setText(reportCategory);

        ArrayList<AdminReportModel> adminReportModelArrayList = new ArrayList<AdminReportModel>();

        /*
         *
         * Initialize the BELOW constructor(s) with report data from DB
         *
         *       $$$$$$ CODE THAT GETS DATA FROM DATABASE WRITTEN HERE
         *
         *                  then you may use a for loop or while loop to initialize the below code
         *                  note that the example in this comment is fake code. It's your job to figure out
         *                  how it should be implemented.
         *
         *      $$$$$$ for(int i = 0; i < db_entries.size(); i++) {
         *      $$$$$$     ...
         *      $$$$$$      adminReportModelArrayList.add(new AdminReportModel( ***** entry 1 as String from database *****, ***** entry 2 as String from DB ******));
         *      $$$$$$     ...
         *      $$$$$$ }
         *
         * IT IS VERY IMPORTANT THAT THEY ARE INITIALIZED PROPERLY
         *
         * */
        adminReportModelArrayList.add(new AdminReportModel("Victor Kimiti", "C026-01-0994/2021"));

        AdminReportActivityAdapter adminReportActivityAdapter = new AdminReportActivityAdapter(this, adminReportModelArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        reportsRV.setLayoutManager(linearLayoutManager);
        reportsRV.setAdapter(adminReportActivityAdapter);
    }
}