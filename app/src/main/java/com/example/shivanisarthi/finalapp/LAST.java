package com.example.shivanisarthi.finalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LAST extends AppCompatActivity {
 TextView textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        textView7= (TextView) findViewById(R.id.textView7);

        textView7.setText("SERVICE FOR ROOM                 NUMBER "+getIntent().getStringExtra("roomnumber") +"                        BOOKED");
    }
}
