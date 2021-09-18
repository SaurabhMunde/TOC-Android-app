package com.example.toc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
public class TopicOneQuizmat extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore,rep=0;
    private int mQuestionsLength = mQuestions.mQuestions.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_one_quizmat);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.blink_anim);


        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R. id. question);


        score.setText("Score: " + mScore);
        updateQuestion(rep);
        rep++;


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer1.getText() == mAnswer){
                    score.startAnimation(animation1);
                    mScore++;
                    score.setText("Score: " + mScore);
                    if(rep<3) {
                        updateQuestion(rep);
                        rep++;
                    }
                    else{
                        gamePass();
                    }
                }else {
                    gameOver();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == mAnswer){
                    score.startAnimation(animation1);
                    mScore++;
                    score.setText("Score: " + mScore);
                    if(rep<3) {
                        updateQuestion(rep);
                        rep++;
                    }
                    else{
                        gamePass();
                    }
                }else {
                    gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == mAnswer){
                    score.startAnimation(animation1);
                    mScore++;
                    score.setText("Score: " + mScore);
                    if(rep<3) {
                        updateQuestion(rep);
                        rep++;
                    }
                    else{
                        gamePass();
                    }
                }else {
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText() == mAnswer){
                    score.startAnimation(animation1);
                    mScore++;
                    score.setText("Score: " + mScore);
                    if(rep<3) {
                        updateQuestion(rep);
                        rep++;
                    }
                    else{
                        gamePass();
                    }
                }else {
                    gameOver();
                }

            }
        });
    }


    private void updateQuestion(int num){
        final Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.bounce);
        final Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
        question.startAnimation(animation2);
        question.setText(mQuestions.getQuestion(num));
        answer1.startAnimation(animation1);
        answer1.setText(mQuestions.getChoice1(num));
        answer2.startAnimation(animation1);
        answer2.setText(mQuestions.getChoice2(num));
        answer3.startAnimation(animation1);
        answer3.setText(mQuestions.getChoice3(num));
        answer4.startAnimation(animation1);
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);

    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Quiz Failed! Your Score is " + mScore + " Points.").setCancelable(false)
                .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //startActivity(new Intent(getApplicationContext(), TopicOne.class));
                        finish();
                    }
                }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void gamePass(){
        AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(this);
        alertDialogBuilder1.setMessage("Quiz Passed Your Score is " + mScore + " Points.").setCancelable(false)
                .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //startActivity(new Intent(getApplicationContext(), TopicOne.class));
                        finish();
                    }
                }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        AlertDialog alertDialog1 = alertDialogBuilder1.create();
        alertDialog1.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}