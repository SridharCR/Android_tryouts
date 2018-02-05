package com.example.sri.exercise_3;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private int count=0;
    private String expression="";
    private String text="";
    private Double result=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);


    }

}
