package com.example.appcomanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onclick(View view) {
        Intent myintent = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(myintent);
    }

    public void onclic(View view) {
        Intent myintent = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(myintent);
    }
}