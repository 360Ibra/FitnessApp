package com.example.fitnessapp;

public class WorkoutModel {

    String reps ;
    String excerciseName;
    int image;

    public WorkoutModel(String reps, String excerciseName, int image) {
        this.reps = reps;
        this.excerciseName = excerciseName;
        this.image = image;
    }

    public String getReps() {
        return reps;
    }

    public String getExcerciseName() {
        return excerciseName;
    }

    public int getImage() {
        return image;
    }
}
