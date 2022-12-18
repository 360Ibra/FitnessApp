package com.example.fitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class AA_RecyclerViewAdapter extends RecyclerView.Adapter<AA_RecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<WorkoutModel> workoutModels;

     public AA_RecyclerViewAdapter(Context context, ArrayList<WorkoutModel> workoutModels){
         this.context =context;
         this.workoutModels = workoutModels;

     }

    @NonNull
    @Override
    public AA_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);
        return new AA_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapter.MyViewHolder holder, int position) {
         holder.tvName.setText(workoutModels.get(position).getExcerciseName());
         holder.tvReps.setText(workoutModels.get(position).getReps());

        Glide.with(context)
                .load(workoutModels.get(position).getImage())
                .into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return workoutModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvName;
        TextView tvReps;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
            tvReps= itemView.findViewById(R.id.textView3);
        }
    }
}
