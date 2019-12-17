package com.d3mi.ramidun;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplasScreen extends AppCompatActivity {
    private int waktu_loading=3000;

    //3000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splas_screen);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke Main activity
                Intent home=new Intent(SplasScreen.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
