package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity
{
    String[] emailArray = {"trlc1996@hotmail.com", "no@gmail.com", "bob.markey@hotmail.com"};
    String[] passArray = {"a", "b", "c"};
    String lastPass;
    String lastEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onButtonClick(View view)
    {
        EditText editEmail = (EditText)findViewById(R.id.editText);
        EditText editPass = (EditText)findViewById(R.id.editText2);
        String sEmail = editEmail.getText().toString();
        String sPassword = editPass.getText().toString();
        boolean isValid = checkValid(sEmail, sPassword);
        if(isValid)
        {
            Intent intent = new Intent(Login.this, MainMenu.class);
            startActivity(intent);
        }
        else
        {
            TextView mess = (TextView)findViewById(R.id.textView4);
            mess.setVisibility(View.VISIBLE);
        }
    }
    private boolean checkValid(String email, String password)
    {
        int i;

        for(i = 0; i < emailArray.length; i++)
        {
            lastEmail = emailArray[i];
            lastPass = passArray[i];
            if(email.equals(emailArray[i]) && password.equals(passArray[i]))
            {
                    return true;
            }
        }

        return false;
    }




}
