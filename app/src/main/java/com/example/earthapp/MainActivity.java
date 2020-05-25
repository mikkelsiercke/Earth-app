package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static User user = new User("Anette Tester","",0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        ImageButton button_login = findViewById(R.id.button_login);
    }


    public void start_login(View view) {
        Toast.makeText(this,"Logget Ind", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

}
