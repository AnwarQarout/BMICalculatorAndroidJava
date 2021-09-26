package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonClick(View view){
        EditText heightEditText = findViewById(R.id.height_input);
        EditText weightEditText = findViewById(R.id.weight_input);

        double heightValue = Integer.parseInt(heightEditText.getText().toString());
        double weightValue = Integer.parseInt(weightEditText.getText().toString());

        heightValue = heightValue/100;

        double bmi = (weightValue / Math.pow(heightValue,2));

        Toast.makeText(this,"your BMI is "+bmi,Toast.LENGTH_SHORT).show();
    }
}