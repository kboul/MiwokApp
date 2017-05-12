package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","әpә"));
        words.add(new Word("mother","әṭa"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("older brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","teṭe"));
        words.add(new Word("younger sister","kolliti"));
        words.add(new Word("grandmother","ama"));
        words.add(new Word("grandfather","paapa"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above
        listView.setAdapter(adapter);
    }
}
