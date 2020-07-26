package com.example.funbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Variable declaration
    private ConstraintLayout layout;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
        layout = findViewById(R.id.layout);
        button = findViewById(R.id.imageButton);

        //Listeners
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Generate random number
                Random random = new Random();

                //variables
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

                //Setting the background color
                layout.setBackgroundColor(color);
            }
        });
    }
}