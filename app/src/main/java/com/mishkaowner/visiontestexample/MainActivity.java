package com.mishkaowner.visiontestexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.mishkaowner.simplevisionlib.BarcodeCaptureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivityForResult(new Intent(this, BarcodeCaptureActivity.class), 1234);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == CommonStatusCodes.SUCCESS) {
            Log.d("Bardcode Reader", "Barcode Value is " + data.getIntExtra(BarcodeCaptureActivity.BarcodeFormat, -1));
        }
    }
}
