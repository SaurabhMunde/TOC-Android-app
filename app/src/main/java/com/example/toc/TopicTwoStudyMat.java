package com.example.toc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicTwoStudyMat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_two_study_mat);
    }
    public void IntroductionOfFA(View v){
        Intent i = new Intent(this, TopicTwoPartOne.class);
        startActivity(i);
    }

    public void DFA_AND_NFA(View v){
        Intent i = new Intent(this, TopicTwoPartTwo.class);
        startActivity(i);
    }
    public void MealyMoore(View v){
        Intent i = new Intent(this, TopicTwoPartThree.class);
        startActivity(i);
    }
    public void AppOfFA(View v){
        Intent i = new Intent(this, TopicTwoPartFour.class);
        startActivity(i);
    }

}