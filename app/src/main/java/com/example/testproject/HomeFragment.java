package com.example.testproject;

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
 * ************* STUDENTS MODULE****************
 *
 * This code is what controls display and functionality of STUDENT home screen
 * It uses fragment_home.xml layout file for the display
 * Appropriate buttons and textviews have been provided in the code
 *
 * **********************************
 * MAKE CHANGES AS YOU SEE FIT ******
 * **********************************
 *
 * **********************************************************************************************************************/

public class HomeFragment extends Fragment {

    private TextView textView, txtStudentName, txtStudentCourse, txtStudentEmail, txtStudentYearOfStudy;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        //title for home screen
        textView = v.findViewById(R.id.home_test);
        textView.setText("Student Home");

        //TextViews have been initialized with proper IDs in layout file
        //Take data from database and display using the below textviews
        txtStudentName = v.findViewById(R.id.txtStudentName);
        txtStudentCourse = v.findViewById(R.id.txtStudentCourse);
        txtStudentEmail = v.findViewById(R.id.txtStudentEmail);
        txtStudentYearOfStudy = v.findViewById(R.id.txtStudentYearOfStudy);

        /* *****
         *
         * code that takes database details and puts them into the textviews
         *
         * *****/

        return v;
    }


    //IGNORE THE BELOW CODE. THIS WAS OPTIONAL SO NO NEED TO BOTHER WITH IT BUT DO NOT TAMPER WITH IT
    //IT MAY FIND FUTURE USE
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        CourseAdapter courseAdapter = new CourseAdapter(courseModelArrayList);

        RecyclerView recyclerView = view.findViewById(R.id.idRVCourse);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(courseAdapter);
    }
}