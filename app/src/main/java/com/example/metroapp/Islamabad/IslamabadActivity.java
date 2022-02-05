package com.example.metroapp.Islamabad;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.metroapp.CommonActivities.Nearby;
import com.example.metroapp.R;
import com.example.metroapp.CommonActivities.Settings;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class IslamabadActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    //getting bottom navigation view
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamabad);

        //initializing bottom navigation view
        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // open specific fragment while opening app
        bottomNavigationView.setSelectedItemId(R.id.map);
    }

    // initializing the fragments for bottom navigation
    IslamabadMap islamabadMapFragment = new IslamabadMap();
    IslamabadSearch islamabadSearchFragment = new IslamabadSearch();
    Nearby nearbyFragment = new Nearby();
    Settings settingsFragment = new Settings();

    //function for bottom navigation buttons to direct them to its fragments
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.map:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, islamabadMapFragment).commit();
                setTitle("Map"); //setting action bar title
                return true;
            case R.id.search:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, islamabadSearchFragment).commit();
                setTitle("Search"); //setting action bar title
                return true;
            case R.id.nearby:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, nearbyFragment).commit();
                setTitle("Near by"); //setting action bar title
                return true;
            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();
                setTitle("Settings"); //setting action bar title
                return true;
        }
        return false;
    }

    // setting this activity as last activity if selected in settings
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("lastActivity", getClass().getName());
        editor.commit();
    }

    // return to home screen of phone when back pressed or back gestured
    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }

}