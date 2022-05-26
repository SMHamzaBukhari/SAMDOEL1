package com.github.hamzabukhari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        TextView TextView = (TextView) findViewById(R.id.textViewSignin);

        Button login=findViewById(R.id.Signinbtn);

        TextView.setPaintFlags(TextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboard= new Intent(Signin.this,dashboard.class);
                startActivity(dashboard);
            }
        });
    }
}