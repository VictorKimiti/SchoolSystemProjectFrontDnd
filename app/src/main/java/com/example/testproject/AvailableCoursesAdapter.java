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

public class AvailableCoursesAdapter extends RecyclerView.Adapter<AvailableCoursesAdapter.MyViewHolder2> {
    private ArrayList<AvailableCourses> availableCoursesArrayList;

    public AvailableCoursesAdapter(ArrayList<AvailableCourses> availableCoursesArrayList) {
        this.availableCoursesArrayList = availableCoursesArrayList;
    }

    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.register_courses_list, parent, false);
        return new MyViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        AvailableCourses model = availableCoursesArrayList.get(position);
        holder.courseTitleTV.setText(model.getCourse_name());
    }

    @Override
    public int getItemCount() {
        return availableCoursesArrayList.size();
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder {
        private final TextView courseTitleTV;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            courseTitleTV = itemView.findViewById(R.id.coursetitle);
        }
    }

}
