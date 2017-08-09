package com.example.ezcolth.ericssonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class changePassword extends AppCompatActivity
{
    Button updatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        updatePassword = (Button) findViewById(R.id.cpUpdatePassword);

        updatePassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //do if statement for old password
                if(findViewById(R.id.cpNewPassword) == findViewById(R.id.cpNewPasswordRepeat))
                {
                    //set new password
                }
            }
        });
    }
}
