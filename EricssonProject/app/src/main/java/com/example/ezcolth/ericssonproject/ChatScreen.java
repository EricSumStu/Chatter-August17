package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ChatScreen extends AppCompatActivity
{
    Button profileButton;
    Button settingButton;
    String[] array = {"Jim Bob", "Mary Sue", "Alexander Macedon", "Joe Blogs", "Gary Johnson", "Donald Trump", "Hilary Clinton", "Jill Stein"};
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    EditText txt;
    ListView show;
    String conversation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);

        profileButton = (Button)findViewById(R.id.nextProfile);
        settingButton = (Button)findViewById(R.id.nextSetting);

        show = (ListView)findViewById(R.id.listView);
        arrayList = new ArrayList<>(Arrays.asList(array));
        adapter = new ArrayAdapter<String>(ChatScreen.this, android.R.layout.simple_list_item_1,arrayList);
        show.setAdapter(adapter);

        show.setOnItemClickListener(new ListView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int i, long l)
            {
                String selectedFromList =(String) (show.getItemAtPosition(i));
                String send[] = {selectedFromList};
               /* Intent mainIntent = new Intent(ChatScreen.this, conversation.class //The chat screen );
                mainIntent.putExtra("partner", send);
                startActivity(mainIntent); */
            }
        });

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

}
