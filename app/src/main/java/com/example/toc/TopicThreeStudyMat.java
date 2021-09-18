package com.example.toc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicThreeStudyMat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_three_study_mat);
    }

    public void Introduction(View v) {
        Intent i = new Intent(this, TopicThreePartOne.class);
        startActivity(i);
    }

    public void RE_TO_FA(View v) {
        Intent i = new Intent(this, TopicThreePartTwo.class);
        startActivity(i);
    }

    public void FA_TO_RE(View v) {
        Intent i = new Intent(this, TopicThreePartThree.class);
        startActivity(i);
    }

    public void Properties_and_applications(View v) {
        Intent i = new Intent(this, TopicThreePartFour.class);
        startActivity(i);
    }
}