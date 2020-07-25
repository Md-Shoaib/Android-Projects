package com.example.customgradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    //Variable declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling the method

    }

    //Methods
    public void showToast(View view){
        //By using switch case we use id's then assign toasts
        switch (view.getId()){
            case R.id.errorButton:
                Toasty.error(this, "Login Failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this, "Login Success", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this, "Information", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this, "Oopssss", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this, "Project Done", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_upload)).show();
                break;
        }

    }
}