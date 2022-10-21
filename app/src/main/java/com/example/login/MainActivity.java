package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ThemedSpinnerAdapter;

import com.example.login.helper.helper;

public class login extends AppCompatActivity {
    EditText txtUsername, txtPassword;
    Button btnLogin;
    TextView tvDaftar;
    String username = "12345"; String password ="admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvDaftar = findViewById(R.id.tvDaftar);

        btnLogin.setOnClickListener(view -> {
            String user = txtUsername.getText().toString();
            String pass = txtPassword.getText().toString();

        if((user.equals(username)) && (password.equals(password))){
            Toast.makeText(context: this, text: "Sukses Login", Toast.LENGTH_SHORT).show();
            helper.setUsername(user);
            startActivity(new Intent(packageContent: this, dasboard.class));

        }
    }
    }
}