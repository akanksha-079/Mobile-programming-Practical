package com.hamida.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    AutoCompleteTextView actCountry;
    MultiAutoCompleteTextView mactSkills;
    Button btnShow;
    ProgressBar pbShow;
    boolean isVisble = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main5);
        actCountry=findViewById(R.id.actCountry);
        mactSkills=findViewById(R.id.mactSkills);
        btnShow=findViewById(R.id.btnShow);
        pbShow=findViewById(R.id.pbShow);

        String[] country = {"India" , "China" , "Austrlia" , "New Zeland" , "England"};
        String[]  skills = {"JAVA", "Python" , "C#" , "ASP.NET" , "C++" , "C" , "PHP" , "DSA" , "RDBMS" , "SQL" ,"AI" , "ML"};

        ArrayAdapter<String> cntAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1 , country);
        ArrayAdapter<String>  adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,skills);

        actCountry.setAdapter(cntAdapter);
        mactSkills.setAdapter(adapter);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isVisble)
                {
                   btnShow.setText("Show ProgressBar");
                   pbShow.setVisibility(View.GONE);
                   isVisble=false;

                }
                else
                {
                    btnShow.setText("Hide ProgressBar");
                    pbShow.setVisibility(View.VISIBLE);
                    isVisble=true;


                }


            }
        });


    }
}