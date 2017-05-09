package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("height");
        words.add("nine");
        words.add("ten");

        //Find the LinearLayout rootView and store it in a variable
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        /**
        *  Create dynamically a TextView in Java code
        **/
        int index = 0;
        while(index < words.size()) {

            TextView wordView = new TextView(this); //this refers to the NumberActivity class
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            //Update counter variable
            index++;
        }
    }
}
