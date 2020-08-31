package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sginup extends AppCompatActivity {
    Intent i;
    Context c=sginup.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginup);

        findViewById(R.id.sginin_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(c,login.class);
                startActivity(i);
            }
        });
    }
}
