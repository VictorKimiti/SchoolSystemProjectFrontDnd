package com.example.testproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

/*********************************************************************************************************************
 *
 * *******************STUDENT MODULE***************************
 *
 * This code has been redesigned to take the user to the home
 * fragment of the STUDENT module based on login details, in the MainActivity.java
 * where the entire application starts once the user enters STUDENT login details
 * it calls this file which displays the Home fragment (a.k.a Home tab)
 *
 * ********************************************************************************************************************
 *
 *  DO NOT MAKE CHANGES TO THIS FILE. IF YOU WANT TO IMPLEMENT
 *  CHANGES GO TO THE APPROPRIATE FILE. THE FILES ARE:
 *          1. HomeFragment.java - for the Home tab
 *          2. RegisterFragment.java - for the Register tab
 *          3. ReportFragment.java - for the Report tab
 *          4. SettingsFragment.java (avoid this file it's still in development and isn't necessary for the project)
 *
 * **********************************************************************************************************************
 *
 * **********************************************************************************************************************/


public class StudentHomeScreen extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private HomeFragment homeFragment = new HomeFragment();
    private RegisterFragment registerFragment = new RegisterFragment();
    private ReportFragment reportFragment = new ReportFragment();
    private SettingsFragment settingsFragment = new SettingsFragment();
    private static final String TAG_FRAGMENT_HOME = "tag_frag_home";
    private static final String TAG_FRAGMENT_REGISTER = "tag_frag_register";
    private static final String TAG_FRAGMENT_REPORT = "tag_frag_report";
    private static final String TAG_FRAGMENT_SETTINGS = "tag_frag_settings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home_screen);

        bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav);

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_home) {
                    //if home icon is clicked show home fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder, homeFragment, TAG_FRAGMENT_HOME).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_register) {
                    //if register icon is clicked show register fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder, registerFragment, TAG_FRAGMENT_REGISTER).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_report) {
                    //if report icon is clicked show report fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder, reportFragment, TAG_FRAGMENT_REPORT).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_settings) {
                    //if settings fragment is clicked show settings fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder, settingsFragment, TAG_FRAGMENT_SETTINGS).commit();
                    return true;
                } else {
                    return false;
                }
            }
        });

        //set the Home Fragment to be displayed by default.
        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder, homeFragment, TAG_FRAGMENT_HOME).commit();

    }
}