package com.example.testproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*********************************************************************************************************************
 *
 *  *****************LECTURER MODULE********************
 *
 * This code is what controls display and functionality of LECTURER edit grades screen
 * It uses activity_grades.xml layout file for the display.
 *
 * *********************************************************************************************
 * ********************   GREAT PAINS have been taken to ensure your work is AS SIMPLE AS POSSIBLE **********
 * *********************************************************************************************
 *
 * **********************************
 * MAKE CHANGES AS YOU SEE FIT ******
 * **********************************
 *
 * **********************************************************************************************************************/

public class GradesActivity extends AppCompatActivity {

    //Remember to set an onClickListener that sends data back to DB after edits have been made
    Button submitLecturerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);
        RecyclerView gradesRV = findViewById(R.id.idRVGrades);

        String taskName = getIntent().getStringExtra("TASK_NAME");
        String unitName = getIntent().getStringExtra("UNIT_NAME");

        //use the above strings i.e taskName and unitName
        //in the database query to get appropriate data for example:
        /*****
         *
         * lets consider the taskName to be 'Cat 1' and the unitName to be 'compiler construction'
         * write appropriate code that will access the only the Cat 1 for compiler construction and
         * bring back the data to be displayed in the constructors further below
         *
         * *****/

        TextView unitNameTV = findViewById(R.id.unitName);
        TextView taskNameTV = findViewById(R.id.taskName);

        unitNameTV.setText(unitName);
        taskNameTV.setText(taskName);


        //you may change the location of this button to suit your needs
        //it is meant to be used to send data back to the database after edits have been made
        submitLecturerBtn = findViewById(R.id.submitLecturerBtn);

        //Take the unit name and task name send to DB and display data in a recycler view for all students
        //after data has been loaded display it in the recycler view
        ArrayList<GradesModel> gradesModelArrayList = new ArrayList<GradesModel>();

        /*
         *
         * Initialize the BELOW constructors with student data from DB
         *
         *       $$$$$$ CODE THAT GETS DATA FROM DATABASE WRITTEN HERE
         *
         *                  then you may use a for loop or while loop to initialize the below code
         *                  note that the example in this comment is fake code. It's your job to figure out
         *                  how it should be implemented.
         *
         *      $$$$$$ for(int i = 0; i < db_entries.size(); i++) {
         *      $$$$$$      ...
         *      $$$$$$      gradesModelArrayList.add(new GradesModel( ***** entry 1 as String from database *****, ***** entry 2 as String from DB ******, ***** entry 3 as Integer from DB ******));
         *      $$$$$$      ...
         *      $$$$$$ }
         *
         * IT IS VERY IMPORTANT THAT THEY ARE INITIALIZED PROPERLY
         *
         * */

        //the below is dummy data that shows how data will be displayed once the app is run, remember to remove
        //it after implementing database code

        //THE BELOW CODES ARE THE CONSTRUCTORS
        gradesModelArrayList.add(new GradesModel("Victor Kimiti", "C026-01-0994/2021", 10));
        gradesModelArrayList.add(new GradesModel("Eammon Kiprotich", "C026-01-0994/2021", 20));

        GradesActivityAdapter gradesActivityAdapter = new GradesActivityAdapter(this, gradesModelArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        gradesRV.setLayoutManager(linearLayoutManager);
        gradesRV.setAdapter(gradesActivityAdapter);


    }
}