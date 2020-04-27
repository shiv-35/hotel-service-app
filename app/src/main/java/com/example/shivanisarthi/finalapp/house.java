package com.example.shivanisarthi.finalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class house extends AppCompatActivity {
    public Button button7;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);
        editText2 =(EditText) findViewById(R.id.editText2);
        button7 =(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    String num = editText2.getText().toString();
                    Intent intent = new Intent(house.this, LAST.class);
                intent.putExtra("roomnumber",num);
                    startActivity(intent);



            }

        });
    }
}
