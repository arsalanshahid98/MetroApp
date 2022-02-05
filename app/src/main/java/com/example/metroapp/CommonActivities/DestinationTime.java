package com.example.metroapp.CommonActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.metroapp.R;

import javax.xml.transform.Result;

public class DestinationTime extends AppCompatActivity {

    public TextView tResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination_time);

        // setting actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Time");

        tResult = findViewById(R.id.tResult);
        Intent intent = getIntent();
        String s = intent.getStringExtra("key");
        tResult.setText(s);

    }

    // actionbar back button function
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: ;
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}