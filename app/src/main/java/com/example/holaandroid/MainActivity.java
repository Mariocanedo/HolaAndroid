package com.example.holaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     String nameApp ="Hola Android";
    //    TextView mEditText = findViewById(R.id.resultado);
     //   mEditText.setText(nameApp);

// recibir desde el layout a java

        EditText editext1 = findViewById(R.id.editext1);
        EditText editext2 =findViewById(R.id.edittext2);
        TextView textView = findViewById(R.id.resultado);
        Button button = findViewById(R.id.button);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             String num1 = editext1.getText().toString();

             String num2 = editext1.getText().toString();
              int resul = Integer.parseInt(num1) + Integer.parseInt(num2);
              textView.setText("El resultado es :"+resul);
              editext1.setText("");
              editext2.setText("");

         }
     });



    }
}