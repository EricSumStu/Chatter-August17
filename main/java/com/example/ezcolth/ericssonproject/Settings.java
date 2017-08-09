package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity
{
    Button terms;
    Button changePassword;
    Button logOut;
    Button deleteAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        terms = (Button) findViewById(R.id.sTermsConditions);
        changePassword = (Button) findViewById(R.id.sChangePassword);
        logOut = (Button) findViewById(R.id.sLogOut);
        deleteAccount = (Button) findViewById(R.id.sDeleteAccount);

        terms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tcIntent = new Intent(getApplicationContext(), TermsAndConditions.class);
                startActivity(tcIntent);
            }
        });
        changePassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cpIntent = new Intent(getApplicationContext(), changePassword.class);
                startActivity(cpIntent);
            }
        });
        logOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent popIntent = new Intent(getApplicationContext(), Pop.class);
                startActivity(popIntent);
            }
        });
        deleteAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent popIntent = new Intent(getApplicationContext(), Pop.class);
                startActivity(popIntent);
            }
        });
    }
}
