package com.example.ezcolth.ericssonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TermsAndConditions extends AppCompatActivity {

    String tc = "This application was developed by Thomas Coll, Aine Grace, Saira Mehdi and Annie O'Mally. \n" +
            "This application is strictly for conversations between individuals above the age of 13 and we do not" +
            "take responsibility for any harm done or as a result of the useage of this application. \n" +
            "We condemn any illegal actions (based on Irish Common Law) committed with the use of this application" +
            "any proven cases will result in a permamant banning from the site. \n" +
            "We are a non profit group and will not allow advetisments on this application.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);

        TextView terms = (TextView) findViewById(R.id.tc);
        terms.setText(tc);
    }
}
