package com.example.testproject;

import android.content.Context;
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

public class AdminReportActivityAdapter extends RecyclerView.Adapter<AdminReportActivityAdapter.Viewholder2> {
    private final Context context;
    private final ArrayList<AdminReportModel> adminReportModelArrayList;

    public AdminReportActivityAdapter(Context context, ArrayList<AdminReportModel> adminReportModelArrayList) {
        this.context = context;
        this.adminReportModelArrayList = adminReportModelArrayList;
    }

    @Override
    public AdminReportActivityAdapter.Viewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_report_card, parent, false);
        return new AdminReportActivityAdapter.Viewholder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminReportActivityAdapter.Viewholder2 holder, int position) {
        AdminReportModel model = adminReportModelArrayList.get(position);
        holder.studentNameTV.setText("Name: " + model.getStudentName());
        holder.registrationNumberTV.setText("Reg no.: " + model.getRegistrationNumber());
    }

    @Override
    public int getItemCount() {
        return adminReportModelArrayList.size();
    }

    public static class Viewholder2 extends RecyclerView.ViewHolder {
        private final TextView studentNameTV, registrationNumberTV;

        public Viewholder2(@NonNull View itemView) {
            super(itemView);
            studentNameTV = itemView.findViewById(R.id.studentName);
            registrationNumberTV = itemView.findViewById(R.id.registrationNumber);
        }
    }
}
