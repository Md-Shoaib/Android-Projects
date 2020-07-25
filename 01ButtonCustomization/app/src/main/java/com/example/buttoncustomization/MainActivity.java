package com.example.buttoncustomization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    Button myBtn, myBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding ui elements
        myBtn = findViewById(R.id.myBtn);
        myBtn2 = findViewById(R.id.myBtn2);

        //Setting Listeners
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating a LOG
                Log.d("TEST", "Blue button Clicked");
            }
        });

        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating a LOG
                Log.d("TEST", "Red button Clicked");
            }
        });
    }
}