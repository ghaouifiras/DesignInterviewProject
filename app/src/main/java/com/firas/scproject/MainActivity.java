package com.firas.scproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.firas.scproject.fragments.AlertsFrgment;
import com.firas.scproject.fragments.DashboardFragment;
import com.firas.scproject.fragments.MediaFragment;
import com.firas.scproject.fragments.PhoneUsageFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // using toolbar as ActionBar
        setSupportActionBar(toolbar);


        // Display application icon in the toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.baseline_menu_24);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }
    AlertsFrgment alertsFrgment = new AlertsFrgment();
    DashboardFragment dashboardFragment = new DashboardFragment();
    PhoneUsageFragment phoneUsageFragment = new PhoneUsageFragment();
    MediaFragment mediaFragment = new MediaFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, dashboardFragment).commit();
                return true;

            case R.id.usage:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, phoneUsageFragment).commit();
                return true;

            case R.id.media:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, mediaFragment).commit();
                return true;
            case R.id.alerts:
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, alertsFrgment).commit();
            return true;
        }
        return false;    }
}