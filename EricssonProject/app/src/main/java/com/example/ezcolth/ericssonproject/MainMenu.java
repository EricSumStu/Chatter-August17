package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity
{
    Button profileButton;
    Button settingButton;
    String[] array = {"Jim Bob", "Mary Sue", "Alexander Macedon", "Joe Blogs", "Gary Johnson", "Donald Trump", "Hilary Clinton", "Jill Stein"};
    ListView show;

    private ListView lv;
    private List<String> your_array_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        lv = (ListView) findViewById(R.id.listView);
        profileButton = (Button)findViewById(R.id.nextProfile);
        settingButton = (Button)findViewById(R.id.nextSetting);

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

                Intent androidsolved_intent = new Intent(getApplicationContext(), MessageScreen.class);
                androidsolved_intent.putExtra("partner", your_array_list.get(position));
                startActivity(androidsolved_intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View profileView)
            {
                Intent profileIntent = new Intent(getApplicationContext(), profile.class);
                startActivity(profileIntent);
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View settingView)
            {
                Intent settingIntent = new Intent(getApplicationContext(), Settings.class);
                startActivity(settingIntent);
            }
        });

    }

}
