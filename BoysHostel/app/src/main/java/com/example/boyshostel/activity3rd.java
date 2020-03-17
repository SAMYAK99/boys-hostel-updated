package com.example.boyshostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity3rd extends AppCompatActivity {

    Button jtn_one ;
    Button jtn_two  , jtn_three , jtn_four , jtn_five , jtn_six , jtn_seven ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3rd);



        jtn_one=findViewById(R.id.btn_mess);
        jtn_two=findViewById(R.id.btn_anti);
        jtn_three=findViewById(R.id.btn_fees);
        jtn_four=findViewById(R.id.btn_dean);

        jtn_six=findViewById(R.id.btn_about);


        jtn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(activity3rd.this,anti.class);
                startActivity(intent2);
            }
        });

        jtn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12= new Intent(activity3rd.this , mess.class);
                startActivity(intent12);

            }
        });

        jtn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(activity3rd.this,fees.class);
                startActivity(intent3);
            }
        });


        jtn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(activity3rd.this,dean.class);
                startActivity(intent4);
            }
        });




        jtn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(activity3rd.this,timing.class);
                startActivity(intent6);
            }
        });







    }
}
