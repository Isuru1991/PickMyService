package com.example.jdisuru.pickmyservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

public class customer_login_registration3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_registration3);
        Pinview pinview=(Pinview)findViewById(R.id.pinView);
        pinview.setPinViewEventListener(new Pinview.PinViewEventListener(){

            @Override
            public void onDataEntered(Pinview pinview, boolean b) {
                Toast.makeText(customer_login_registration3.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
