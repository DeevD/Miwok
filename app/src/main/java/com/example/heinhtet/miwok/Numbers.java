package com.example.heinhtet.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {

    //create the string array
    //String [] words = new String[10];
    //adding data to string array
    //words[0] = "one";


   List<Word> words = new ArrayList<Word>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        listView = (ListView) findViewById(R.id.list) ;

//        Word w = new Word("one","tit");
//        words.add(w);

        words.add(new Word( "one","one"));;
        words.add(new Word( "two","two"));
        words.add(new Word( "three","three"));
        words.add(new Word( "four","four"));
        words.add(new Word( "five","five"));
        words.add(new Word( "six","six"));
        words.add(new Word( "seven","seven"));
        words.add(new Word( "eight","eight"));
        words.add(new Word( "nine","nine"));
        words.add(new Word( "ten","ten"));



        WordAdapter adapter = new WordAdapter(this,words);


       // adapter = new ArrayAdapter<Word>(getApplicationContext(),R.layout.number_detail,R.id.detail_number,words);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),"Click : "+words.get(i),Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}
