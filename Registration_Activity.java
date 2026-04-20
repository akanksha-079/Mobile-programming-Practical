package com.hamida.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration_Activity extends AppCompatActivity {

    ListView lstName;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);

        lstName=findViewById(R.id.lstName);
        spinner=findViewById(R.id.spinner);

        String name[] = {"Hamida" , "Sana" , "Naznin" , "Hasnain" , "Server" , "Fidu" , "Aksha" , "Zeba" } ;
        String country[] = {"------Select Country------", "India" , "US" , "Uk", "China"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name);
        lstName.setAdapter(adapter);

        ArrayAdapter<String> adptCnt = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,  country);
        spinner.setAdapter(adptCnt);

        lstName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                
                Toast.makeText(getApplicationContext() , "Hello, " + name[i] + "...", Toast.LENGTH_SHORT).show();

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i > 0)
                    Toast.makeText(getApplicationContext(), country[i] + " Selected...." , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}