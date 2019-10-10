package com.example.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove, btnMoveData, btnCall, btnInputData, btnBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btnMoveData);
        btnMoveData.setOnClickListener(this);

        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);

        btnBrowser = findViewById(R.id.btnBrowser);
        btnBrowser.setOnClickListener(this);

        btnInputData = findViewById(R.id.btnInputData);
        btnInputData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMove:
                Intent moveActivity = new Intent (this, MoveActivity.class);
                startActivity(moveActivity);
                break;
             case R.id.btnMoveData:
                Intent moveDataActivity = new Intent (this, MoveDataActivity.class);
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_NAME, "Amine");
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_AGE, "20");
                startActivity (moveDataActivity);
                break;

            case R.id. btnCall:
                String phoneNumber = "0876172687";
                Intent callInsent = new Intent (Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(callInsent);
                break;

            case R.id.btnBrowser:
                String url = "http://ittelkom-pwt.ac.id/";
                Intent intentImplicitWeb = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intentImplicitWeb);
                break;

            case R.id.btnInputData:
                Intent intentInputData = new Intent( this, ActivityData1.class);
                startActivity(intentInputData);
        }
    }
}
