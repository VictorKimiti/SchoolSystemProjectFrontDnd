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
public class LecturerReportActivityAdapter extends RecyclerView.Adapter<LecturerReportActivityAdapter.Viewholder3> {
    private final Context context;
    private final ArrayList<LecturerReportActivityModel> lecturerReportActivityModelArrayList;

    public LecturerReportActivityAdapter(Context context, ArrayList<LecturerReportActivityModel> lecturerReportActivityModelArrayList) {
        this.context = context;
        this.lecturerReportActivityModelArrayList = lecturerReportActivityModelArrayList;
    }

    @Override
    public LecturerReportActivityAdapter.Viewholder3 onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lecturer_activity_report_card, parent, false);
        return new LecturerReportActivityAdapter.Viewholder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LecturerReportActivityAdapter.Viewholder3 holder, int position) {
        LecturerReportActivityModel model = lecturerReportActivityModelArrayList.get(position);
        holder.studentNameTV.setText("Name: " + model.getStudentName());
        holder.registrationNumberTV.setText("Reg no.: " + model.getRegistrationNumber());
    }

    @Override
    public int getItemCount() {
        return lecturerReportActivityModelArrayList.size();
    }

    public static class Viewholder3 extends RecyclerView.ViewHolder {
        private final TextView studentNameTV, registrationNumberTV;

        public Viewholder3(@NonNull View itemView) {
            super(itemView);
            studentNameTV = itemView.findViewById(R.id.studentName);
            registrationNumberTV = itemView.findViewById(R.id.registrationNumber);
        }
    }
}
