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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> phrases = new ArrayList<Word>(10);
        phrases.add(new Word("Good Morning","शुभ प्रभात"));
        phrases.add(new Word("How are you?","आप कैसे हैं?"));
        phrases.add(new Word("See you again.", "फिर मिलेंगे।"));
        phrases.add(new Word("What is your name?","आप का नाम क्या है?"));
        phrases.add(new Word("Where are you going?","आप कहाँ जा रहे हैं?"));
        phrases.add(new Word("Where are you?","आप कहाँ हैं?"));
        phrases.add(new Word("Wait for some time.","थोड़ी देर इन्तज़ार कीजिये।"));
        phrases.add(new Word("How much does this cost?","यह कितने का है?"));

        ArrayAdapter<Word> itemsAdapter = new WordAdaptor(this,phrases,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
