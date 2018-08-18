package com.design_tutorial.harsharaple.intent_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt2 = (TextView)findViewById(R.id.txt2);
        Intent i = getIntent();


        txt2.setText(i.getStringExtra("Name"));
    }
}
