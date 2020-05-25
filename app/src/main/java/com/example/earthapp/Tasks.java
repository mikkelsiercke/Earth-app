package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tasks extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_tasks);

        ImageButton button_home    = findViewById(R.id.button_home);
        ImageButton button_profile = findViewById(R.id.button_profile);
        ImageButton button_tasks   = findViewById(R.id.button_tasks);
        ImageButton button_friends = findViewById(R.id.button_friends);

        button_home.setOnClickListener(this);
        button_profile.setOnClickListener(this);
        button_tasks.setOnClickListener(this);
        button_friends.setOnClickListener(this);

        Button button_2 = findViewById(R.id.button2);
        Button button_3 = findViewById(R.id.button3);
        Button button_4 = findViewById(R.id.button4);
        Button button_5 = findViewById(R.id.button5);
        Button button_6 = findViewById(R.id.button6);
        Button button_7 = findViewById(R.id.button7);

        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);


    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_home:
                Intent intent_home = new Intent(this,HomePage.class);
                intent_home.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_home);
                break;

            case R.id.button_profile:
                Intent intent_profile = new Intent(this,Profile.class);
                intent_profile.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_profile);
                break;

            case R.id.button_tasks:
                Intent intent_tasks = new Intent(this,Tasks.class);
                intent_tasks.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_tasks);
                break;

            case R.id.button_friends:
                Intent intent_friends = new Intent(this,Friends.class);
                intent_friends.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_friends);
                break;

            case R.id.button_change:
                Intent intent_start_task = new Intent(this,Task_Dry.class);
                intent_start_task.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_start_task);
                break;

            case R.id.button2:
                Intent intent_task_2 = new Intent(this, Task_power.class);
                startActivity(intent_task_2);
                break;
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
                Toast.makeText(this, "Under udvikling", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
