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
 * ********************STUDENT MODULE*********************
 * This code is what controls display and functionality of STUDENT register screen
 * It uses fragment_register.xml layout file for the display
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

public class RegisterFragment extends Fragment {

    private TextView textView;

    public RegisterFragment() {
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
        View v = inflater.inflate(R.layout.fragment_register, container, false);
        textView = v.findViewById(R.id.register_test);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<AvailableCourses> availableCoursesArrayList = new ArrayList<AvailableCourses>();


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
         *          $$$$$$ availableCoursesArrayList.add(new AvailableCourses( ***** entry 1 from database *****));
         *          $$$$$$ }
         *
         *
         * IT IS VERY IMPORTANT THAT THEY ARE INITIALIZED PROPERLY
         *
         * ************/
        availableCoursesArrayList.add(new AvailableCourses("Compiler construction"));
        availableCoursesArrayList.add(new AvailableCourses("Simulation and modelling"));
        availableCoursesArrayList.add(new AvailableCourses("Computer Architecture"));
        availableCoursesArrayList.add(new AvailableCourses("Mobile Programming"));
        availableCoursesArrayList.add(new AvailableCourses("Machine Learning"));
        availableCoursesArrayList.add(new AvailableCourses("Mobile Programming"));
        availableCoursesArrayList.add(new AvailableCourses("Machine Learning"));
        availableCoursesArrayList.add(new AvailableCourses("Simulation and modelling"));
        availableCoursesArrayList.add(new AvailableCourses("Computer Architecture"));
        availableCoursesArrayList.add(new AvailableCourses("Mobile Programming"));
        availableCoursesArrayList.add(new AvailableCourses("Machine Learning"));

        /*
         *
         * After the data is implemented the code is designed to automatically generate cards for the display dynamically
         * using RecyclerView. The data from DB will be used later on in the application
         *
         * */


        AvailableCoursesAdapter availableCoursesAdapter = new AvailableCoursesAdapter(availableCoursesArrayList);

        RecyclerView recyclerView = view.findViewById(R.id.idRVAvailableCourses);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(availableCoursesAdapter);
    }
}