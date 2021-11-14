package com.dikakoko.tugassatu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BudgetAdapter extends RecyclerView.Adapter<BudgetAdapter.ViewHolder> {
    ArrayList<Budget> data;
    public BudgetAdapter(ArrayList<Budget> data){
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_budget, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView desc, pengeluaran, pemasukan, sisa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            desc = itemView.findViewById(R.id.tv_desc);
            pengeluaran = itemView.findViewById(R.id.tv_pengeluaran);
            pemasukan = itemView.findViewById(R.id.tv_pemasukan);
            sisa = itemView.findViewById(R.id.tv_sisa);
        }

        public void bindData(Budget data){
            desc.setText("Deskripsi: " + data.getDeskripsi());
            pengeluaran.setText("Pengeluaran: Rp." + String.valueOf(data.getPengeluaran()));
            pemasukan.setText("Pemasukan: Rp." + String.valueOf(data.getPemasukan()));
            sisa.setText("Sisa: Rp." + String.valueOf(data.getSisa()));
        }
    }
}
