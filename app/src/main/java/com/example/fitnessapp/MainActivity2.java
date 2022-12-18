package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    ArrayList<WorkoutModel> workoutModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        setUpWorkoutModels();


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        getTabs();

    }

    private void setUpWorkoutModels(){
        String[] excerciseNames = getResources().getStringArray(R.array.excercise_name);
        String[] setsReps = getResources().getStringArray(R.array.sets_reps);
        int[] excerciseGifs = { R.drawable.pushups,R.drawable.pushups,R.drawable.pushups,R.drawable.pushups,R.drawable.pushups};

        for(int i =0; i<excerciseNames.length;i++){
            workoutModels.add(new WorkoutModel(setsReps[i],excerciseNames[i],
           excerciseGifs[i] ));
        }

    }
    public void getTabs(){

        final ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());


        new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });
        viewPageAdapter.addFragment(Fragment1.getInstance(),"Profile");
        viewPageAdapter.addFragment(Fragment2.getInstance(),"Planner");

        viewPageAdapter.addFragment(Fragment3.getInstance(),"Workouts");

        viewPager.setAdapter(viewPageAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}