package com.example.run;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.run.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mBottomNavigationView = findViewById(R.id.navigationView);
        mBottomNavigationView.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.fragment_home) {

            } else if (item.getItemId() == R.id.fragment_search) {

            }
            return true;
        });
    }
}