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

public class AdminTaskReportAdapter extends RecyclerView.Adapter<AdminTaskReportAdapter.MyViewHolder7> {
    private ArrayList<AdminTaskReportModel> adminTaskReportModelArrayList;
    private final AdminTaskReportRVInterface adminTaskReportRVInterface;

    public AdminTaskReportAdapter(ArrayList<AdminTaskReportModel> adminTaskReportModelArrayList, AdminTaskReportRVInterface adminTaskReportRVInterface) {
        this.adminTaskReportModelArrayList = adminTaskReportModelArrayList;
        this.adminTaskReportRVInterface = adminTaskReportRVInterface;
    }

    @Override
    public AdminTaskReportAdapter.MyViewHolder7 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_task_report_card, parent, false);
        return new AdminTaskReportAdapter.MyViewHolder7(view, adminTaskReportRVInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminTaskReportAdapter.MyViewHolder7 holder, int position) {
        AdminTaskReportModel model = adminTaskReportModelArrayList.get(position);
        holder.adminTaskReportNameTV.setText(model.getReportName());
        holder.adminTaskReportCategoryTV.setText(model.getReportCategory());
    }

    @Override
    public int getItemCount() {
        return adminTaskReportModelArrayList.size();
    }

    public static class MyViewHolder7 extends RecyclerView.ViewHolder {
        private final TextView adminTaskReportNameTV;
        private final TextView adminTaskReportCategoryTV;

        public MyViewHolder7(@NonNull View itemView, AdminTaskReportRVInterface adminTaskReportRVInterface) {
            super(itemView);
            adminTaskReportNameTV = itemView.findViewById(R.id.adminTaskReportName);
            adminTaskReportCategoryTV = itemView.findViewById(R.id.adminTaskReportCategory);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (adminTaskReportRVInterface != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            adminTaskReportRVInterface.onReportClick(pos);
                        }
                    }
                }
            });
        }
    }
}
