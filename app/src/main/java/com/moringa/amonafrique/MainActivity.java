package com.moringa.amonafrique;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.moringa.amonafrique.fragments.ContactFragment;
import com.moringa.amonafrique.fragments.DashboardFragment;
import com.moringa.amonafrique.fragments.NotificationFragment;
import com.moringa.amonafrique.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new DashboardFragment());
        navigationView = findViewById(R.id.navigation_dashboard);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    private Boolean loadFragment(Fragment fragment){
         if(fragment != null){
             getSupportFragmentManager()
                     .beginTransaction()
                     .replace(R.id.fragmentContainer,fragment)
                     .commit();
             return true;
         }
      return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.navigation_home :
                fragment = new DashboardFragment();
                break;
            case R.id.search:
                fragment = new SearchFragment();
                break;
            case R.id.notification:
                fragment = new NotificationFragment();
                break;
            case R.id.contact:
                fragment = new ContactFragment();
                break;
        }
        return loadFragment(fragment);
    }
}