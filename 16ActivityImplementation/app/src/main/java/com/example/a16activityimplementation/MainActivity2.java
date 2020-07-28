package com.example.a16activityimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //Variable declaration
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Assign ui elements
        textView = findViewById(R.id.textView);

        //Storing values of our another activity
        String myValue = getIntent().getStringExtra("password");

        //Passing and show the value into our text View
        textView.setText(myValue);

    }

    //Method
    public void screenTwo(View view) {
            //Intent assigning
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);

    }
}