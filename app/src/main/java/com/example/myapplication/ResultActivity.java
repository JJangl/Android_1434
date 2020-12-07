package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private String RAnswer;
private TextView ResultAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        RAnswer = getIntent().getStringExtra("result");
        ResultAnswer=findViewById(R.id.resultShow);
        ResultAnswer.setText(RAnswer);

    }
}