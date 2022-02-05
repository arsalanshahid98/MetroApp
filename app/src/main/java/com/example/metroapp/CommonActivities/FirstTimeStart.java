package com.example.metroapp.CommonActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.metroapp.R;

public class FirstTimeStart extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time_start);

        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity_next();
            }
        });
    }

    public void open_activity_next() {
        Intent intent = new Intent(this, SelectProvincePakistan.class);
        startActivity(intent);
    }
}