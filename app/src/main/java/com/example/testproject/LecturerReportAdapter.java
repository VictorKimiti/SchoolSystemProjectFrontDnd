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

public class LecturerReportAdapter extends RecyclerView.Adapter<LecturerReportAdapter.MyViewHolder8> {
    private ArrayList<LecturerReportModel> lecturerReportModelArrayList;
    private final LecturerReportRVInterface lecturerReportRVInterface;

    public LecturerReportAdapter(ArrayList<LecturerReportModel> lecturerReportModelArrayList, LecturerReportRVInterface lecturerReportRVInterface) {
        this.lecturerReportModelArrayList = lecturerReportModelArrayList;
        this.lecturerReportRVInterface = lecturerReportRVInterface;
    }

    @Override
    public LecturerReportAdapter.MyViewHolder8 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lecturer_report_card, parent, false);
        return new LecturerReportAdapter.MyViewHolder8(view, lecturerReportRVInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull LecturerReportAdapter.MyViewHolder8 holder, int position) {
        LecturerReportModel model = lecturerReportModelArrayList.get(position);
        holder.lecturerReportNameTV.setText(model.getReportName());
        holder.lecturerReportCategoryTV.setText(model.getReportCategory());
    }

    @Override
    public int getItemCount() {
        return lecturerReportModelArrayList.size();
    }

    public static class MyViewHolder8 extends RecyclerView.ViewHolder {
        private final TextView lecturerReportNameTV;
        private final TextView lecturerReportCategoryTV;

        public MyViewHolder8(@NonNull View itemView, LecturerReportRVInterface lecturerReportRVInterface) {
            super(itemView);
            lecturerReportNameTV = itemView.findViewById(R.id.lecturerReportName);
            lecturerReportCategoryTV = itemView.findViewById(R.id.lecturerReportCategory);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (lecturerReportRVInterface != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            lecturerReportRVInterface.onLecturerReportClick(pos);
                        }
                    }
                }
            });
        }
    }
}
