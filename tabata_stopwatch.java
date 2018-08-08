package com.example.moham.hiittimer;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.MediaController;
import android.widget.Toast;

public class tabata_stopwatch extends MainActivity {

    private Chronometer chronometer;
    private boolean Starting;
    private long PauseOffset;
  //  public MediaPlayer MP = MediaPlayer.create(tabata_stopwatch.this,R.raw.clock);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabata_stopwatch);
        chronometer = findViewById(R.id.chronometer);
        chronometer.setFormat("Elapsed Time: %s");
    }
    public void StartStopWatch (View view){
        if(!Starting)
        {
            chronometer.setBase(SystemClock.elapsedRealtime() - PauseOffset);
            chronometer.start();
            Starting = true;
            chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                @Override
                public void onChronometerTick(Chronometer chronometer) {
                    long abc=SystemClock.elapsedRealtime()-chronometer.getBase();
                    abc=abc/1000;
                    int value=(int)abc;
                    if(value>6 && value==10)
                    {
                       // MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start Workout!!!",Toast.LENGTH_SHORT).show();
                    }
                    if(value >26 && value == 30)
                    {
                        //MP.start();
                       // Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }
                    if(value >36 &&value == 40)
                    {
                        //MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >56 &&value == 60)
                    {
                        //MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }if(value >66 &&value == 70)
                    {

//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >86 &&value == 90)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }if(value >106 &&value == 110)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >116 &&value == 120)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }if(value >136 &&value == 140)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >146 &&value == 150)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }if(value >166 &&value == 170)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >176 &&value == 180)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }if(value >196 &&value == 200)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >206 &&value == 210)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }if(value >226 &&value == 230)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Rest!!!",Toast.LENGTH_SHORT).show();
                    }if(value >236&&value == 240)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Start!!!",Toast.LENGTH_SHORT).show();
                    }
                    if(value >246 &&value == 250)
                    {
//                        MP.start();
                        //Toast.makeText(tabata_stopwatch.this,"Workout Completed!!!",Toast.LENGTH_SHORT).show();
                    }
                    else
                        {
                           // MP.release();
                        }
                }
            });
        }
    }
    public void PauseStopWatch (View view){
        if(Starting)
        {
            chronometer.stop();
            PauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            Starting = false;
        }
    }
    public void ResetStopWatch (View view){
        chronometer.setBase(SystemClock.elapsedRealtime());
        PauseOffset = 0;
    }
}

