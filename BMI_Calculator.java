package com.example.moham.hiittimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BMI_Calculator extends AppCompatActivity {

        public TextView KG_textView;
        public TextView Height_textView;
        public EditText KG_EditView;
        public EditText Height_EditView;
        public TextView Bmi_EditView;
        public Button Calculate;
        public TextView Result;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bmi__calculator);

            KG_EditView = (EditText)findViewById(R.id.Weight_Edit_Text);
            Height_EditView = (EditText)findViewById(R.id.Height_Edit_Text);
            Bmi_EditView =(TextView)findViewById(R.id.BMI_answer);
            Calculate = (Button)findViewById(R.id.Calculate_Button);
            Result = (TextView)findViewById(R.id.Result);
            Calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String weight;
                    String height;
                    weight = KG_EditView.getText().toString();
                    Float kg = Float.parseFloat(weight);
                    height = Height_EditView.getText().toString();
                    float m = Float.parseFloat(height);

                    float answer = (kg/(m*m))*703;
                    String ans = Float.toString(answer);
                    Bmi_EditView.setText("Your BMI is "+ans+" %");

                    if(answer <= 18.5)
                    {
                        Result.setText("UnderWeight!!!");
                    }
                    if(answer > 18.5 && answer<24.9)
                    {
                        Result.setText("Normal Weight!!!");
                    }
                    if(answer >25 && answer<29.9)
                    {
                        Result.setText("OverWeight!!!");
                    }
                    if(answer>30)
                    {
                        Result.setText("Obesity!!!");
                    }
                }
            });
        }

    }

