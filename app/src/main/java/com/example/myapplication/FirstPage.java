package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class FirstPage extends AppCompatActivity {
    ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        ImageView=findViewById(R.id.imageView2);




         ImageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float xDown=0, yDown=0;
                switch(motionEvent.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                        xDown=motionEvent.getX();
                        yDown=motionEvent.getY();

                    break;

                    case MotionEvent.ACTION_UP:
                        float movedX,movedY;
                        movedX=motionEvent.getX();
                        movedY=motionEvent.getY();

                        float distanceX=movedX-xDown;
                        float distanceY=movedY-yDown;


                        ImageView.setX(ImageView.getX()+distanceX);
                        ImageView.setY(ImageView.getY()+distanceY);

                        xDown=movedX;
                        yDown=movedY;
                        break;

                }
                return true;
            }
        });




    }
}