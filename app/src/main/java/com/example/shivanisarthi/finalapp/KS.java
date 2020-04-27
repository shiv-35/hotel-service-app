package com.example.shivanisarthi.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KS extends AppCompatActivity {
    public Button button6;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ks);
        editText =(EditText) findViewById(R.id.editText);
        button6 =(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String num = editText.getText().toString();
                Intent intent = new Intent(KS.this, LAST.class);
                intent.putExtra("roomnumber", num);
                startActivity(intent);


            }

        });
    }
}
