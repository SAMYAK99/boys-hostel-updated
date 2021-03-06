package com.example.boyshostel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText EName;
     EditText Password;
     TextView Info;
     Button Login;
       int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EName = findViewById(R.id.etName);
        Password =  findViewById(R.id.etPassword);
        Info =  findViewById(R.id.tvInfo);
        Login =  findViewById(R.id.btnLogin);
        Info.setText("No of attempts remaining:"  + String.valueOf(counter));
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(EName.getText().toString(), Password.getText().toString());
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void validate(String userName, String userPassword)
    {    if((userName.equals("jss")) && (userPassword.equals("123"))) {
        Intent intent = new Intent(MainActivity.this,activity2nd.class);
        startActivity(intent);    }
    else {

        counter--;
        Info.setText("No of attempts remaining: "+ String.valueOf(counter));
        if (counter == 0) {
            Login.setEnabled(false);


        }
    }

    }
}
