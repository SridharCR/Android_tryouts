package com.example.sri.exercise_4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    ImageView drawingImageView;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);
        String info = getIntent().getStringExtra("shape");
        // Line
        Paint paint = new Paint();
            paint.setColor(Color.rgb(255, 153, 51));
            paint.setStrokeWidth(10);
            int startx = 50;
            int starty = 90;
            int endx = 150;
            int endy = 360;
            canvas.drawLine(startx, starty, endx, endy, paint);




    }

}
