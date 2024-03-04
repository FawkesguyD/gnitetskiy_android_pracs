package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView source = findViewById(R.id.editTextText);
                String inputText = source.getText().toString();
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("name", inputText);
                startActivity(intent);
            }
        });
    }

    protected void onStart() {
        super.onStart();

    }

    protected void onResume() {
        super.onResume();

    }

}

