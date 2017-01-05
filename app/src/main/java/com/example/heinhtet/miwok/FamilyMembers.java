package com.example.heinhtet.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    ArrayList<Word> family = new ArrayList<Word>();
    ListView familyList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        family.add(new Word(0, "father","အေဖ"));
        family.add(new Word(0, "mother","အေမ"));
        family.add(new Word(0, "son","သား"));
        family.add(new Word(0, "daughter","သမီး"));
        family.add(new Word(0, "older brother","အကိုုၾကီး"));
        family.add(new Word(0, "younger brother","ညီေလး"));
        family.add(new Word(0, "older sister","အမ"));
        family.add(new Word(0, "younger sister","ညီမ"));
        family.add(new Word(0, "grandfather","အဖိုုး"));
        family.add(new Word(0, "grandmother","အဖြား"));


        WordAdapter adapter = new WordAdapter(this,family);


       // familyList = (ListView)findViewById(R.id.list);
        familyList.setAdapter(adapter);







//        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.activity_family_members);
//        int index;
//       for (index=0;index<family.size();index++){
//           TextView fam = new TextView(this);
//           fam.setText(family.get(index));
//           linearLayout.addView(fam);
//       }
//


    }
}
