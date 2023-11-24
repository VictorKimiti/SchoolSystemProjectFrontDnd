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

public class AdminActivityAdapter extends RecyclerView.Adapter<AdminActivityAdapter.MyViewHolder5> {
    private ArrayList<AdminActivityModel> adminActivityModelArrayList;

    public AdminActivityAdapter(ArrayList<AdminActivityModel> adminActivityModelArrayList) {
        this.adminActivityModelArrayList = adminActivityModelArrayList;
    }

    @Override
    public AdminActivityAdapter.MyViewHolder5 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_activity_card, parent, false);
        return new AdminActivityAdapter.MyViewHolder5(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminActivityAdapter.MyViewHolder5 holder, int position) {
        AdminActivityModel model = adminActivityModelArrayList.get(position);
        holder.adminActivityTaskNameTV.setText(model.getActivityTaskName());
        holder.adminActivityStatusTV.setText(model.getActivityStatus());
    }

    @Override
    public int getItemCount() {
        return adminActivityModelArrayList.size();
    }

    public static class MyViewHolder5 extends RecyclerView.ViewHolder {
        private final TextView adminActivityTaskNameTV;
        private final TextView adminActivityStatusTV;

        public MyViewHolder5(@NonNull View itemView) {
            super(itemView);
            adminActivityTaskNameTV = itemView.findViewById(R.id.adminActivityTaskName);
            adminActivityStatusTV = itemView.findViewById(R.id.adminActivityStatus);
        }
    }
}

