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
 * ****************ADMIN MODULE****************
 *
 * This code is what controls display and functionality of admin home screen
 * It uses fragment_admin_home.xml layout file for the display
 * Appropriate buttons and textviews have been provided in the code
 *
 * **********************************
 * MAKE CHANGES AS YOU SEE FIT ******
 * **********************************
 *
 * **********************************************************************************************************************/


public class AdminHomeFragment extends Fragment {

    private TextView txtHomeScreenTitle, txtAdminName, txtAdminEmail;

    public AdminHomeFragment() {
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
        View v = inflater.inflate(R.layout.fragment_admin_home, container, false);

        //title for home screen
        txtHomeScreenTitle = v.findViewById(R.id.admin_home_test);
        txtHomeScreenTitle.setText("Admin Home Screen");

        //TextViews have been initialized with proper IDs in layout file
        //Take data from database and display using the below textviews
        txtAdminName = v.findViewById(R.id.txtAdminName);
        txtAdminEmail = v.findViewById(R.id.txtAdminEmail);

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
        //Ignore this Code
        ArrayList<AdminActivityModel> adminActivityModelArrayList = new ArrayList<AdminActivityModel>();
        adminActivityModelArrayList.add(new AdminActivityModel("Enter Cat 2 marks", "Overdue"));

        AdminActivityAdapter adminActivityAdapter = new AdminActivityAdapter(adminActivityModelArrayList);

        RecyclerView recyclerView = view.findViewById(R.id.idRVAdminActivityTasks);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adminActivityAdapter);
    }
}