package com.example.metroapp.CommonActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.metroapp.R;

public class SelectCountry extends AppCompatActivity {

    private Button pk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_country);

        // setting actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Location");

        //initialize button
        pk = findViewById(R.id.pk);

        //onclick listener for button
        pk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    // function for openting activity
    public void openActivity() {
        Intent intent = new Intent(this, SelectProvincePakistan.class);
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