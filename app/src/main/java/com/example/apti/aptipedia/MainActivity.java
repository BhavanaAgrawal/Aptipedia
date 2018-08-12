package com.example.apti.aptipedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.startbtn);

btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if(view==btn)
        {
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        }

    }
}
