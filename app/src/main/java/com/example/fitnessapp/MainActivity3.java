package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    ArrayList<WorkoutModel> workoutModels = new ArrayList<>();
    int[] excerciseGifs = {R.drawable.pushups,R.drawable.pushups,R.drawable.pushups,R.drawable.pushups,R.drawable.pushups};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);


        setUpWorkoutModels();

        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this,workoutModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




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