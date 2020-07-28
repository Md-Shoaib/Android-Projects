package com.example.a16activityimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Variable declaration
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign ui elements
        editText = findViewById(R.id.editText);
    }

    //Methods
    public void screenOne(View view) {
        //Getting user input
        String value = editText.getText().toString();

        //Handling empty user inputs
        if (value.length() == 0){
            editText.setError("No Value");
        } else {

            //Intent assigning
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            //Putting values
//            intent.putExtra("name", value);
//            intent.putExtra("password", value + " new!");

            //We can also send data using Bundle class and ArrayList
            Bundle bundle = new Bundle();

            bundle.putString("name", value);
            bundle.putString("password", value + " new!");

            intent.putExtras(bundle); //Finally this to transfer the data


            //Starting the activity
            startActivity(intent);
        }



    }
}