package com.example.boyshostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mess extends AppCompatActivity {

    Button mone;
    Button mtwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);

        mone = (Button)findViewById(R.id.btn_menu);
        mtwo = (Button)findViewById(R.id.btn_about);



        mtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(mess.this, mtiming.class);
                startActivity(int2);
            }
        });

        mone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(mess.this , mmenu.class);
                startActivity(int2);


            }
        });
    }
}
