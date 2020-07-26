package com.example.a11burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    //Methods

    public void submit(View view) {
        //Variable declaration
        float ratingValue = ratingBar.getRating();

        if (ratingValue < 2){
            textView.setText("Rating " + ratingValue + "\n We will try better next time");
        }
        else if (ratingValue <=3 && ratingValue >=2){
            textView.setText("Rating " + ratingValue + "\n We are Constantly improving");
        }
        else if (ratingValue >=4){
            textView.setText("Rating " + ratingValue + "\n Thanks for kind Rating...");
        }
    }
}