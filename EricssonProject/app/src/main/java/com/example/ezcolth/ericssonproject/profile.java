package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class profile extends AppCompatActivity
{
    String nameArray = "Tom";
    String desArray = "sdkj";
    Button backButton;
    Button saveButton;
    EditText fullNameEdit;
    EditText descriptionEdit;
    PopupWindow popUpWindow;
    boolean isClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fullNameEdit = (EditText) findViewById(R.id.pFullName);
        fullNameEdit.setText(nameArray);
        descriptionEdit = (EditText) findViewById(R.id.pDescription);
        descriptionEdit.setText(desArray);

        popUpWindow = new PopupWindow(this);
        isClicked = true;

        backButton = (Button) findViewById(R.id.backProfile);
        saveButton = (Button) findViewById(R.id.saveChanges);

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent androidsolved_intent = new Intent(getApplicationContext(), ChatScreen.class);
                startActivity(androidsolved_intent);
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText descriptionEdit = (EditText) findViewById(R.id.pDescription);

                String fullName = fullNameEdit.getText().toString();
                String description = descriptionEdit.getText().toString();

                nameArray = fullName;
                desArray = description;
            }
        });
    }
}
