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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create list of words

        ArrayList<Word> numbers = new ArrayList<Word>(10);
        numbers.add(new Word("One","एक", R.drawable.number_one));
        numbers.add(new Word("Two","दो", R.drawable.number_two));
        numbers.add(new Word("Three","तीन", R.drawable.number_three));
        numbers.add(new Word("Four","चार", R.drawable.number_four));
        numbers.add(new Word("Five","पांच", R.drawable.number_five));
        numbers.add(new Word("Six","छ", R.drawable.number_six));
        numbers.add(new Word("Seven","सात", R.drawable.number_seven));
        numbers.add(new Word("Eight","आठ", R.drawable.number_eight));
        numbers.add(new Word("Nine","नौ", R.drawable.number_nine));
        numbers.add(new Word("Ten","दस", R.drawable.number_ten));

        ArrayAdapter<Word> itemsAdapter = new WordAdaptor(this,numbers,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
