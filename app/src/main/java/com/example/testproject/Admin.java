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
 * *******************ADMIN MODULE***************************
 *
 * This code has been redesigned to take the user to the home
 * fragment of the admin module based on login details, in the MainActivity.java
 * where the entire application starts once the user enters admin login details
 * it calls this file which displays the Home fragment (a.k.a Home tab)
 *
 * ********************************************************************************************************************
 *
 *  DO NOT MAKE CHANGES TO THIS FILE. IF YOU WANT TO IMPLEMENT
 *  CHANGES GO TO THE APPROPRIATE FILE. THE FILES ARE:
 *          1. AdminHomeFragment.java - for the Home tab
 *          2. AdminTaskFragment.java - for the Register tab
 *          3. AdminReportFragment.java - for the Report tab
 *          4. AdminSettingsFragment.java (avoid this file it's still in development and isn't necessary for the project)
 *
 * **********************************************************************************************************************
 *
 * **********************************************************************************************************************/


public class Admin extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private AdminHomeFragment adminHomeFragment = new AdminHomeFragment();
    private AdminTaskFragment adminTaskFragment = new AdminTaskFragment();
    private AdminReportFragment adminReportFragment = new AdminReportFragment();
    private AdminSettingsFragment adminSettingsFragment = new AdminSettingsFragment();
    private static final String TAG_FRAGMENT_ADMIN_HOME = "tag_frag_admin_home";
    private static final String TAG_FRAGMENT_ADMIN_TASK = "tag_frag_admin_task";
    private static final String TAG_FRAGMENT_ADMIN_REPORT = "tag_frag_admin_report";
    private static final String TAG_FRAGMENT_ADMIN_SETTINGS = "tag_frag_admin_settings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav_admin);

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_home_admin) {
                    //if home icon is clicked show home fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, adminHomeFragment, TAG_FRAGMENT_ADMIN_HOME).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_register_admin) {
                    //if register icon is clicked show register fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, adminTaskFragment, TAG_FRAGMENT_ADMIN_TASK).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_report_admin) {
                    //if report icon is clicked show report fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, adminReportFragment, TAG_FRAGMENT_ADMIN_REPORT).commit();
                    return true;
                } else if (item.getItemId() == R.id.navigation_settings_admin) {
                    //if settings fragment is clicked show settings fragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, adminSettingsFragment, TAG_FRAGMENT_ADMIN_SETTINGS).commit();
                    return true;
                } else {
                    return false;
                }
            }
        });

        //set the Home Fragment to be displayed by default.
        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragmentholder4, adminHomeFragment, TAG_FRAGMENT_ADMIN_HOME).commit();
    }
}