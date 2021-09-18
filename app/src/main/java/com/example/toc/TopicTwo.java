package com.example.toc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_two);
    }

    public void TopicTwoStudy(View v){
        Intent i = new Intent(this, TopicTwoStudyMat.class);
        startActivity(i);
    }

    public void TopicTwoQuiz(View v){
        Intent i = new Intent(this, TopicTwoQuizmat.class);
        startActivity(i);
    }

    public void TopicTwoVideo(View v){
        Intent i = new Intent(this, TopicTwoVideoMat.class);
        startActivity(i);
    }
}