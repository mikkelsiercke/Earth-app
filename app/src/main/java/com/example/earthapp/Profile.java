package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_profile);

        ImageButton button_home = findViewById(R.id.button_home);
        ImageButton button_profile = findViewById(R.id.button_profile);
        ImageButton button_tasks = findViewById(R.id.button_tasks);
        ImageButton button_friends = findViewById(R.id.button_friends);

        button_home.setOnClickListener(this);
        button_profile.setOnClickListener(this);
        button_tasks.setOnClickListener(this);
        button_friends.setOnClickListener(this);

        change_avatar();
        update_score();
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public void change_avatar() {
        ImageView avatar_dry = findViewById(R.id.image_avatar);

        if (MainActivity.user.isTask_completed() == true) {
            avatar_dry.setImageResource(R.drawable.avatar_happy);
        }
    }

    public void update_score() {
        TextView profile_score = findViewById(R.id.text_score);
        String   score         = Integer.toString(MainActivity.user.getPoint());

        profile_score.setText(score);
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
        }
    }
}
