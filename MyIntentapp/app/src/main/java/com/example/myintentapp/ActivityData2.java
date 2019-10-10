package com.example.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityData2 extends AppCompatActivity {

    public static final  String EXTRA_DATA = "extra_data";
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);

        tvData= findViewById(R.id.TvRecievedData);

        String text = getIntent().getStringExtra(EXTRA_DATA);
        tvData.setText(text);
    }
}
