package com.example.holaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nameApp ="Hola Android";
        TextView mEditText = findViewById(R.id.etiqueta1);
        mEditText.setText(nameApp);



    }
}