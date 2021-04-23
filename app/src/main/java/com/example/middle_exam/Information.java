package com.example.middle_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Information extends AppCompatActivity {

    public TextView _textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        _textView=findViewById(R.id.Text);

        Intent i = getIntent();

        String u=i.getStringExtra("U");
        String p=i.getStringExtra("P");
        String a=i.getStringExtra("A");
        String ph=i.getStringExtra("Ph");

        String n="Username:"+u+"\nPassword:"+p+"\nAddress:"+a+"\nPhone:"+ph;

        _textView.setText(n);
    }
}