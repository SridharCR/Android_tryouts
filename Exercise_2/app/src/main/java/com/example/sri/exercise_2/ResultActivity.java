package com.example.sri.exercise_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        res = (TextView)findViewById(R.id.resview);
        String details = getIntent().getStringExtra("details");
        res = (TextView)findViewById(R.id.resview);
        res.setText(details);
    }
}
