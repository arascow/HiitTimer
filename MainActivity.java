package com.example.moham.hiittimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button tabataButton;
    public Button BMI_Calculator;
    public Button Calories_count;
    public Button Hiit_Timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabataButton = (Button)findViewById(R.id.TabataTimer);
        BMI_Calculator = (Button)findViewById(R.id.BMI_Calculator);
        Calories_count = (Button)findViewById(R.id.CaloriesCount);
        Hiit_Timer = (Button)findViewById(R.id.HiitTimer);
        tabataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this,tabata_stopwatch.class);
                startActivity(intent);
            }
        });
        BMI_Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BMI_Calculator.class);
                startActivity(intent);
            }
        });
        Calories_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,BMR.class);
                startActivity(intent);
            }
        });
        Hiit_Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,hiitTimer.class);
                startActivity(intent);
            }
        });
    }
}

