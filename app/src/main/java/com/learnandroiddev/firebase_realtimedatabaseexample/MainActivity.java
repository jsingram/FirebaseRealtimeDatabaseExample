package com.learnandroiddev.firebase_realtimedatabaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] features = {"Read and Write Data"};

    ListView featuresListView;

    ArrayAdapter featuresAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        featuresListView = (ListView) findViewById(R.id.main_lv_features);

        featuresAdapter = new ArrayAdapter(
                this, // Context
                android.R.layout.simple_list_item_1, // List item layout
                features); // String Array

        featuresListView.setAdapter(featuresAdapter);
    }
}
