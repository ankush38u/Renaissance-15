package com.electricdroid.renaissance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.electricdroid.renaissance.splash.FootLoose;


public class Renaissance extends ActionBarActivity implements View.OnClickListener {
    private Toolbar toolbar;

    private View splash;
    private View endeavour;
    private View quanta;
    private View doodleTv;
    private View zaruratTv;
    private View alumaniTv;
    private View hhiTv;
    @Override
    public void onClick(View v) {
        if (v == splash) {

            startActivity(new Intent(this, SplashEvents.class));
            overridePendingTransition(R.anim.shrink_and_rotate_enter, R.anim.shrink_and_rotate_exit);
        } else if (v == endeavour) {

            startActivity(new Intent(this, EndeavourEvents.class));
            // overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            overridePendingTransition(R.anim.shrink_and_rotate_enter, R.anim.shrink_and_rotate_exit);
        } else if (v == quanta) {

            startActivity(new Intent(this, QuantaEvents.class));
            overridePendingTransition(R.anim.shrink_and_rotate_enter, R.anim.shrink_and_rotate_exit);

        } else if (v == doodleTv) {
            startActivity(new Intent(this, Doodle.class));
            overridePendingTransition(android.R.anim.slide_in_left, R.anim.fadeout);
        } else if (v == zaruratTv) {
            startActivity(new Intent(this, Zarurat.class));
            overridePendingTransition(android.R.anim.slide_in_left, R.anim.fadeout);
        } else if (v == alumaniTv) {
            startActivity(new Intent(this, Alumni.class));
            overridePendingTransition(android.R.anim.slide_in_left, R.anim.fadeout);
        } else if(v==hhiTv){
            startActivity(new Intent(this, FootLoose.class));
            overridePendingTransition(android.R.anim.slide_in_left, R.anim.fadeout);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renaissance_final);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        toolbar.setLogo(R.drawable.app_icon);
        //    toolbar.setTitle("Renaissance");

        getSupportActionBar().setDisplayShowTitleEnabled(false);


//settings tv as button and setting onClickListener

        splash = findViewById(R.id.splashTv);
        endeavour = findViewById(R.id.endeavourTv);
        quanta = findViewById(R.id.quantaTv);
        doodleTv = findViewById(R.id.doodleTv);
        zaruratTv = findViewById(R.id.zaruratTv);
        alumaniTv = findViewById(R.id.alumaniTv);
        hhiTv = findViewById(R.id.hhiTv);
        splash.setOnClickListener(this);
        endeavour.setOnClickListener(this);
        quanta.setOnClickListener(this);
        doodleTv.setOnClickListener(this);
        zaruratTv.setOnClickListener(this);
        alumaniTv.setOnClickListener(this);
        hhiTv.setOnClickListener(this);
        //Navigation Drawer work

        NavigationDrawerFragment navigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        navigationDrawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_renaissance, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            //  Toast.makeText(this, "Yu hit the settings", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Prefs.class));
            return true;
        }
        if (id == R.id.action_about) {
            startActivity(new Intent(this, About.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onResume() {
        super.onResume();
        // .... other stuff in my onResume ....
        this.doubleBackToExitPressedOnce = false;
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            //   finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, R.string.exit_press_back_twice_message, Toast.LENGTH_SHORT).show();
    }
}
