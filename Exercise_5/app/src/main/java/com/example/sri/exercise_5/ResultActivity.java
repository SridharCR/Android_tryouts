package com.example.sri.exercise_5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    SQLiteDatabase mydatabase;
    String info;
    TextView res = (TextView)findViewById(R.id.text);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Cursor resultSet = mydatabase.rawQuery("SELECT * FROM student_table",null);
        resultSet.moveToFirst();
        while(resultSet.isAfterLast()==false)
        {
            info = "Name:\t" + resultSet.getString(0) + "\nDOB:\t" + resultSet.getString(1) + "\nGender:\t" + resultSet.getString(2) + "\nDepartment:\t"+ resultSet.getString(3) + "\nYear:\t"+resultSet.getString(4)+"\nCollege:\t"+resultSet.getString(5);
            resultSet.moveToNext();
        }
        res.setText(info);
    }
    }

