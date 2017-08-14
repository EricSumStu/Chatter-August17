package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button signUpButton;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUpButton = (Button)findViewById(R.id.signUp);
        signUpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent androidsolved_intent = new Intent(getApplicationContext(), SignUp.class);
                startActivity(androidsolved_intent);
            }
        });
        loginButton = (Button)findViewById(R.id.logIn);
        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent androidsolved_intent = new Intent(getApplicationContext(), Login.class);
                startActivity(androidsolved_intent);
            }
        });
    }
}
