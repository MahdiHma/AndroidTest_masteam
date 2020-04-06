package com.example.mastest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Context applicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.applicationContext = getApplicationContext();
        View view = findViewById(R.id.json);
        Log.w("my activity", view.getClass().getName());
        RequestHandler requestHandler = new RequestHandler((TextView) view);

    }

}
