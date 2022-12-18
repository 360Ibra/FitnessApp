package com.example.fitnessapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment3 extends Fragment {

    ArrayList<WorkoutModel> workoutModels = new ArrayList<>();
    int[] excerciseGifs = {R.drawable.pushups,R.drawable.pushups,R.drawable.pushups,R.drawable.pushups,R.drawable.pushups};

    public static Fragment3 getInstance(){
        Fragment3 fragment3 = new Fragment3();
        return fragment3;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(getContext(), workoutModels);
        View view =inflater.inflate(R.layout.activity_main3,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.mRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        setUpWorkoutModels();



//        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(getContext(), workoutModels);
//        recyclerView.setAdapter(adapter);

        return  view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void setUpWorkoutModels(){
        String[] excerciseNames = getResources().getStringArray(R.array.excercise_name);
        String[] setsReps = getResources().getStringArray(R.array.sets_reps);

        for(int i =0; i<excerciseNames.length;i++){
            workoutModels.add(new WorkoutModel(setsReps[i],excerciseNames[i],
                    excerciseGifs[i] ));
        }

    }

}
