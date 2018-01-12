package com.android.andrewtenajeros.bugtongbugtong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class bugtongActivity extends AppCompatActivity {

 


    Button button_stop, button_A, button_B, button_C, button_D;
    TextView textView_time, textView_currentUsername, textView_score,debug;
    EditText editText_question;

    DatabaseHelper databaseHelper;
    String currentUsername;

    CountDownTimer timer;
    bugtongs bugtong;
    long remainingSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugtong);

        textView_time = (TextView) findViewById(R.id.textView_time);
        textView_currentUsername = (TextView) findViewById(R.id.textView_currentUsername);
        textView_score = (TextView) findViewById(R.id.textView_score);
        editText_question = (EditText) findViewById(R.id.editText_question);
        button_A = (Button) findViewById(R.id.button_A);
        button_B = (Button) findViewById(R.id.button_B);
        button_C = (Button) findViewById(R.id.button_C);
        button_D = (Button) findViewById(R.id.button_D);
        debug = (TextView) findViewById(R.id.debug);
        bugtong = new bugtongs();
//
//        final ProgressBar mProgressBar;
//        final CountDownTimer mCountDownTimer;
//        final int[] i = {0};
//
//        mProgressBar=(ProgressBar)findViewById(R.id.progressBarToday);
//        mProgressBar.setProgress(i[0]);
//        mCountDownTimer=new CountDownTimer(30000,1000) {
//
//            @Override
//            public void onTick(long millisUntilFinished) {
//                Log.v("Log_tag", "Tick of Progress"+ i[0] + millisUntilFinished);
//                i[0]++;
//                mProgressBar.setProgress((int) i[0] *20);
//
//            }
//
//            @Override
//            public void onFinish() {
//                //Do what you want
//                i[0]++;
//                mProgressBar.setProgress(100);
//            }
//        };
//        mCountDownTimer.start();

        final ProgressBar mProgressBar;
        CountDownTimer mCountDownTimer;
        final int[] i = {0};

        mProgressBar=(ProgressBar)findViewById(R.id.progressBarToday);
        mProgressBar.setProgress(i[0]);
        mCountDownTimer=new CountDownTimer(120000,1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("Log_tag", "Tick of Progress"+ i[0] + millisUntilFinished);
                i[0]++;
                mProgressBar.setProgress((int) i[0] *100/(202000/1000));

            }

            @Override
            public void onFinish() {
                //Do what you want
                i[0]++;
                mProgressBar.setProgress(100);
            }
        };
        mCountDownTimer.start();

        databaseHelper = new DatabaseHelper(this);

        //String currentUsername = uicGetIntentExtra("currentUsername");
        currentUsername = uicGetSharedPreferenceValue("userInfo","username");
        textView_currentUsername.setText(currentUsername);

        uicCountDown(textView_time, 121);
        generatebugtong();
        bugtongs.SCORE = 0;

        button_stop = (Button) findViewById(R.id.button_stop);
        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUserData();
            }
        });


        button_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("A", view);
            }
        });

        button_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("B", view);
            }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("C", view);
            }
        });

        button_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("D", view);
            }
        });
    }





    public void generatebugtong(){
        final int currentIndex = bugtongs.questionShown;
        if(currentIndex==(bugtong.TOTAL_SIZE-1)){
            saveUserData();
        }else{
            bugtongs.questionShown++;
        }

        editText_question.setText(bugtong.getbugtong(bugtongs.questionShown));
        button_A.setText(bugtong.getChoices(bugtongs.questionShown,0));
        button_B.setText(bugtong.getChoices(bugtongs.questionShown,1));
        button_C.setText(bugtong.getChoices(bugtongs.questionShown,2));
        button_D.setText(bugtong.getChoices(bugtongs.questionShown,3));
//        uicToastMessage(bugtong.bugtong[bugtongs.questionShown]+bugtong.answer[bugtongs.questionShown]);

//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//            }
//        }, 500);


    }

    public void checkUserAnswer(String choice, final View view){
        int currentIndex = bugtongs.questionShown;

        if(bugtong.answer[currentIndex].equalsIgnoreCase(choice)){
//            uicToastMessage(bugtong.answer[currentIndex]+" "+choice);
            view.setBackgroundResource(R.drawable.rounded_corners_right);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    view.setBackgroundResource(R.drawable.rounded_corners);
                    bugtongs.SCORE += 10;
                    textView_score.setText(bugtongs.SCORE+"");

                }
            }, 500);
            setAnswerCorrect();
        }else{
            bugtongs.SCORE -= 5;
            view.setBackgroundResource(R.drawable.rounded_corners_wrong);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    generatebugtong();
                    view.setBackgroundResource(R.drawable.rounded_corners);

                }
            }, 500);

        }
        textView_score.setText(bugtongs.SCORE+"");
    }

    public void setAnswerCorrect(){
//        uicToastMessage("Correct");

        generatebugtong();
    }

    public void saveUserData(){
        boolean insertData = databaseHelper.addData(currentUsername, bugtongs.SCORE);
        if(insertData) {
            timer.cancel();
            startActivity(new Intent(bugtongActivity.this, leaderboard.class));
        }else{
            uicToastMessage("Something wrong in your database!");
        }
        startActivity(new Intent(bugtongActivity.this, leaderboard.class));
    }

    public void uicCountDown(final TextView textView, int seconds){
        int timeInSeconds = seconds * 1000;
        timer = new CountDownTimer(timeInSeconds, 1000) {

            public void onTick(long millisUntilFinished) {
                remainingSeconds = (millisUntilFinished / 1000);
                textView.setText(""+remainingSeconds);
            }

            public void onFinish() {
                saveUserData();
            }
        }.start();
    }

    public String uicGetIntentExtraValue(String key){
        Bundle mainActivityExtras = getIntent().getExtras();
        String value = mainActivityExtras.getString(key);
        return value;
    }

    public String uicGetSharedPreferenceValue(String sharedPrefName, String key){
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(key, "");
        return value;
    }

    public void uicToastMessage(String message){
        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        saveUserData();
        startActivity(new Intent(bugtongActivity.this, MainActivity.class));

    }

    private static Bundle bundle = new Bundle();
//    ToggleButton tg=(ToggleButton)findViewById(R.id.toggleButton);
    boolean play;
    public void onPause() {
        super.onPause();

        bundle.putBoolean("ToggleButtonState", play);
    }

    @Override
    public void onResume() {
        super.onResume();
//        tg.setChecked(bundle.getBoolean("ToggleButtonState",false)); button
    }

    public void togglesound(View view) {
        play = ((ToggleButton) view).isChecked();
    }
}
