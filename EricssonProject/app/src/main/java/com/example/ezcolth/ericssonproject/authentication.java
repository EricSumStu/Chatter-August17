package com.example.ezcolth.ericssonproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class authentication extends AppCompatActivity
{
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("server/saving-data/fireblog");
    Button nextButton;
    String code1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        Intent intent = getIntent();
        final String[] details = intent.getStringArrayExtra("list");
        final String code;
        String availableChars;
        String body;
        StringBuilder codeBuilder;
        int index;
        Random rnd;

        availableChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        codeBuilder = new StringBuilder();
        rnd = new Random();
        while (codeBuilder.length() < 6) // length of the random string
        {
            index = (int) (rnd.nextFloat() * availableChars.length());
            codeBuilder.append(availableChars.charAt(index));
        }

        code = codeBuilder.toString();
        code1 = code;

        body = "Hello " + details[0] + "" +
                "\n" +
                "\n" +
                "Welcome to Chatter, in order to allow you to use your account we must authenticate your account" +
                "\n" +
                "Here at Chatter your security is paramount so we have attached a code to your email, do not close the application or else you will have to sign up again" +
                "\n The authentication code is " + code + "" +
                "\n We hope you enjoy your time on Chatter" +
                "\n " +
                "\n Chatter Team";

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        String[] to = {details[1]};
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Authentication Code");
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);
        emailIntent.setType("message/rfc822");
        Intent chooser = Intent.createChooser(emailIntent, "Send Email");
        startActivity(chooser);


        nextButton = (Button) findViewById(R.id.aNextPage);
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText etInputCode = (EditText)findViewById(R.id.aCode);
                String inputCode = etInputCode.getText().toString();
                if(inputCode.equals(code1))
                {
                    String fullName =  details[0];
                    String email = details[1];
                    String password = details[2];
                    String description = details[3];
                    DatabaseReference usersRef = ref.child("UserProfile");

                    Map<String, UserProfile> users = new HashMap<String, UserProfile>();
                    users.put(email, new UserProfile(email, fullName, password, description));

                    usersRef.setValue(users);
                  //  FirebaseDatabase.getInstance().getReference().push().setValue(new UserProfile(fullName,email,password,description));
                    Intent nextIntent = new Intent(getApplicationContext(), MainMenu.class);
                    startActivity(nextIntent);
                }
                else
                {
                    TextView error = (TextView)findViewById(R.id.aError);
                    error.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
