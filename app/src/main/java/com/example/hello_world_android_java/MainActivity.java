package com.example.hello_world_android_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d("MainActivity", "Hello World");
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }

    }
}