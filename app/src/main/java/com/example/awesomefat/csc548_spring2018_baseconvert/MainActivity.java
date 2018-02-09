package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decimalToBaseButtonClicked(View v)
    {
        Intent i = new Intent(this, DecimalToBase.class);
        this.startActivity(i);
    }

    public void baseToDecimalButtonClicked(View v)
    {
        Intent i = new Intent(this, BaseToDecimal.class);
        this.startActivity(i);
    }

}
