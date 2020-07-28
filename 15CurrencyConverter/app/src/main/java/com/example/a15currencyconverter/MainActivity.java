package com.example.a15currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    Button euro, dollar, pound, rubel, ausdollar, candollar, yen, dinar, bitcoin;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        pound = findViewById(R.id.pound);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        //Setting Listeners
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.011;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00€");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.013;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00$");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.010;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00£");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.96;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00₽");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.019;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00AUS$");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.018;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00Can$");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 1.41;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00¥");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.0041;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00 - dinar");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                //Handling empty user input
                if (TextUtils.isEmpty(userInput)){
                    editText.setError("Empty User Input");
                } else {
                    double userInputConvertToDouble, finalValue;
                    userInputConvertToDouble = Double.parseDouble(userInput);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    finalValue = userInputConvertToDouble * 0.0000012;

                    //Professional way to format the text
                    DecimalFormat numberFormat = new DecimalFormat("#.00 BTC");
                    textView.setText("" + numberFormat.format(finalValue));

                    //Not much professional
//                    textView.setText(""+finalValue);
                }
            }
        });
    }
}