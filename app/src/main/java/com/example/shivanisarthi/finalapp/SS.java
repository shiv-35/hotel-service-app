package com.example.shivanisarthi.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SS extends AppCompatActivity {
    public Button button4;
    EditText editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        editText4 =(EditText) findViewById(R.id.editText4);
        button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String num = editText4.getText().toString();
                Intent intent = new Intent(SS.this, LAST.class);
                intent.putExtra("roomnumber", num);
                startActivity(intent);
            }

        });
    }
}
