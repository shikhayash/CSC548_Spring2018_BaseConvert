package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BaseToDecimal extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_to_decimal);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    public void base2ButtonPressed(View v)
    {
        //this.answerTV.setText("Base 2");
        int tempResult = 0;
        String s = this.inputET.getText().toString();

        for(int i=s.length()-1, j=0; i >= 0; i--,j++){
                    int temp = 0;
                    temp = (int)Math.pow(2,j) * (s.charAt(i) - 48);
                   tempResult += temp;
                }
                this.answerTV.setText("From Binary:  " + tempResult);
    }

    public void base8ButtonPressed(View v)
    {
       // this.answerTV.setText("Base 8");
        int tempResult = 0;
        String s = this.inputET.getText().toString();

        for(int i=s.length()-1, j=0; i >= 0; i--,j++){
            int temp = 0;
            temp = (int)Math.pow(8,j) * (s.charAt(i) - 48);
            tempResult += temp;
        }
        this.answerTV.setText("From Octal:  " + tempResult);
    }
    

    public void base10ButtonPressed(View v)
    {
        //this.answerTV.setText("Base 10");
        int tempResult = 0;
        String s = this.inputET.getText().toString();

        for(int i=s.length()-1, j=0; i >= 0; i--,j++){
            int temp = 0;
            temp = (int)Math.pow(10,j) * (s.charAt(i) - 48);
            tempResult += temp;
        }
        this.answerTV.setText("From Decimal:  " + tempResult);
    }

    public void base16ButtonPressed(View v)
    {
        //this.answerTV.setText("Base 16");
        int tempResult = 0;
        String s = this.inputET.getText().toString();

        for(int i=s.length()-1, j=0; i >= 0; i--,j++) {
            int temp = 0;
            char c = s.charAt(i);
            int n = 0;

            if(c=='A' || c == 'a')
            {
                n = 10;

            }
            else if(c=='B' || c == 'b')
            {
                n = 11;

            }
            else if(c=='C' ||  c == 'c')
            {
                n = 12;

            }
            else if(c=='D' || c == 'd')
            {
                n = 13;

            }
            else if(c=='E' || c == 'e')
            {
                n = 14;

            }
            else if(c=='F' || c == 'f')
            {
                n = 15;

            }
            else
            {
                n = c - 48;
            }

            temp = (int) Math.pow(16, j) * n;
            tempResult += temp;

        }
        this.answerTV.setText("From Hexadecimal:  " + tempResult);
    }
}
