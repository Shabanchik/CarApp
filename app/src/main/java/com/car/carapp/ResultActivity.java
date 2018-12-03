package com.car.carapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.result);

        String type = getIntent().getStringExtra("type");
        String pas = getIntent().getStringExtra("pas");
        String maxSpeed = getIntent().getStringExtra("maxSpeed");
        result.setText("Машина типа: " + type + " в которую может влезть " +  pas + " пассажиров и которая разганяется максимум до " + maxSpeed + " км/час создана успешно!");
    }
}
