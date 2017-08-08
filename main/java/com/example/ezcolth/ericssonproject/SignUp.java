package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity
{
    Button backButton;
    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        backButton = (Button)findViewById(R.id.back);
        nextButton = (Button)findViewById(R.id.next);

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent androidsolved_intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(androidsolved_intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent androidsolved_intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(androidsolved_intent);
            }
        });
    }
}

