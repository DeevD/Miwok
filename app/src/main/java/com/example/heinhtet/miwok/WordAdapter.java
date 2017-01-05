package com.example.heinhtet.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by heinhtet on 1/4/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mResourceColor;


    public WordAdapter(Activity activity, List<Word> words) {
        super(activity,0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word word = getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);


            TextView eng = (TextView)listItemView.findViewById(R.id.defaulteng);
            eng.setText(word.getmDefaultTranslaton());

            TextView miwok = (TextView)listItemView.findViewById(R.id.miwok);
            miwok.setText(word.getmMiwokTranslation());

        }
        return listItemView;
    }
}
