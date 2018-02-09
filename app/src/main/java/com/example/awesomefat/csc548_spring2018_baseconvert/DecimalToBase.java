package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalToBase extends AppCompatActivity
{

    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_base);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    public void base2ButtonPressed(View v)
    {
        this.answerTV.setText("Base 2");
    }

    public void base8ButtonPressed(View v)
    {
        this.answerTV.setText("Base 8");
    }

    public void base10ButtonPressed(View v)
    {
        this.answerTV.setText("Base 10");
    }

    public void base16ButtonPressed(View v)
    {
        this.answerTV.setText("Base 16");
    }
}
