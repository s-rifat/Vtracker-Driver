package com.example.vtracker2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_spash_screen);

////  splash Code
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent i = new Intent(SpashScreen.this, MainActivity.class); startActivity(i);
                finish(); } }, 3000);
    }
}