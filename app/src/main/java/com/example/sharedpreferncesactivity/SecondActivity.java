package com.example.sharedpreferncesactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

       /* Bundle bundle=getIntent().getExtras();
        String data1=bundle.get("data1").toString();
        String data2=bundle.get("data2").toString();
        txt_show.setText(data1);
        txt2.setText(data2);*/



        SharedPreferences preferences = getApplicationContext().getSharedPreferences("data",Context.MODE_PRIVATE);
        String city=preferences.getString("city","sp_city");
        String areas = preferences.getString("areas","sp_areas");

        txt1.setText(city);
        txt2.setText(areas);
    }
}