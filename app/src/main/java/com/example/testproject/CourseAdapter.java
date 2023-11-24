package com.example.testproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    private ArrayList<CourseModel> courseModelArrayList;

    public CourseAdapter(ArrayList<CourseModel> courseModelArrayList) {
        this.courseModelArrayList = courseModelArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.registered_courses_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CourseModel model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.getCourse_name());
        holder.courseLecturerTV.setText(model.getLecturer());
    }

    @Override
    public int getItemCount() {
        return courseModelArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView courseNameTV;
        private final TextView courseLecturerTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.courseName);
            courseLecturerTV = itemView.findViewById(R.id.lecturerName);
        }
    }

}
