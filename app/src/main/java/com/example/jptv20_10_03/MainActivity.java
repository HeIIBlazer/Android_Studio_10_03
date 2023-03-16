package com.example.jptv20_10_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Sendmessage(View view){
        TextView textview = findViewById(R.id.textView);
        EditView editText = findViewById(R.id.editText);
        textView.setText("Tere Tulemas, "+ editText.getText())
    }
}