package com.example.jdisuru.pickmyservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.hbb20.CountryCodePicker;

public class customer_login_registration_1 extends AppCompatActivity {
    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_registration_1);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
    }
}
