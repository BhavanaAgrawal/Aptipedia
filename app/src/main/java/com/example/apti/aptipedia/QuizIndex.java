package com.example.apti.aptipedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class QuizIndex extends AppCompatActivity {
    ListView lv;
    String[] charactersDC = {"Quiz1", "Quiz1", "Quiz1", "Quiz1", "Quiz1", "Quiz1", "Quiz1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_index);

        lv = findViewById(R.id.listview12);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, charactersDC);
        lv.setAdapter(adapter);




    }
}

