package com.example.testproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReportFragmentAdapter extends RecyclerView.Adapter<ReportFragmentAdapter.HolderStud> {

    private ArrayList<ReportFragmentModel> reportFragmentModelArrayList;

    public ReportFragmentAdapter(ArrayList<ReportFragmentModel> reportFragmentModelArrayList) {
        this.reportFragmentModelArrayList = reportFragmentModelArrayList;
    }

    @Override
    public ReportFragmentAdapter.HolderStud onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_report_card, parent, false);
        return new ReportFragmentAdapter.HolderStud(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportFragmentAdapter.HolderStud holder, int position) {
        ReportFragmentModel model = reportFragmentModelArrayList.get(position);
        holder.unitNameTV.setText("Unit: " + model.getUnitName());
        holder.unitGradeTV.setText("Grade: " + model.getUnitGrade());
    }

    @Override
    public int getItemCount() {
        return reportFragmentModelArrayList.size();
    }

    public static class HolderStud extends RecyclerView.ViewHolder {
        private final TextView unitNameTV;
        private final TextView unitGradeTV;

        public HolderStud(@NonNull View itemView) {
            super(itemView);
            unitNameTV = itemView.findViewById(R.id.unitReportName);
            unitGradeTV = itemView.findViewById(R.id.unitGrade);
        }
    }

}
