package com.example.heinhtet.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    ArrayList<Word>phrase = new ArrayList<Word>();
    ListView phaseList;
    WordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        phrase.add(new Word(0, "Where are you going?","မင္းဘယ္သြားမွာလဲ"));
        phrase.add(new Word(1, "What is your name?","မင္းနာမည္ဘယ္သုူလဲ"));
        phrase.add(new Word(2, "My name is :?","က်ေတာ္နာမည္ကေတာ့"));
        phrase.add(new Word(3, "How are you feeling?","မင္းဘယ္လိုုခံစားရလဲ"));
        phrase.add(new Word(4, "Where you came from?","မင္းဘယ္ကလာတာလဲ"));
        phrase.add(new Word(5, "Are you coming?","မင္းလာပီလား"));
        phrase.add(new Word(6, "Yes i'm coming","ဟုုတ္ကဲ့က်ေတာ္လာပါပီ"));
        phrase.add(new Word(7, "Let go","သြားၿကစိုု့"));
        phrase.add(new Word(8, "came with me","ငါနဲ့တုုူတူလိုုက္ခဲ့"));
        phrase.add(new Word(9, "trying to best","အေကာင္းဆံုုးၿကိုုးစားပါ"));

        //phaseList = (ListView)findViewById(R.id.list);
        adapter = new WordAdapter(this,phrase);
        phaseList.setAdapter(adapter);




    }
}
