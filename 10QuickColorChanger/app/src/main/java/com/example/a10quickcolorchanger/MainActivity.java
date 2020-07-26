package com.example.a10quickcolorchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    RelativeLayout layout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rGroup);

        //listeners
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //switch case
                switch (checkedId){
                    case R.id.blue:
                        layout.setBackgroundColor(Color.parseColor("#3C40C6"));
                        break;
                    case R.id.green:
                        layout.setBackgroundColor(Color.parseColor("#019031"));
                        break;
                    case R.id.red:
                        layout.setBackgroundColor(Color.parseColor("#E71C23"));
                        break;
                }
            }
        });
    }
}