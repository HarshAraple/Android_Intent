package com.design_tutorial.harsharaple.intent_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        t1 = (TextView)findViewById(R.id.txtview1);
        t2 = (TextView)findViewById(R.id.txtview2);
        t3 = (TextView)findViewById(R.id.txtview3);
        t4 = (TextView)findViewById(R.id.txtview4);
        t5 = (TextView)findViewById(R.id.txtview5);

        Intent i = getIntent();
        t1.setText(i.getStringExtra("Name"));
        t2.setText(i.getStringExtra("Address"));
        t3.setText(i.getStringExtra("Age"));
        t4.setText(i.getStringExtra("Phone"));
        t5.setText(i.getStringExtra("Sex"));

    }
}
