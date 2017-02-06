package com.example.android.colors.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class ActivityExample extends AppCompatActivity {
    String msg = "Android : ";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentExample homeScreen=new FragmentExample();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container_body, homeScreen, "HomeFragment");
        ft.addToBackStack("HomeFragment");
        ft.commit();
       // View v=(View)findViewById(R.id.TextView);
        Log.d(msg, "The onCreate() event");
        Toast.makeText(this, "The onCreate() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
        Toast.makeText(this, "The onStart() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
        Toast.makeText(this, "The onResume() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
        Toast.makeText(this, "The onPause() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
        Toast.makeText(this, "The onStop() event", Toast.LENGTH_SHORT).show();
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
        Toast.makeText(this, "The onDestroy() event", Toast.LENGTH_SHORT).show();
    }
}
