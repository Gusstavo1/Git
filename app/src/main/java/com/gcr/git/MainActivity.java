package com.gcr.git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Rama3");
        String array[] = new String[10];
        array[0] = "Gustavo";
        array[1] = "Calderon";

        for(String pos:array){
            Log.d(TAG,"pos "+pos);
        }

    }
}