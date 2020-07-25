package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Variable declaration
    private ImageView dice1, dice2;
    private Button button;
    private Random myRandomNumber = new Random(); //for generate a random number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        button = findViewById(R.id.button);

        //setting on click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling methods
                rollOurDiceOne();
                rollOurDiceTwo();
            }
        });
    }

    //Method Definition
    private void rollOurDiceTwo(){
        //Generate random number
        int myRanNumber = myRandomNumber.nextInt(6) + 1;

        //using switch case assign various cases
        switch (myRanNumber){
            case 1:
                dice2.setImageResource(R.drawable.dice01);
                break;
            case 2:
                dice2.setImageResource(R.drawable.dice02);
                break;
            case 3:
                dice2.setImageResource(R.drawable.dice03);
                break;
            case 4:
                dice2.setImageResource(R.drawable.dice04);
                break;
            case 5:
                dice2.setImageResource(R.drawable.dice05);
                break;
            case 6:
                dice2.setImageResource(R.drawable.dice06);
                break;
        }
    }

    private void rollOurDiceOne(){
        //Generate random number
        int myRanNumber = myRandomNumber.nextInt(6) + 1;

        //using switch case assign various cases
        switch (myRanNumber){
            case 1:
                dice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice1.setImageResource(R.drawable.dice6);
                break;
        }
    }

}