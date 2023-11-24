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
 *
 * This code is what controls display and functionality of admin report screen
 * It uses fragment_admin_report.xml layout file for the display
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

public class AdminReportFragment extends Fragment implements AdminTaskReportRVInterface {
    private TextView textView;

    ArrayList<AdminTaskReportModel> adminTaskReportModelArrayList = new ArrayList<>();

    public AdminReportFragment() {
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
        return inflater.inflate(R.layout.fragment_admin_report, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //This part initializes the cards that are displayed in the admin task page, i.e on the admin screen
        //click the + (plus) icon to see it's output
        adminTaskReportModelArrayList.clear();

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
         *      $$$$$$ adminTaskReportModelArrayList.add(new AdminTaskReportModel( ***** entry 1 as String from database *****, ***** entry 2 as String from DB ******));
         *      $$$$$$ }
         *
         * IT IS VERY IMPORTANT THAT THEY ARE INITIALIZED PROPERLY
         *
         * */
        adminTaskReportModelArrayList.add(new AdminTaskReportModel("Pass List", "Computer Science"));

        AdminTaskReportAdapter adminTaskReportAdapter = new AdminTaskReportAdapter(adminTaskReportModelArrayList, this);
        RecyclerView reportRecyclerView = view.findViewById(R.id.idRVAdminReportTask);

        reportRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        reportRecyclerView.setAdapter(adminTaskReportAdapter);
    }


    //DON'T TOUCH WITHOUT CONSULTING VICTOR
    @Override
    public void onReportClick(int position) {
        Intent intent = new Intent(getContext(), AdminReportActivity.class);

        intent.putExtra("REPORT_NAME", adminTaskReportModelArrayList.get(position).getReportName());
        intent.putExtra("REPORT_CATEGORY", adminTaskReportModelArrayList.get(position).getReportCategory());

        startActivity(intent);
    }
}