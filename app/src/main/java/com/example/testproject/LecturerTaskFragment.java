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
 * ******************LECTURER MODULE********************
 * This code is what controls display and functionality of lecturer register screen
 * It uses fragment_lecturer_task.xml layout file for the display
 * Appropriate buttons and textviews have been provided in the code. If there are none it's because they are not needed
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


public class LecturerTaskFragment extends Fragment implements LecturerTaskRVInterface {

    private TextView textView;
    ArrayList<LecturerTaskModel> lecturerTaskModelArrayList = new ArrayList<LecturerTaskModel>();


    public LecturerTaskFragment() {
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
        View v = inflater.inflate(R.layout.fragment_lecturer_task, container, false);

        //title for the screen
        textView = v.findViewById(R.id.lecturer_task_test);
        textView.setText("Choose task Screen");

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lecturerTaskModelArrayList.clear();

        /* *******
         *
         * Using the immediate below code snippet as an example. The data brought back from the database
         * should be sent as arguments to the constructor above as strings. For example
         *
         *          $$$$$$ CODE THAT GETS DATA FROM DATABASE WRITTEN HERE
         *
         *      then you may use a for loop or while loop to initialize the below code
         *      note that the example in this comment is fake code. It's your job to figure out
         *      how it should be implemented.
         *
         *          $$$$$$ for(int i = 0; i < db_entries.size(); i++) {
         *          $$$$$$ lecturerTaskModelArrayList.add(new LecturerTaskModel( ***** entry 1 from database *****, ***** entry 2 from DB ******));
         *          $$$$$$ }
         *
         *
         * IT IS VERY IMPORTANT THAT THEY ARE INITIALIZED PROPERLY
         *
         * ************/

        lecturerTaskModelArrayList.add(new LecturerTaskModel("Assignment 1", "Compiler construction"));
        lecturerTaskModelArrayList.add(new LecturerTaskModel("Assignment 2", "Compiler construction"));
        lecturerTaskModelArrayList.add(new LecturerTaskModel("Cat 1", "Compiler construction"));
        lecturerTaskModelArrayList.add(new LecturerTaskModel("Cat 2", "Compiler construction"));
        lecturerTaskModelArrayList.add(new LecturerTaskModel("Exam", "Compiler construction"));

        /*
         *
         * After the data is implemented the code is designed to automatically generate cards for the display dynamically
         * using RecyclerView. The data from DB will be used later on in the application
         *
         * */


        LecturerTaskAdapter lecturerTaskAdapter = new LecturerTaskAdapter(lecturerTaskModelArrayList, this);

        RecyclerView recyclerView = view.findViewById(R.id.idRVTask);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(lecturerTaskAdapter);
    }


    //DO NOT TOUCH THE BELOW CODE WITHOUT CONSULTING VICTOR
    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getContext(), GradesActivity.class);

        intent.putExtra("TASK_NAME", lecturerTaskModelArrayList.get(position).getTask_name());
        intent.putExtra("UNIT_NAME", lecturerTaskModelArrayList.get(position).getUnit());

        startActivity(intent);
    }
}