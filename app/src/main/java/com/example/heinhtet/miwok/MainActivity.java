package com.example.heinhtet.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        TextView number = (TextView)findViewById(R.id.number);
//        number.setOnClickListener(clickListener);

    }

    public void numberActivity(View view) {
        Intent number = new Intent(this,Numbers.class);
        startActivity(number);
    }

    public void family_Member_Activity(View view) {
        Intent family = new Intent(this,FamilyMembers.class);
        startActivity(family);
    }

    public void color(View view) {
        Intent color = new Intent(getApplicationContext(),ColorActivity.class);
        startActivity(color);
    }

    public void phrase(View view) {
        Intent phrase  = new Intent(getApplicationContext(),PhraseActivity.class);
        startActivity(phrase);
    }
}
