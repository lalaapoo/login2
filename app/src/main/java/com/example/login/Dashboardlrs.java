package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.login.helper.helper;

public class Dashboardlrs extends AppCompatActivity {
    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardlrs);

        tvUsername = findViewById(R.id.txtUsername);
        tvUsername.setText(helper.getUsername());
    }
}