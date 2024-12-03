package com.example.beforespr;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("SetTextI18n")
    public void confirm(View view) {
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        //EditText pass1 = findViewById(R.id.editTextTextPassword);
        //EditText pass2 = findViewById(R.id.editTextTextPassword2);
        //TextView anwser = findViewById(R.id.textView6);
        //String pass1Text = pass1.getText().toString();
        //String pass2Text = pass2.getText().toString();
        String emailAddress = email.getText().toString();
        //if (!emailAddress.contains("@") & pass1Text.equals(pass2Text)){
         //   anwser.setText("Nieprawidłowy adres e-mail");
        //} else if (emailAddress.contains("@") & !pass1Text.equals(pass2Text)) {
         //   anwser.setText("Hasła się różnią");
        //}
        //else{
         //   anwser.setText("Witaj "+emailAddress);
        //}
        Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
        intent.putExtra("email", emailAddress);
        startActivity(intent);
    }
}