package com.course.example.shakybuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Button button, button2, button3;
    private Animation shake, bounce, rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

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

        button3.setOnClickListener( new OnClickListener(){
            public void onClick(View v){
                button3.startAnimation(rotate);
            }
        });
    }
}