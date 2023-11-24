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

public class LecturerActivityAdapter extends RecyclerView.Adapter<LecturerActivityAdapter.MyViewHolder4> {

    private ArrayList<LecturerActivityModel> lecturerActivityModelArrayList;

    public LecturerActivityAdapter(ArrayList<LecturerActivityModel> lecturerActivityModelArrayList) {
        this.lecturerActivityModelArrayList = lecturerActivityModelArrayList;
    }

    @Override
    public MyViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lecturer_activity_card, parent, false);
        return new MyViewHolder4(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LecturerActivityAdapter.MyViewHolder4 holder, int position) {
        LecturerActivityModel model = lecturerActivityModelArrayList.get(position);
        holder.activityTaskNameTV.setText(model.getActivityTaskName());
        holder.activityStatusTV.setText(model.getActivityStatus());
    }

    @Override
    public int getItemCount() {
        return lecturerActivityModelArrayList.size();
    }

    public static class MyViewHolder4 extends RecyclerView.ViewHolder {
        private final TextView activityTaskNameTV;
        private final TextView activityStatusTV;

        public MyViewHolder4(@NonNull View itemView) {
            super(itemView);
            activityTaskNameTV = itemView.findViewById(R.id.activityTaskName);
            activityStatusTV = itemView.findViewById(R.id.activityStatus);
        }
    }
}
