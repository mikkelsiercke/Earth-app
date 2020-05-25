package com.example.earthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Task_power extends AppCompatActivity implements View.OnClickListener {

    private int point = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_task_power);

        CheckBox check_tv       = findViewById(R.id.check_tv);
        CheckBox check_charger  = findViewById(R.id.check_charger);
        CheckBox check_computer = findViewById(R.id.check_computer);
        CheckBox check_games    = findViewById(R.id.check_game);
        CheckBox check_light    = findViewById(R.id.check_light);
        CheckBox check_kitchen  = findViewById(R.id.check_kitchen);
        CheckBox check_bathroom = findViewById(R.id.check_bathroom);

        check_tv.setOnClickListener(this);
        check_charger.setOnClickListener(this);
        check_computer.setOnClickListener(this);
        check_games.setOnClickListener(this);
        check_light.setOnClickListener(this);
        check_kitchen.setOnClickListener(this);
        check_bathroom.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.check_tv:
            case R.id.check_charger:
            case R.id.check_computer:
            case R.id.check_game:
            case R.id.check_light:
            case R.id.check_kitchen:
            case R.id.check_bathroom:
                if(checked) {
                    MainActivity.user.setPoint(point);
                    Toast.makeText(this,"point " + MainActivity.user.getPoint(),Toast.LENGTH_SHORT).show();
                } else {
                    MainActivity.user.removePoint(point);
                    Toast.makeText(this,"point " + MainActivity.user.getPoint(),Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
