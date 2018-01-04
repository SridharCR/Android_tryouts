package com.example.sri.exercise_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button line,circle,square,rectangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        line = (Button)findViewById(R.id.line);
        circle = (Button)findViewById(R.id.circle);
        square = (Button)findViewById(R.id.square);

        line.setOnClickListener(this);
        circle.setOnClickListener(this);
        square.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        String shape;
        switch (view.getId()) {
            case R.id.line:
                Intent intent = new Intent(this, ResultActivity.class);
                this.startActivity(intent);
                break;
            case R.id.circle:
                Intent inten = new Intent(this, ResultActivity1.class);
                this.startActivity(inten);
                break;
            case R.id.square:
                Intent inte = new Intent(this, ResultActivity2.class);
                this.startActivity(inte);

                break;

        }
    }
}
