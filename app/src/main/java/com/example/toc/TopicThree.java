package com.example.toc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_three);
    }

    public void TopicThreeStudy(View v){
        Intent i = new Intent(this, TopicThreeStudyMat.class);
        startActivity(i);
    }

    public void TopicThreeQuiz(View v){
        Intent i = new Intent(this, TopicThreeQuizmat.class);
        startActivity(i);
    }

    public void TopicThreeVideo(View v){
        Intent i = new Intent(this, TopicThreeVideoMat.class);
        startActivity(i);
    }
}