package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MessageScreen extends AppCompatActivity
{
    ListView lv;
    TextView nameText;
    EditText newMessage;
    Button backButton;
    Button sendButton;
    String stringNewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_screen);
        String nameString = getIntent().getStringExtra("partner");
        nameText = (TextView) findViewById(R.id.msUserName);
        nameText.setText(nameString);

        lv = (ListView) findViewById(R.id.msConversation);

        //List<ObjectChatMessage> message = getFromServer()
        final List<String> your_array_list = new ArrayList<String>();
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                your_array_list );

        lv.setAdapter(arrayAdapter);

        backButton = (Button) findViewById(R.id.msBack);
        sendButton = (Button) findViewById(R.id.msSend);

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent androidsolved_intent = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(androidsolved_intent);
            }
        });
        sendButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                newMessage = (EditText) findViewById(R.id.msText);
                stringNewMessage = newMessage.getText().toString();
                your_array_list.add(stringNewMessage);
                arrayAdapter.notifyDataSetChanged();
                //Add to database

                newMessage.setText("");
            }
        });
    }
}
