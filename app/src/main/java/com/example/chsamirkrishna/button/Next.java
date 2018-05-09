package com.example.chsamirkrishna.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        TextView tv = findViewById(R.id.tv1);
        tv.setText("welcome to nit"+getIntent().getStringExtra("name")+getIntent().getStringExtra("qual"));
    }
}
