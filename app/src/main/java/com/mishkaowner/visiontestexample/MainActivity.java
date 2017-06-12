package com.mishkaowner.visiontestexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mishkaowner.simplevisionlib.BarcodeCaptureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, BarcodeCaptureActivity.class));
    }
}
