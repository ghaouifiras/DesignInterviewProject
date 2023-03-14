package com.firas.scproject.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firas.scproject.R;
import com.firas.scproject.model.AlertModel;

import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.ViewHolder> {
    private List<AlertModel> list;

    public DashboardAdapter(List<AlertModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.items_dashboard, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AlertModel alertModel = list.get(position);
        holder.txtDesc.setText(alertModel.getDescription());
        holder.txtTitle.setText(alertModel.getTitle());
        holder.txtTime.setText(alertModel.getTime());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitle;
        public TextView txtTime;
        public TextView txtDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            this.txtTitle = (TextView) itemView.findViewById(R.id.title);
            this.txtTime = (TextView) itemView.findViewById(R.id.time);
            this.txtDesc = (TextView) itemView.findViewById(R.id.desc);
        }
    }
}
