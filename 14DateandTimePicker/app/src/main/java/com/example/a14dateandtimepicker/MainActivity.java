package com.example.a14dateandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
//    TimePicker timePicker;
    DatePicker datePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign ui elements
//        timePicker = findViewById(R.id.timePicker);
        datePicker = findViewById(R.id.datePicker);
        textView = findViewById(R.id.textView);

        Calendar calendar = Calendar.getInstance();

        datePicker.init(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        textView.setText("You Selected: " + dayOfMonth + "-" + dayOfMonth + "-" + monthOfYear);
                    }
                });


        //Listeners
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                textView.setText("Hour: " + hourOfDay + "\n Minutes: " + minute);
//            }
//        });
    }
}