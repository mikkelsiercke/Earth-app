package com.example.earthapp;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class User extends AppCompatActivity {
    private int     point;
    private String  name;
    private String  school;

    private boolean task_completed;
    private boolean task_completed_bonus;

    public User() { }

    public User(String name, String school, int point) {
        this.name = name;
        this.school = school;
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point += point;
    }

    public void removePoint(int point) {
        this.point -= point;
    }

    public boolean isTask_completed() {
        return task_completed;
    }

    public void setTask_completed(boolean task_completed) {
        this.task_completed = task_completed;
    }

    public boolean isTask_completed_bonus() {
        return task_completed_bonus;
    }

    public void setTask_completed_bonus(boolean task_completed_bonus) {
        this.task_completed_bonus = task_completed_bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
