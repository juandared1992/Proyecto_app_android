package com.example.appcomanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void onclick(View view) {
        Intent myintent = new Intent(MainActivity4.this,MainActivity3.class);
        startActivity(myintent);
    }

    public void onClick(View view) {
        finishAffinity();
    }
}