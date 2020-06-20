package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
Button button2,button4;
EditText number1,number2;
TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        answer = (TextView) findViewById(R.id.answer);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumbers();
            }
        });

    }

    public void openActivity1(){
        Intent intent = new Intent ( this,MainActivity.class);
        startActivity(intent);
    }

    public void addNumbers(){
        double n1,n2,result;
        n1=Double.parseDouble(number1.getText().toString());
        n2=Double.parseDouble(number2.getText().toString());
        result=n1+n2;
        answer.setText(String.valueOf(result));

    }
}
