package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*********************************************************************************************************************
 * *************LECTURER MODULE****************
 * This code is what controls display and functionality of lecturer report screen
 * It uses fragment_lecturer_report.xml layout file for the display
 * Appropriate buttons and textviews have been provided in the code. If there are none it's because they are not needed
 * but if you feel like some are needed please feel free to contact Victor about it.
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


public class LecturerReportFragment extends Fragment implements LecturerReportRVInterface {

    private TextView textView;
    ArrayList<LecturerReportModel> lecturerReportModelArrayList = new ArrayList<LecturerReportModel>();

    public LecturerReportFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lecturer_report, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //This part initializes the cards that are displayed in the admin task page, i.e on the admin screen
        //click the + (plus) icon to see it's output
        lecturerReportModelArrayList.clear();

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
         *      $$$$$$ lecturerReportModelArrayList.add(new LecturerReportModel( ***** entry 1 as String from database *****, ***** entry 2 as String from DB ******));
         *      $$$$$$ }
         *
         * IT IS VERY IMPORTANT THAT THEY ARE INITIALIZED PROPERLY
         *
         * */
        lecturerReportModelArrayList.add(new LecturerReportModel("Pass List", "Computer Science"));

        LecturerReportAdapter lecturerReportAdapter = new LecturerReportAdapter(lecturerReportModelArrayList, this);
        RecyclerView reportRecyclerView = view.findViewById(R.id.idRVLecturerReport);

        reportRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        reportRecyclerView.setAdapter(lecturerReportAdapter);
    }


    //DON'T TOUCH WITHOUT CONSULTING VICTOR
    @Override
    public void onLecturerReportClick(int position) {
        Intent intent = new Intent(getContext(), LecturerReportActivity.class);

        intent.putExtra("REPORT_NAME", lecturerReportModelArrayList.get(position).getReportName());
        intent.putExtra("REPORT_CATEGORY", lecturerReportModelArrayList.get(position).getReportCategory());

        startActivity(intent);
    }
}