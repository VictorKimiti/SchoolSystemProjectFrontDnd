package com.example.testproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/*
 *
 * IGNORE THIS CODE FILE
 *
 * */

public class LecturerSettingsFragment extends Fragment {
    private TextView textView;

    public LecturerSettingsFragment() {
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
        View v = inflater.inflate(R.layout.fragment_lecturer_settings, container, false);
        textView = v.findViewById(R.id.settings_test);

        return v;
    }
}