package com.hamida.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    TextView txtFname,txtLname,txtMob,txtEmail,txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String strFname, strLname, strMob, strEmail, strPass;

        txtFname=findViewById(R.id.txtFname);
        txtLname=findViewById(R.id.txtLname);
        txtMob=findViewById(R.id.txtMob);
        txtEmail=findViewById(R.id.txtEmail);
        txtPass=findViewById(R.id.txtPass);

        strFname =getIntent().getStringExtra("fnm");
        strLname = getIntent().getStringExtra("lnm");
        strMob = getIntent().getStringExtra("mob");
        strEmail = getIntent().getStringExtra("email");
        strPass = getIntent().getStringExtra("pass");

        txtFname.setText(strFname);
        txtLname.setText(strLname);
        txtMob.setText(strMob);
        txtEmail.setText(strEmail);
        txtPass.setText(strPass);




    }
}