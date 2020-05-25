package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class Friends extends AppCompatActivity implements View.OnClickListener {
    User user1 = new User("Tilde Emma","Test Gymnasiet 1.G", 200);
    User user2 = new User("Halfdan Rasmussen","Test Gymnasiet 1.G", 140);
    User user3 = new User("Astrid Pedersen","Test Gymnasiet 1.G", 300);
    User user4 = new User("Mikkel Siercke","Test Gymnasiet 1.G", 140);

    ArrayList<User> users = new ArrayList<>();

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_friends);

        ImageButton button_home    = findViewById(R.id.button_home);
        ImageButton button_profile = findViewById(R.id.button_profile);
        ImageButton button_tasks   = findViewById(R.id.button_tasks);
        ImageButton button_friends = findViewById(R.id.button_friends);

        button_home.setOnClickListener(this);
        button_profile.setOnClickListener(this);
        button_tasks.setOnClickListener(this);
        button_friends.setOnClickListener(this);


        //ArrayAdapter adapter = new ArrayAdapter<User>(this,R.layout.activity_listview, users);

        ListView listView = (ListView)findViewById(R.id.window_list);
        //listView.setAdapter(adapter);

         users.add(MainActivity.user);
         users.add(user1);
         users.add(user2);
         users.add(user3);
         users.add(user4);

        LeaderboardAdapter leaderboardAdapter = new LeaderboardAdapter(this, users);
        listView.setAdapter(leaderboardAdapter);


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
