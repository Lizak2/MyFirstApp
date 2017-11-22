package com.example.jedrzejlizakowski.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // some counting
    int count = 0;
    public void counter()
    {
        count++;
    }

    String message = "Zero";


    /** Called when the user taps the Send button*/
    public void goToSub1Button(View view)
    {
        Intent intent = new Intent(this, Sub1Button.class);
        startActivity(intent);
    }
    public void goToSub2Button(View view)
    {
        Intent intent = new Intent(this, Sub2Activity.class);
        startActivity(intent);
    }

}
