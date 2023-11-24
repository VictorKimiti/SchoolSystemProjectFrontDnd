package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/*********************************************************
 *
 * Once you click on the app icon this is the launcher file (a.k.a first file to be executed),
 * it displays a login card where login details are to be entered
 * In this file is where user authentication logic and checks will be implemented
 * after login details are entered the logic should be structured in such a way
 * that if user is a student it directs them to students tab
 * if user is a lecturer then it should send them to lecturer tab
 * if user is admin it should send them to admin tab
 * All the above tabs are already designed and made easy to access
 *
 * *************************************************************************
 ********** YOU CAN EDIT THIS FILE AS YOU SEE FIT TO IMPLEMENT APP LOGIC ***
 * *************************************************************************
 *
 * ********************************************************/


public class MainActivity extends AppCompatActivity {

    private Button loginBtn, forgotPassBtn, btnAdminAccount, btnLecturerAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        forgotPassBtn = findViewById(R.id.btnForgotPass);
        btnAdminAccount = findViewById(R.id.btnAdminAccount);
        btnLecturerAccount = findViewById(R.id.btnLecturerAccount);

        //make the required changes to make it functional


        btnAdminAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the below code sends them to admin tab
                startActivity(new Intent(getApplicationContext(), Admin.class));
                finish();
            }
        });

        btnLecturerAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the below code sends them to lecturer tab
                startActivity(new Intent(getApplicationContext(), Lecturer.class));
                finish();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the below code sends them to students tab
                startActivity(new Intent(getApplicationContext(), StudentHomeScreen.class));
                finish();
            }
        });

        forgotPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this code sends them to forgot password activity
                startActivity(new Intent(getApplicationContext(), ForgotPassword.class));
                finish();
            }
        });


    }
}