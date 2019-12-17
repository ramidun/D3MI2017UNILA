package com.d3mi.ramidun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailPlayerActivity extends AppCompatActivity {

    public static String EXTRA_PLAYER = "extra_player";
    TextView tvNo, tvNama, tvBirth_Date, tvPosition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        tvNo = findViewById(R.id.tvNo);
        tvNama = findViewById(R.id.tvNama);
        tvBirth_Date = findViewById(R.id.tvBirth_Date);
        tvPosition = findViewById(R.id.tvPosition);


        PlayerItem playerItem =  getIntent().getParcelableExtra(EXTRA_PLAYER);

        String no = playerItem.getNo();
        String name = playerItem.getName();
        String birth_date = playerItem.getBirth_date();
        String position = playerItem.getPosition();

        tvNo.setText(no);
        tvNama.setText(name);
        tvBirth_Date.setText(birth_date);
        tvPosition.setText(position);


    }
}
