package com.example.sri.exercise_5;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String info;
    Button insert,delete,update,view,reset;
    EditText name,dob,year,clg;
    RadioButton m,f,b;
    RadioGroup gender;
    String n_val,d_val,y_val,c_val,g_val,dep_val;
    Spinner spinner;
    SQLiteDatabase mydatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydatabase = openOrCreateDatabase("stud",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS student_table(name VARCHAR,dob VARCHAR,gender VARCHAR,dept VARCHAR,year VARCHAR,college VARCHAR);");
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dept, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        gender = (RadioGroup)findViewById(R.id.radg);
        m = (RadioButton)findViewById(R.id.rad1);
        f = (RadioButton)findViewById(R.id.rad2);
        name = (EditText)findViewById(R.id.name);
        dob = (EditText)findViewById(R.id.dob);
        year = (EditText)findViewById(R.id.year);
        clg = (EditText)findViewById(R.id.clg);
        insert = (Button)findViewById(R.id.insert);
        view = (Button)findViewById(R.id.view);

        reset = (Button)findViewById(R.id.reset);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n_val = name.getText().toString();
                d_val = dob.getText().toString();
                y_val = year.getText().toString();
                c_val = clg.getText().toString();
                b = (RadioButton)findViewById(gender.getCheckedRadioButtonId());
                g_val = b.getText().toString();
                dep_val = spinner.getSelectedItem().toString();
                info = "Name:\t" + n_val + "\nDOB:\t" + d_val + "\nYear:\t" + y_val + "\nCollege:\t"+ c_val+ "\nGender:\t"+g_val+"\nDept:\t"+dep_val;
                String text = spinner.getSelectedItem().toString();
                mydatabase.execSQL("INSERT INTO student_table VALUES(n_val,d_val,g_val,dep_val,y_val,c_val)");

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                dob.setText("");
                year.setText("");
                clg.setText("");
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                resultIntent.putExtra("details", info);
                startActivity(resultIntent);
            }
        });

    }
}
