package com.example.metroapp.CommonActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.metroapp.Islamabad.IslamabadActivity;
import com.example.metroapp.Lahore.LahoreActivity;
import com.example.metroapp.R;

public class SelectCityPakistan extends AppCompatActivity {

    private Button button_lahore;
    private Button button_islamabad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city_pakistan);

        // setting actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Location");

        //initialize button
        button_lahore = findViewById(R.id.button_lahore);
        button_islamabad = findViewById(R.id.button_islamabad);

        //onclick listener for button
        button_lahore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity_lahore();
            }
        });
        button_islamabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity_islamabad();
            }
        });
    }

    // function for openting activity
    public void open_activity_lahore() {
        Intent intent = new Intent(this, LahoreActivity.class);
        startActivity(intent);
    }
    public void open_activity_islamabad() {
        Intent intent = new Intent(this, IslamabadActivity.class);
        startActivity(intent);
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