package com.aaronjeromemiller.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by aaronmiller on 7/24/17.
 */

public class SecondActivity extends AppCompatActivity{


    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_layout);
        Log.d(TAG, "onCreate: Started.");
    }
}
