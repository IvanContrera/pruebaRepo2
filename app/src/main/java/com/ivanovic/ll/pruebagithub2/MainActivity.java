package com.ivanovic.ll.pruebagithub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double b = 0;
    }


    public double absoluto(double a)
    {
        return Math.sqrt(Math.pow(a,2));
    }
}
