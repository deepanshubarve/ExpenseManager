package com.example.expensemanager.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expensemanager.databinding.SampleCatagoryItemBinding;

import java.util.Calendar;

public class CategoryAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{



        SampleCatagoryItemBinding sampleCatagoryItemBinding;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
