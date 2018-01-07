/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> phrases = new ArrayList<Word>(10);
        phrases.add(new Word("Father","पिताजी", R.drawable.family_father));
        phrases.add(new Word("Mother","माँ", R.drawable.family_mother));
        phrases.add(new Word("Younger brother", "भाई", R.drawable.family_younger_brother));
        phrases.add(new Word("Younger sister","बहन", R.drawable.family_younger_sister));
        phrases.add(new Word("Older brother","भैया", R.drawable.family_older_brother));
        phrases.add(new Word("Older sister","दीदी", R.drawable.family_older_sister));
        phrases.add(new Word("Grandfather","दादा", R.drawable.family_grandfather));
        phrases.add(new Word("Grandmother","दादी", R.drawable.family_grandmother));
        phrases.add(new Word("Son","पुत्र", R.drawable.family_son));
        phrases.add(new Word("Daughter","पुत्री", R.drawable.family_daughter));

        ArrayAdapter<Word> itemsAdapter = new WordAdaptor(this,phrases,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
