package com.github.hamzabukhari;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView TextView = findViewById(R.id.textView);
        TextView.setPaintFlags(TextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}