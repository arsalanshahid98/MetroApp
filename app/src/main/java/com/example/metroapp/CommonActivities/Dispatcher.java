// this activity handles the placement of last selected activity in location settings
package com.example.metroapp.CommonActivities;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class Dispatcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Class<?> activityClass;
        // here we set the default activity if no activity is selected
        // ie the activity which will appear on the app when installed for the first time (SelectCountry)
        try {
            SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
            activityClass = Class.forName(
                    prefs.getString("lastActivity", FirstTimeStart.class.getName()));
        } catch(ClassNotFoundException ex) {
            activityClass = FirstTimeStart.class;
        }

        startActivity(new Intent(this, activityClass));
    }
}