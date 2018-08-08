package com.example.moham.hiittimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hiitTimer extends AppCompatActivity {
    //
    public long START_TIME_IN_MILLIS ;
    //private TextView mTextViewCountDown;  Sameas     private TextView Timer;
    // private Button mButtonStartPause;     Sameas     private Button startStopWatch;
    public Button mButtonReset;

    public CountDownTimer mCountDownTimer;
    public boolean mTimerRunning ;
    public long mTimeLeftInMillis;
    //public long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    //
    public int Prep_count = 0;
    public int Active_count = 0;
    public int Round_count = 0;
    public int Rest_count = 0;
    public int coolDown_count , mPrepNCool, mActNRest= 0;
    public String prepTimer,activeTimer, roundTimer, restTimer, cooldownTimer = "0";

    public TextView prep;
    public TextView active;
    public TextView round;
    public TextView rest;
    public TextView cooldown;
    public Button prepPlus;
    public Button prepminus;
    public Button activeplus;
    public Button activeminus;
    public Button roundplus;
    public Button roundminus;
    public Button restplus;
    public Button restminus;
    public Button cooldownplus;
    public Button cooldownminus;
    public Button startStopWatch;
    public TextView Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiit_timer);
        prep = (TextView) findViewById(R.id.Prep_timer_hiit);
        prepPlus = (Button) findViewById(R.id.Increment_Button_PrepTime);
        prepminus = (Button) findViewById(R.id.Decrement_Button_PrepTime);

        active = (TextView) findViewById(R.id.Active_timer_hiit);
        activeplus = (Button) findViewById(R.id.Increment_Button_Active);
        activeminus = (Button) findViewById(R.id.Decrement_Button_Active);

        round = (TextView) findViewById(R.id.Round_timer_hiit);
        roundplus = (Button) findViewById(R.id.Increment_Button_Round);
        roundminus = (Button) findViewById(R.id.Decrement_Button_Round);

        rest = (TextView) findViewById(R.id.Rest_timer_hiit);
        restplus = (Button) findViewById(R.id.Increment_Button_Rest);
        restminus = (Button) findViewById(R.id.Decrement_Button_Rest);

        cooldown = (TextView) findViewById(R.id.CoolDown_timer_hiit);
        cooldownplus = (Button) findViewById(R.id.Increment_Button_CoolDown);
        cooldownminus = (Button) findViewById(R.id.Decrement_Button_CoolDown);
        mButtonReset = findViewById(R.id.button_reset);
        startStopWatch = (Button) findViewById(R.id.Start_Timer_hiit);
        Timer = (TextView)findViewById(R.id.text_view_countdown);

        prepPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updateTimer();
                prepTimer = prep.getText().toString();
                Prep_count = Integer.parseInt(prepTimer);
                Prep_count++;
                prepTimer = Integer.toString(Prep_count);
                prep.setText(prepTimer);
            }
        });
        prepminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Prep_count == 0) {
                    //Toast.makeText(hiitTimer.this,""+Prep_count+"",Toast.LENGTH_SHORT).show();
                } else {
                    //  updateTimer();
                    prepTimer = prep.getText().toString();
                    Prep_count = Integer.parseInt(prepTimer);
                    Prep_count--;
                    prepTimer = Integer.toString(Prep_count);
                    prep.setText(prepTimer);
                }
            }
        });
        activeplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updateTimer();
                activeTimer = active.getText().toString();
                Active_count = Integer.parseInt(activeTimer);
                Active_count++;
                activeTimer = Integer.toString(Active_count);
                active.setText(activeTimer);
            }
        });
        activeminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Active_count == 0) {
                    // Toast.makeText(hiitTimer.this,""+Active_count+"",Toast.LENGTH_SHORT).show();
                } else {
                    //  updateTimer();
                    activeTimer = active.getText().toString();
                    Active_count = Integer.parseInt(activeTimer);
                    Active_count--;
                    activeTimer = Integer.toString(Active_count);
                    active.setText(activeTimer);
                }
            }
        });
        roundplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updateTimer();
                roundTimer = round.getText().toString();
                Round_count = Integer.parseInt(roundTimer);
                Round_count++;
                roundTimer = Integer.toString(Round_count);
                round.setText(roundTimer);
            }
        });
        roundminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Round_count == 0) {
                    // Toast.makeText(hiitTimer.this,""+Prep_count+"",Toast.LENGTH_SHORT).show();
                } else {
                    // updateTimer();
                    roundTimer = round.getText().toString();
                    Round_count = Integer.parseInt(roundTimer);
                    Round_count--;
                    roundTimer = Integer.toString(Round_count);
                    round.setText(roundTimer);
                }
            }
        });
        restplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updateTimer();
                restTimer = rest.getText().toString();
                Rest_count = Integer.parseInt(restTimer);
                Rest_count++;
                restTimer = Integer.toString(Rest_count);
                rest.setText(restTimer);
            }
        });
        restminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Rest_count == 0) {
                    //Toast.makeText(hiitTimer.this,""+Prep_count+"",Toast.LENGTH_SHORT).show();
                } else {
                    //  updateTimer();
                    restTimer = rest.getText().toString();
                    Rest_count = Integer.parseInt(restTimer);
                    Rest_count--;
                    restTimer = Integer.toString(Rest_count);
                    rest.setText(restTimer);
                }
            }
        });
        cooldownplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // updateTimer();
                cooldownTimer = cooldown.getText().toString();
                coolDown_count = Integer.parseInt(cooldownTimer);
                coolDown_count++;
                cooldownTimer = Integer.toString(coolDown_count);
                cooldown.setText(cooldownTimer);
            }
        });
        cooldownminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coolDown_count == 0) {
                    //Toast.makeText(hiitTimer.this,""+Prep_count+"",Toast.LENGTH_SHORT).show();
                } else {
                    //  updateTimer();
                    cooldownTimer = cooldown.getText().toString();
                    coolDown_count = Integer.parseInt(cooldownTimer);
                    coolDown_count--;
                    cooldownTimer = Integer.toString(coolDown_count);
                    cooldown.setText(cooldownTimer);
                }
            }
        });
        startStopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        updateCountDownText();

        // Text watcher lgana hota -_-
        active.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mActNRest = mActNRest + Integer.valueOf(active.getText().toString());
                updateTimerText();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        rest.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mActNRest = mActNRest + Integer.valueOf(rest.getText().toString());
                updateTimerText();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cooldown.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mPrepNCool = mPrepNCool + Integer.valueOf(cooldown.getText().toString());
                updateTimerText();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        round.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                updateTimerText();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        prep.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mPrepNCool = mPrepNCool + Integer.valueOf(prep.getText().toString());
                updateTimerText();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


    private void startTimer() {
        long t1 = (Long.valueOf(activeTimer) + Long.valueOf(restTimer)) * Long.valueOf(roundTimer);
        long t2 = Long.valueOf(prepTimer) + Long.valueOf(cooldownTimer);
        //Tmhara papa ne values ko 1000 se multiply karna tha? -_- milis me convert kisne karna?
        mTimeLeftInMillis = (t1 + t2)*1000;
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                startStopWatch.setText("Start");
                startStopWatch.setVisibility(View.INVISIBLE);
                mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();

        mTimerRunning = true;
        startStopWatch.setText("pause");
        mButtonReset.setVisibility(View.INVISIBLE);
    }

    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        startStopWatch.setText("Start");
        mButtonReset.setVisibility(View.VISIBLE);
    }

    private void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        mButtonReset.setVisibility(View.INVISIBLE);
        startStopWatch.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) ((mTimeLeftInMillis / 1000) / 60);
        int seconds = (int) ((mTimeLeftInMillis / 1000) % 60);
        String TimeLeftFormat = String.format("%02d:%02d",minutes,seconds);
        Timer.setText(TimeLeftFormat);
    }

    public void updateTimerText()
    {
        int Total = 0 ;
        if(Round_count==1)
        {
            Total = Active_count+Rest_count+Prep_count+coolDown_count;
        }
        else if(Round_count>=1)
        {
            Total = (Round_count*(Active_count+Rest_count))+Prep_count+coolDown_count;
        }
        else if(Round_count==0){
            Toast.makeText(hiitTimer.this,"Enter Rounds",Toast.LENGTH_SHORT).show();
        }
        Total = Total*1000;
        int minutes = (int) ((Total / 1000) / 60);
        int seconds = (int) ((Total / 1000) % 60);
        String TimeLeftFormat = String.format("%02d:%02d",minutes,seconds);
        Timer.setText(TimeLeftFormat);
    }
    // public void updateRound()
    //{
    //  int round = Round_count*(Active_count+Rest_count);
    //}

}

