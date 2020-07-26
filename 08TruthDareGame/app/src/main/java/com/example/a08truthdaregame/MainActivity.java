package com.example.a08truthdaregame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    private Button button;
    private ImageView imageView;
    private Random random = new Random();
    private int lastDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
    }

    //Methods

    public void spin(View view) {
        //Variable declaration
        int newDirection = random.nextInt(3600);

        float pivotX = imageView.getWidth()/2;
        float pivotY = imageView.getHeight()/2;

        //Animation Process
        Animation rotate = new RotateAnimation(lastDirection, newDirection, pivotX, pivotY);
        rotate.setDuration(2000);
        rotate.setFillAfter(true);

        //Listener for animation
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        //direction last = new
        lastDirection = newDirection;

        imageView.startAnimation(rotate);
    }
}