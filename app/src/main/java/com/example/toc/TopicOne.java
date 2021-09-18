package com.example.toc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_one);
    }

    public void TopicOneStudy(View v){
        Intent i = new Intent(this, TopicOneStudyMat.class);
        startActivity(i);
    }

    public void TopicOneQuiz(View v){
        Intent i = new Intent(this, TopicOneQuizmat.class);
        startActivity(i);
    }

    public void TopicOneVideo(View v){
        Intent i = new Intent(this, TopicOneVideoMat.class);
        startActivity(i);
    }
}