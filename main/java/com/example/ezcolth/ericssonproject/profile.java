package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class profile extends AppCompatActivity
{
    Button backButton;
    PopupWindow popUpWindow;
    boolean isClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        popUpWindow = new PopupWindow(this);
        isClicked = true;

        backButton = (Button) findViewById(R.id.backProfile);

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent androidsolved_intent = new Intent(getApplicationContext(), ChatScreen.class);
                startActivity(androidsolved_intent);
            }
        });
    }
}
