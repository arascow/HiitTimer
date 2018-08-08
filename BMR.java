package com.example.moham.hiittimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMR extends AppCompatActivity {
    public TextView Age_TextView;
    public TextView Weight_TextView;
    public TextView Height_TextView;
    public EditText Age_EditText;
    public EditText Weight_EditText;
    public EditText Height_EditText;

    public Button Calculate;
    public TextView BMR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);
        Age_EditText=(EditText)findViewById(R.id.Edit_Age);
        Weight_EditText=(EditText)findViewById(R.id.Edit_Weight);
        Height_EditText=(EditText)findViewById(R.id.Edit_Height);
        Calculate=(Button)findViewById(R.id.Calculate_Button);
        BMR =(TextView)findViewById(R.id.BMR_ID);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String age = Age_EditText.getText().toString();
                int Age = Integer.parseInt(age);
                String weight = Weight_EditText.getText().toString();
                float Weight = Float.parseFloat(weight);
                String height = Height_EditText.getText().toString();
                float Height = Float.parseFloat(height);
                float answer = (int)(66+(6.2*Weight)+(12.7*Height)+(6.76*Age));
                String Answer = Float.toString(answer);
                BMR.setText(Answer);
            }
        });

    }
}

