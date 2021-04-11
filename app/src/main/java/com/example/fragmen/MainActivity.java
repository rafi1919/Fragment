package com.example.fragmen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toNextActivity= findViewById(R.id.toNextActivity);
        toFragment1= findViewById(R.id.toFragment1);
        toFragment1= findViewById(R.id.toFragment1);

        toNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( (packageContext:MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        toFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loadFragment(new Fragment_first());
            }
        });
        toFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Fragment_second());
            }
        });
    }
}