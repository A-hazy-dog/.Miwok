package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> words=new ArrayList<word>();
        words.add(new word("one","lutti"));
        words.add(new word("two","otiiko"));
        words.add(new word("three","tolookosu"));
        words.add(new word("four","oyyisa"));
        words.add(new word("five","massokka"));
        words.add(new word("six","temmokka"));
        words.add(new word("seven","kenekaku"));
        words.add(new word("eight","kawinta"));
        words.add(new word("nine","wo'e"));
        words.add(new word("ten","na'aacha"));
        //creat textview for words
        wordAdapter adapter = new wordAdapter (this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
