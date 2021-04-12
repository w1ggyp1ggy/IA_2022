package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayCreation extends AppCompatActivity {

    ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_creation);

        imgView1= (ImageView) findViewById(R.id.imageView);

        imgView1.setOnLongClickListener(longClickListener);
    }

    View.OnLongClickListener longClickListener= new View.OnLongClickListener()
    {

        @Override
        public boolean onLongClick(View view) {
            ClipData data= ClipData.newPlainText("","");

            View.DragShadowBuilder myShadowBuilder= new View.DragShadowBuilder(view);

            view.startDrag(data,myShadowBuilder,view,0);
            return true;
        }
    };

    View.OnDragListener dragListener= new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent= event.getAction();

            switch(dragEvent)
            {
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view= (View) event.getLocalState();


                         imgView1.getLocationOnScreen();
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    break;
            }
            return false;
        }
    }
}