package com.app.nhasach;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.app.nhasach.database.DBHelper;
import com.app.nhasach.fragment.GiohangFragment;
import com.app.nhasach.fragment.HoSoFragment;
import com.app.nhasach.fragment.NoibatFragment;
import com.app.nhasach.fragment.TrangchuFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Khởi tạo DBHelper để sao chép database
        DBHelper dbHelper = new DBHelper(this);
        dbHelper.getReadableDatabase();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new TrangchuFragment())
                    .commit();
        }

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            if (item.getItemId() == R.id.nav_home) {
                selectedFragment = new TrangchuFragment();
            } else if (item.getItemId() == R.id.nav_noi_bat) {
                selectedFragment = new NoibatFragment();
            } else if (item.getItemId() == R.id.nav_gio_hang) {
                selectedFragment = new GiohangFragment();
            } else if (item.getItemId() == R.id.nav_profile) {
                selectedFragment = new HoSoFragment();
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, selectedFragment)
                        .commit();
            }
            return true;
        });

    }
}