package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Methods
    public void redPressed(View view){
        //Generate a toast
//        Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        //Calling custom toast

        showCustomToast("Customized toast...");
    }

    //Custom toast method
    public void showCustomToast(String string){
        //Getting inflator
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

        //Calling custom text
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText(string);

        //Now cast our custom toast
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}