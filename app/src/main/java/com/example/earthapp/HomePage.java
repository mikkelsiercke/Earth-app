package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_home_page);

        ImageButton button_home    = findViewById(R.id.button_home);
        ImageButton button_profile = findViewById(R.id.button_profile);
        ImageButton button_tasks   = findViewById(R.id.button_tasks);
        ImageButton button_friends = findViewById(R.id.button_friends);

        Button button_change       = findViewById(R.id.button_change);

        button_home.setOnClickListener(this);
        button_profile.setOnClickListener(this);
        button_tasks.setOnClickListener(this);
        button_friends.setOnClickListener(this);

        button_change.setOnClickListener(this);

        CheckBox task_completed = findViewById(R.id.checkBox_task);

        ImageView avatar_dry    = findViewById(R.id.image_avatar);
        TextView  avatar_status = findViewById(R.id.avatar_status);

        String    avatar_happy  = getString(R.string.status_happy);

        if (MainActivity.user.isTask_completed() == true) {
            avatar_dry.setImageResource(R.drawable.avatar_happy);
            avatar_status.setText(avatar_happy);
            task_completed.setChecked(true);
            Toast.makeText(this,"Tilføjet 250 point", Toast.LENGTH_SHORT).show();
        }
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
        }
    }
}
