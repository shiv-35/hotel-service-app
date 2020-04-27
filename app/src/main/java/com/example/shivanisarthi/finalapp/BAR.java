package com.example.shivanisarthi.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BAR extends AppCompatActivity {
    EditText editText3;
    public Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
        editText3 =(EditText) findViewById(R.id.editText2);
        button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String num = editText3.getText().toString();
                Intent intent = new Intent(BAR.this, LAST.class);
                intent.putExtra("roomnumber", num);
                startActivity(intent);


            }

        });
    }
}
