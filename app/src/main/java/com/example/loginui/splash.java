package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class splash extends AppCompatActivity {
    Intent i;
    Context c = splash.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(c, login.class);
                startActivity(i);
            }
        });

        findViewById(R.id.sginup_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(c, sginup.class);
                startActivity(i);

            }
        });
    }
}
