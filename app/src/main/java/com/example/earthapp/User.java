package com.example.earthapp;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class User extends AppCompatActivity {
    private int point;
    private boolean task_completed;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isTask_completed() {
        return task_completed;
    }

    public void setTask_completed(boolean task_completed) {
        this.task_completed = task_completed;
    }
}
