package com.car.carapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.car.carapp.specs.Specs;

public class MainActivity extends AppCompatActivity {

    public EditText editType;
    public EditText editPas;
    public EditText editMS;

    public Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreate = findViewById(R.id.btnCreate);
        editType = findViewById(R.id.editType);
        editPas = findViewById(R.id.editPas);
        editMS = findViewById(R.id.editMaxSpeed);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Specs car = createCar(editType.getText().toString(),editPas.getText().toString(), editMS.getText().toString());
                start(car.getType(),car.getPassengers(),car.getMaxSpeed());
            }
        });
    }

    private void start(String type, String pas, String maxSpeed){
        Intent intent = new Intent(this,ResultActivity.class).putExtra("type",type).putExtra("pas",pas).putExtra("maxSpeed",maxSpeed);
        startActivity(intent);
    }
    public static Specs createCar(String type, String pas, String maxSpeed){
        Specs specs = new Specs(type, pas, maxSpeed);
        return specs;
    }
}
