package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Bundle arguments = getIntent().getExtras();

        String text = arguments.get("name").toString();

        TextView outputTextView = findViewById(R.id.textView3);
        outputTextView.setText(getString(R.string.label, text));
    }
}