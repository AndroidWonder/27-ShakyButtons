package com.course.example.shakybuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Button button, button2, button3;
    private Animation shake, bounce, rotate;
    private MediaPlayer mp;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get references to the buttons on UI
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        //attach animation scripts
        shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        //create media player for sound on one button
        mp = MediaPlayer.create(this, R.raw.dingdong);

        //set button listeners
        button.setOnClickListener( new OnClickListener(){
            public void onClick(View v){
                button.startAnimation(shake);
            }
        });

        button2.setOnClickListener( new OnClickListener(){
            public void onClick(View v){
                button2.startAnimation(bounce);
            }
        });

        //animation and sound
        button3.setOnClickListener( new OnClickListener(){
            public void onClick(View v){
                button3.startAnimation(rotate);
                mp.seekTo(0);
                mp.start();
            }
        });

    }
}