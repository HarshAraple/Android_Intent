package com.design_tutorial.harsharaple.intent_demo;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    Button btn;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = (Button)findViewById(R.id.btnsubmit);
        e1 = (EditText)findViewById(R.id.txt1);
        e2 = (EditText)findViewById(R.id.txt2);
        e3 = (EditText)findViewById(R.id.txt3);
        e4 = (EditText)findViewById(R.id.txt4);
        e5 = (EditText)findViewById(R.id.txt5);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,Main4Activity.class);
                i.putExtra("Name",e1.getText().toString());
                i.putExtra("Address",e2.getText().toString());
                i.putExtra("Age",e3.getText().toString());
                i.putExtra("Phone",e4.getText().toString());
                i.putExtra("Sex",e5.getText().toString());

                startActivity(i);


            }
        });

    }
}
