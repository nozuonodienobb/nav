package com.example.xiaobai.nag;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.first:
                        Navigation.findNavController(MainActivity.this, R.id.my_nav_host_fragment).navigate(R.id.open_fragment1);
                        break;
                    case R.id.second:
                        Navigation.findNavController(MainActivity.this, R.id.my_nav_host_fragment).navigate(R.id.open_fragment2);
                        break;
                    case R.id.three:
                        Navigation.findNavController(MainActivity.this, R.id.my_nav_host_fragment).navigate(R.id.open_fragment3);
                        break;
                }
                return true;
            }
        });
    }



}
