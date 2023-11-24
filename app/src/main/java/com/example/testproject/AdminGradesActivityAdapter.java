package com.example.testproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*********************************************************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/

public class AdminGradesActivityAdapter extends RecyclerView.Adapter<AdminGradesActivityAdapter.Viewholder> {
    private final Context context;
    private final ArrayList<AdminGradesModel> adminGradesModelArrayList;

    public AdminGradesActivityAdapter(Context context, ArrayList<AdminGradesModel> adminGradesModelArrayList) {
        this.context = context;
        this.adminGradesModelArrayList = adminGradesModelArrayList;
    }

    @Override
    public AdminGradesActivityAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_grades_card, parent, false);
        return new AdminGradesActivityAdapter.Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminGradesActivityAdapter.Viewholder holder, int position) {
        AdminGradesModel model = adminGradesModelArrayList.get(position);
        holder.studentNameTV.setText("Name: " + model.getStudentName());
        holder.registrationNumberTV.setText("Reg no.: " + model.getRegistrationNumber());
        holder.editMarksET.setText(Integer.toString(model.getGrade()));
    }

    @Override
    public int getItemCount() {
        return adminGradesModelArrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        private final TextView studentNameTV, registrationNumberTV;
        private final EditText editMarksET;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            studentNameTV = itemView.findViewById(R.id.studentName);
            registrationNumberTV = itemView.findViewById(R.id.registrationNumber);
            editMarksET = itemView.findViewById(R.id.editAdminMarks);
        }
    }
}
