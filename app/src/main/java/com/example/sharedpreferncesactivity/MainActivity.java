package com.example.sharedpreferncesactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner sp_city,sp_areas;
    ArrayList<String> arrayList_city;
    ArrayAdapter<String> arrayAdapter_city;


    ArrayList<String> arrayList_pune, arrayList_banglore, arrayList_mumbai, arrayList_hyderabad, arrayList_gurugram;
    ArrayAdapter<String> arrayAdapter_areas;

    Button btn_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_city = findViewById(R.id.sp_city);
        sp_areas = findViewById(R.id.sp_areas);
        btn_continue=findViewById(R.id.btn_continue);

        //=====parent starts here====//
        arrayList_city = new ArrayList<>();
        arrayList_city.add("Pune");
        arrayList_city.add("Banglore");
        arrayList_city.add("Mumbai");
        arrayList_city.add("Hyderabad");
        arrayList_city.add("Gurugram");

    arrayAdapter_city=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_city);
    sp_city.setAdapter(arrayAdapter_city);

    //=====child starts here====//
    arrayList_pune=new ArrayList<>();
        arrayList_pune.add("Katraz");
        arrayList_pune.add("Swargate");
        arrayList_pune.add("Pimpri");
        arrayList_pune.add("Vimannagar");
        arrayList_pune.add("Yerwada");


        arrayList_banglore=new ArrayList<>();
        arrayList_banglore.add("Indira Nagar");
        arrayList_banglore.add("Jayanagar");
        arrayList_banglore.add("Koramangala");
        arrayList_banglore.add("Rajaji Nagar");
        arrayList_banglore.add("Frazer Town");


        arrayList_mumbai=new ArrayList<>();
        arrayList_mumbai.add("Jogeshwari");
        arrayList_mumbai.add("Dahisar");
        arrayList_mumbai.add("Boriwali");
        arrayList_mumbai.add("Juhu");
        arrayList_mumbai.add("Andheri");

        arrayList_hyderabad=new ArrayList<>();
        arrayList_hyderabad.add("Begumpet");
        arrayList_hyderabad.add("Abids");
        arrayList_hyderabad.add("Ameerpet");
        arrayList_hyderabad.add("Somajiguda");
        arrayList_hyderabad.add("Punjagutta");



        arrayList_gurugram=new ArrayList<>();
        arrayList_gurugram.add("Palam Vihar");
        arrayList_gurugram.add("Patel Nagar");
        arrayList_gurugram.add("Binola");
        arrayList_gurugram.add("Sector 3A");
        arrayList_gurugram.add("Sultanpur");

        sp_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    arrayAdapter_areas=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_pune);
                }
                if(position==1){
                    arrayAdapter_areas=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_banglore);
                }
                if(position==2){
                    arrayAdapter_areas=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_mumbai);
                }
                if(position==3){
                    arrayAdapter_areas=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_hyderabad);
                }
                if(position==4){
                    arrayAdapter_areas=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_gurugram);
                }
                sp_areas.setAdapter(arrayAdapter_areas);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btn_continue.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        /*Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("data1",String.valueOf(sp_city.getSelectedItem()));
        intent.putExtra("data2",String.valueOf(sp_areas.getSelectedItem()));
        startActivity(intent);*/
/*


        /*To write*/
        SharedPreferences preferences = getSharedPreferences("data", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("city", String.valueOf(sp_city.getSelectedItem()));
        editor.putString("areas",String.valueOf(sp_areas.getSelectedItem()));
        editor.commit();
        editor.apply();
        Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
});

    }
}