package com.example.run;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private PaceFragment mPaceFragment;
    private MetronomeFragment mMetronomeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mPaceFragment = new PaceFragment();
        mMetronomeFragment = new MetronomeFragment();

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();

        mBottomNavigationView = findViewById(R.id.navigationView);
        mBottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment targetFragment = null;
            if (item.getItemId() == R.id.item_pace) {
                targetFragment = mPaceFragment;
            } else if (item.getItemId() == R.id.item_metronome) {
                targetFragment = mMetronomeFragment;
            }
            setFragment(targetFragment);
            return true;
        });
    }

    private void setFragment(@Nullable Fragment fragment) {
        if (fragment == null) {
            return;
        }
        mFragmentTransaction.replace(R.id.main_fragment, fragment);
        mFragmentTransaction.commit();
    }
}