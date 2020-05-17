package com.example.candyapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent splash_intent = new Intent(SplashActivity.this, Login.class);
        startActivity(splash_intent);
        finish();
    }
}
