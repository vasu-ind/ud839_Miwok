package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yarya on 10/29/2017.
 */

public class WordAdaptor extends ArrayAdapter<Word> {

    /** ResourceID for background color for this list */
    private int mColorResourceID = -1;

    public WordAdaptor(Activity context, ArrayList<Word> words, int mColorResourceID){
        super(context,0,words);
        this.mColorResourceID = mColorResourceID;
    }



    /**
     * {@inheritDoc}
     *
     * @param position
     * @param convertView
     * @param parent
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTranslationView = (TextView) listItemView.findViewById(R.id.default_translation);
        defaultTranslationView.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslationView = (TextView) listItemView.findViewById(R.id.miwok_translation);
        miwokTranslationView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_image);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // set the theme color for the list item //
        View textContainer = listItemView.findViewById(R.id.textContainer);
        // find the color that the resource id maps to //
        int color = ContextCompat.getColor(getContext(),mColorResourceID);
        // set background color for the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
