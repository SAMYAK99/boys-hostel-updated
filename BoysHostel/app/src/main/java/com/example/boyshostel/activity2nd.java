package com.example.boyshostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2nd extends AppCompatActivity {

      Button btn_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2nd);


        btn_one = findViewById(R.id.btn_next); {


            btn_one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent (activity2nd.this,activity3rd.class);
                    startActivity(intent);


                }
            });
        }
    }
}
