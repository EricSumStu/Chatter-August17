package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SignUp extends AppCompatActivity
{
    Button backButton;
    Button nextButton;
    String fullName;
    String email;
    String password;
    String repeatPassword;
    String description;
    EditText etFullName;
    EditText etEmail;
    EditText etPassword;
    EditText etRPassword;
    EditText etDescription;
    String[] nextList = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        backButton = (Button)findViewById(R.id.backSignUp);
        nextButton = (Button)findViewById(R.id.next);

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent androidsolved_intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(androidsolved_intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                etFullName = (EditText) findViewById(R.id.suFullName);
                fullName = etFullName.getText().toString();
                etEmail = (EditText)findViewById(R.id.suEmail);
                email = etEmail.getText().toString();
                etPassword = (EditText)findViewById(R.id.suPass);
                password = etPassword.getText().toString();
                etRPassword = (EditText)findViewById(R.id.suPassRepeat);
                repeatPassword = etRPassword.getText().toString();
                etDescription = (EditText)findViewById(R.id.suDescription);
                description = etDescription.getText().toString();

                if(password.equals(repeatPassword))
                {
                    nextList[0] = fullName;
                    nextList[1] = email;
                    nextList[2] = password;
                    nextList[3] = description;
                    Intent nextIntent = new Intent(getApplicationContext(), authentication.class);
                    nextIntent.putExtra("list", nextList);
                    startActivity(nextIntent);
                }
                else
                {
                    TextView error = (TextView)findViewById(R.id.suError);
                    error.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

