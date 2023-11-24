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
 * ****************LECTURER MODULE******************
 *
 * DO NOT TAMPER WITH THIS CODE UNLESS VICTOR TELLS YOU TO
 *
 * ********************************************************/
public class GradesActivityAdapter extends RecyclerView.Adapter<GradesActivityAdapter.Viewholder> {
    private final Context context;
    private final ArrayList<GradesModel> gradesModelArrayList;

    public GradesActivityAdapter(Context context, ArrayList<GradesModel> gradesModelArrayList) {
        this.context = context;
        this.gradesModelArrayList = gradesModelArrayList;
    }

    @Override
    public GradesActivityAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grades_card, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GradesActivityAdapter.Viewholder holder, int position) {
        GradesModel model = gradesModelArrayList.get(position);
        holder.studentNameTV.setText("Name: " + model.getStudentName());
        holder.registrationNumberTV.setText("Reg no.: " + model.getRegistrationNumber());
        holder.editMarksET.setText(Integer.toString(model.getGrade()));
    }

    @Override
    public int getItemCount() {
        return gradesModelArrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        private final TextView studentNameTV, registrationNumberTV;
        private final EditText editMarksET;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            studentNameTV = itemView.findViewById(R.id.studentName);
            registrationNumberTV = itemView.findViewById(R.id.registrationNumber);
            editMarksET = itemView.findViewById(R.id.editMarks);
        }
    }
}
