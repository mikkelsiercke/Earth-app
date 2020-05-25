package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Task_Dry extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean     running;
    private Button      startButton;
    private Button      stopButton;
    private long        timeBathing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_task_dry);

        startButton = findViewById(R.id.startChronometer);
        stopButton  = findViewById(R.id.stopChronometer);
        chronometer = findViewById(R.id.chronometer);

        waterTask();
    }

    public void waterTask(){
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!running){
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    chronometer.start();
                    timeBathing = (long) 0.0000;
                    running = true;
                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(running){
                    chronometer.stop();
                    timeBathing = SystemClock.elapsedRealtime() - chronometer.getBase();
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    running = false;
                }
            }
        });

        MainActivity.user.setPoint(250);

        if(timeBathing > 5 * 1000 && timeBathing < 15 * 1000){
            MainActivity.user.setPoint(250);
        }else if(timeBathing >  15 * 1000 && timeBathing < 30 * 1000){
            MainActivity.user.setPoint(100);
        }else if(timeBathing > 30 * 1000 && timeBathing < 60 * 1000){
            MainActivity.user.setPoint(50);
        }
    }

    public void return_to_homepage(View view) {
        Intent intent = new Intent(this, HomePage.class);
        intent.putExtra("COMPLETED", new Boolean(true));
        MainActivity.user.setTask_completed(true);
        startActivity(intent);
    }
}
