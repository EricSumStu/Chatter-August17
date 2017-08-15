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
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageScreen1 extends AppCompatActivity
{
   // Intent getIntent = getIntent();
    TextView bannerName = (TextView) findViewById(R.id.msUserName);
    ListView conversation;
    EditText newMessage;
    Button backButton;
    Button sendButton;
    String stringNewMessage;
    String[] messageArray = {"Jim Bob", "Mary Sue", "Alexander Macedon", "Joe Blogs", "Gary Johnson", "Donald Trump", "Hilary Clinton", "Jill Stein"};
    ArrayList<String> messageArrayList;
    ArrayAdapter<String> adapter;
  //  final String details = getIntent.getStringExtra("partner");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_screen);

    //    bannerName.setText(details);
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

                //Add to database
            }
        });

        ListView lv = (ListView) findViewById(R.id.listView);

        final List<String> your_array_list = new ArrayList<String>();
        your_array_list.add("foo");
        your_array_list.add("bar");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                your_array_list );

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent androidsolved_intent = new Intent(getApplicationContext(), MainMenu.class);
                androidsolved_intent.putExtra("partner", your_array_list.get(position));
                startActivity(androidsolved_intent);
            }
        });
       /* conversation = (ListView)findViewById(R.id.listView);
        messageArrayList = new ArrayList<>(Arrays.asList(messageArray));
        adapter = new ArrayAdapter<String>(MessageScreen1.this, R.layout.activity_message_screen,messageArrayList);
        conversation.setAdapter(adapter); */
    }
}
