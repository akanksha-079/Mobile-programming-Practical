package com.hamida.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView edtFname, edtLname, edtMbno, edtEmail, edtPass;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtFname = findViewById(R.id.edtFname);
        edtLname = findViewById(R.id.edtLname);
        edtMbno = findViewById(R.id.edtMbno);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        btnSubmit = findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                String strFname, strLname, strMob, strEmail, strPass;

                strFname = edtFname.getText().toString().trim();
                strLname = edtLname.getText().toString().trim();
                strMob = edtMbno.getText().toString().trim();
                strEmail = edtEmail.getText().toString().trim();
                strPass = edtPass.getText().toString().trim();

                intent.putExtra("fnm", strFname);
                intent.putExtra("lnm", strLname);
                intent.putExtra("mob", strMob);
                intent.putExtra("email", strEmail);
                intent.putExtra("pass", strPass);

                startActivity(intent);
            }
        });


    }
}