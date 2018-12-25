package com.gzeinnumer.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class NavigationDrawerExer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer_navigation_drawer_exer_activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        linearLayout = findViewById(R.id.linearlayout);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        linearLayout.setVisibility(View.VISIBLE);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentTransaction fragmentTransaction = null;
        if (id == R.id.textView_fragment) {
            ExerTextViewFragment fragment = new ExerTextViewFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment,null);
        } else if (id == R.id.editText_fragment) {
            ExerEditTextFragment fragment = new ExerEditTextFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment,null);
        } else if (id == R.id.button_fragment) {
            ExerButtonFragment fragment = new ExerButtonFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment,null);
        } else if (id == R.id.listView_fragment) {
            ExerListViewFragment fragment = new ExerListViewFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment,null);
        } else if (id == R.id.recyclerView_fragment) {
            ExerRecyclerViewFragment fragment = new ExerRecyclerViewFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment,null);
        } else if (id == R.id.CardView_fragment) {
            ExerCardViewFragment fragment = new ExerCardViewFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment,null);
        }

        fragmentTransaction.addToBackStack(null);
        linearLayout.setVisibility(View.GONE);
        fragmentTransaction.commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
