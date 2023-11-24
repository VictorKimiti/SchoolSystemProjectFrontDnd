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
 * ********************LECTURER MODULE**********************
 *
 * This code is what controls display and functionality of LECTURER home screen
 * It uses fragment_lecturer_home.xml layout file for the display
 * Appropriate buttons and textviews have been provided in the code
 *
 * **********************************
 * MAKE CHANGES AS YOU SEE FIT ******
 * **********************************
 *
 * **********************************************************************************************************************/


public class LecturerHomeFragment extends Fragment {

    private TextView textView, txtLecturerName, txtLecturerUnit, txtLecturerEmail;

    public LecturerHomeFragment() {
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
        View v = inflater.inflate(R.layout.fragment_lecturer_home, container, false);

        //title for home screen
        textView = v.findViewById(R.id.lecturer_home_test);
        textView.setText("Lecturer Home Screen");

        //TextViews have been initialized with proper IDs in layout file
        //Take data from database and display using the below textviews
        txtLecturerName = v.findViewById(R.id.txtLecturerName);
        txtLecturerEmail = v.findViewById(R.id.txtLecturerEmail);
        txtLecturerUnit = v.findViewById(R.id.txtLecturerUnit);

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

        ArrayList<LecturerActivityModel> lecturerActivityModelArrayList = new ArrayList<LecturerActivityModel>();
        lecturerActivityModelArrayList.add(new LecturerActivityModel("Enter Cat 1 marks", "Overdue"));

        LecturerActivityAdapter lecturerActivityAdapter = new LecturerActivityAdapter(lecturerActivityModelArrayList);

        RecyclerView recyclerView = view.findViewById(R.id.idRVActivityTasks);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(lecturerActivityAdapter);
    }
}