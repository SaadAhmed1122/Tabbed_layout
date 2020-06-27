package com.example.tabbed_layout;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.tabbed_layout.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
        Toolbar toolbar2;

        DrawerLayout drawerLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar_sql);
        setSupportActionBar(toolbar2);

        drawerLayout2 = (DrawerLayout) findViewById(R.id.drawer_layout_sql);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout2, toolbar2, R.string.navigation_open, R.string.navigation_close);
        drawerLayout2.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_sql);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int number = 1;
        int id = item.getItemId();
        if (id == R.id.intro1) {
            show_content(number);

        } else if (id == R.id.intro2) {
            number=2;
            show_content(number);
            // tab.removeTab();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_sql);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void show_content(int number) {
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(),number);
        ViewPager viewPager = findViewById(R.id.view_pager_sql_A);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs_sql_A);
        tabs.setupWithViewPager(viewPager);
    }
}