package com.example.testproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

//import com.google.firebase.auth.FirebaseAuth;

/*********************************************************************************************************************
 *
 * *******************LECTURER MODULE***************************
 *
 * This code has been redesigned to take the user to the home
 * fragment of the LECTURER module based on login details, in the MainActivity.java
 * where the entire application starts once the user enters LECTURER login details
 * it calls this file which displays the Home fragment (a.k.a Home tab)
 *
 * ********************************************************************************************************************
 *
 *  DO NOT MAKE CHANGES TO THIS FILE. IF YOU WANT TO IMPLEMENT
 *  CHANGES GO TO THE APPROPRIATE FILE. THE FILES ARE:
 *          1. LecturerHomeFragment.java - for the Home tab
 *          2. LecturerTaskFragment.java - for the Register tab
 *          3. LecturerReportFragment.java - for the Report tab
 *          4. LecturerSettingsFragment.java (avoid this file it's still in development and isn't necessary for the project)
 *
 * **********************************************************************************************************************
 *
 * **********************************************************************************************************************/

public class Lecturer extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private LecturerHomeFragment lecturerHomeFragment = new LecturerHomeFragment();
    private LecturerTaskFragment lecturerTaskFragment = new LecturerTaskFragment();
    private LecturerReportFragment lecturerReportFragment = new LecturerReportFragment();
    private LecturerSettingsFragment lecturerSettingsFragment = new LecturerSettingsFragment();
    private static final String TAG_FRAGMENT_LECTURER_HOME = "tag_frag_lecturer_home";
    private static final String TAG_FRAGMENT_LECTURER_TASK = "tag_frag_lecturer_task";
    private static final String TAG_FRAGMENT_LECTURER_REPORT = "tag_frag_lecturer_report";
    private static final String TAG_FRAGMENT_LECTURER_SETTINGS = "tag_frag_lecturer_settings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer);

        bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav_lec);

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_home_lec) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, lecturerHomeFragment, TAG_FRAGMENT_LECTURER_HOME).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_register_lec) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, lecturerTaskFragment, TAG_FRAGMENT_LECTURER_TASK).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_report_lec) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, lecturerReportFragment, TAG_FRAGMENT_LECTURER_REPORT).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_settings_lec) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, lecturerSettingsFragment, TAG_FRAGMENT_LECTURER_SETTINGS).commit();
                    return true;
                } else {
                    return false;
                }
            }
        });

        //set the Home Fragment to be displayed by default.
        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, lecturerHomeFragment, TAG_FRAGMENT_LECTURER_HOME).commit();
    }
}