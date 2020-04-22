package com.ivanovic.ll.pruebagithub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double b = -6;
        double c = absoluto(b);
        int fact = factorial(6);
    }


    public double absoluto(double a)
    {
        return Math.sqrt(Math.pow(a,2));
    }

    public int factorial(int a)
    {
        int fact = 1;
        for(int i = 2; i <= a; i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    public int funcionNueva()
    {
        return 12;
    }
}
