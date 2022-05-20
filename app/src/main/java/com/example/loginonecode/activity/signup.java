package com.example.loginonecode.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginonecode.R;

public class signup extends AppCompatActivity {
    Button btn1,btn2;
    TextView btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.signup1);
        btn3=findViewById(R.id.chatsupport);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this,"work done",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(signup.this, MainActivity.class);

                startActivity(i);



            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this,"work done",Toast.LENGTH_SHORT).show();
            }
        });
        btn3


                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this, "work done", Toast.LENGTH_SHORT).show();
            }
        });


    }
}