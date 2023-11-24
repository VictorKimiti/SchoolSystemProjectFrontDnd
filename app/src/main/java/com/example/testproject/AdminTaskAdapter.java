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

public class AdminTaskAdapter extends RecyclerView.Adapter<AdminTaskAdapter.MyViewHolder6> {

    private ArrayList<AdminTaskModel> adminTaskModelArrayList;
    private final AdminTaskRVInterface adminTaskRVInterface;

    public AdminTaskAdapter(ArrayList<AdminTaskModel> adminTaskModelArrayList, AdminTaskRVInterface adminTaskRVInterface) {
        this.adminTaskModelArrayList = adminTaskModelArrayList;
        this.adminTaskRVInterface = adminTaskRVInterface;
    }

    @Override
    public AdminTaskAdapter.MyViewHolder6 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_task_card, parent, false);
        return new AdminTaskAdapter.MyViewHolder6(view, adminTaskRVInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminTaskAdapter.MyViewHolder6 holder, int position) {
        AdminTaskModel model = adminTaskModelArrayList.get(position);
        holder.adminTaskNameTV.setText(model.getAdminTaskName());
        holder.adminTaskUnitTV.setText(model.getAdminTaskUnit());
    }

    @Override
    public int getItemCount() {
        return adminTaskModelArrayList.size();
    }

    public static class MyViewHolder6 extends RecyclerView.ViewHolder {
        private final TextView adminTaskNameTV;
        private final TextView adminTaskUnitTV;

        public MyViewHolder6(@NonNull View itemView, AdminTaskRVInterface adminTaskRVInterface) {
            super(itemView);
            adminTaskNameTV = itemView.findViewById(R.id.adminTaskName);
            adminTaskUnitTV = itemView.findViewById(R.id.adminTaskUnit);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (adminTaskRVInterface != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            adminTaskRVInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
