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

public class LecturerTaskAdapter extends RecyclerView.Adapter<LecturerTaskAdapter.MyViewHolder3> {

    private ArrayList<LecturerTaskModel> lecturerTaskModelArrayList;
    private final LecturerTaskRVInterface lecturerTaskRVInterface;

    public LecturerTaskAdapter(ArrayList<LecturerTaskModel> lecturerTaskModelArrayList, LecturerTaskRVInterface lecturerTaskRVInterface) {
        this.lecturerTaskModelArrayList = lecturerTaskModelArrayList;
        this.lecturerTaskRVInterface = lecturerTaskRVInterface;
    }

    @Override
    public MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lecturer_task_card, parent, false);
        return new MyViewHolder3(view, lecturerTaskRVInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        LecturerTaskModel model = lecturerTaskModelArrayList.get(position);
        holder.taskNameTV.setText(model.getTask_name());
        holder.taskUnitTV.setText(model.getUnit());
    }

    @Override
    public int getItemCount() {
        return lecturerTaskModelArrayList.size();
    }

    public static class MyViewHolder3 extends RecyclerView.ViewHolder {
        private final TextView taskNameTV;
        private final TextView taskUnitTV;

        public MyViewHolder3(@NonNull View itemView, LecturerTaskRVInterface lecturerTaskRVInterface) {
            super(itemView);
            taskNameTV = itemView.findViewById(R.id.taskName);
            taskUnitTV = itemView.findViewById(R.id.taskUnit);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (lecturerTaskRVInterface != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            lecturerTaskRVInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
