package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @SuppressLint({"StringFormatMatches", "StringFormatInvalid"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle arguments = getIntent().getExtras();

        String text = arguments.get("name").toString();

        TextView outputTextView = findViewById(R.id.textView3);
        outputTextView.setText(getString(R.string.label, text));

        TextView sdk_version_view= findViewById(R.id.textView2);
        sdk_version_view.setText(getString(R.string.label_sdk_version ,Build.VERSION.SDK_INT));
    }
}