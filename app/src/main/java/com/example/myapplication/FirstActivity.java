package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.util.PreferencesHelper;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    PreferencesHelper preferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        preferencesHelper = PreferencesHelper.getINSTANCE(getApplicationContext());

        TextView txtFirst = findViewById(R.id.textFirstActivity);

        //Intent intent = getIntent();
        //String nama = intent.getStringExtra("nama");


        txtFirst.setText(preferencesHelper.getNama());
    }
}