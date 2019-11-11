package com.example.demo7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4;
    Button bu2,bu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView1 = findViewById(R.id.t1);
        textView2 = findViewById(R.id.t2);
        textView3 = findViewById(R.id.t3);
        textView4 = findViewById(R.id.t4);
        //    textView5=findViewById(R.id.t5);
        bu2 = findViewById(R.id.b2);
        bu3=findViewById(R.id.b3);
        Bundle bundle = getIntent().getExtras();
        String s3 = bundle.getString("key1");
        String s4 = bundle.getString("key2");
        String s5 = bundle.getString("key3");
        String s6 = bundle.getString("key4");
        textView1.setText(s3);
        textView2.setText(s4);
        textView3.setText(s5);
        textView4.setText(s6);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this, MainActivity.class);
                startActivity(intent);
            }
        });
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Second.this,Third.class);
                startActivity(intent);
            }
        });
    }
}
