package com.example.heinhtet.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    ListView colorList;
    ArrayList<Word> color = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        color.add(new Word(0,"red","အနီေရာင္"));
        color.add(new Word(1, "green","အစိမ္းေရာင္"));
        color.add(new Word(2, "brown","အညိဳေေရာင္"));
        color.add(new Word(3, "gray","မီးခိုုးေရာင္"));
        color.add(new Word(4, "black","အၿပာ"));
        color.add(new Word(5, "white","အၿဖဴေရာင္"));
        color.add(new Word(6, "dusty yellow","အ၀ါေရာင္ရင့္"));
        color.add(new Word(7, "mustard yellow","အ၀ါေရာင္အႏုု"));
        color.add(new Word(8, "dfjdsj","dhfjs"));
        color.add(new Word(9, "djkfsjk","sdjfdsdsjf"));







        //colorList = (ListView)findViewById(R.id.list);

        WordAdapter adapter = new WordAdapter(this,color);

        colorList.setAdapter(adapter);

    }
}
