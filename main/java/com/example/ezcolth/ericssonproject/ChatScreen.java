package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatScreen extends AppCompatActivity
{
    Button profileButton;
    Button settingButton;
    Button save;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    EditText txt;
    ListView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);

        profileButton = (Button)findViewById(R.id.nextProfile);
        settingButton = (Button)findViewById(R.id.nextSetting);

        txt = (EditText)findViewById(R.id.txtInput);
        show = (ListView)findViewById(R.id.listView);
        save = (Button)findViewById(R.id.button);
        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(ChatScreen.this, android.R.layout.simple_list_item_1,arrayList);
        show.setAdapter(adapter);
        onButtonClick();

        profileButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent profileIntent = new Intent(getApplicationContext(), profile.class);
                startActivity(profileIntent);
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent settingIntent = new Intent(getApplicationContext(), Settings.class);
                startActivity(settingIntent);
            }
        });

    }

    public void onButtonClick(){
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String result = txt.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });
    }

}
