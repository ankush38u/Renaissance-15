package com.electricdroid.renaissance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.electricdroid.renaissance.splash.Antakshri;
import com.electricdroid.renaissance.splash.BeatTheBeats;
import com.electricdroid.renaissance.splash.CampusRoadies;
import com.electricdroid.renaissance.splash.ChefsCorner;
import com.electricdroid.renaissance.splash.FootLoose;
import com.electricdroid.renaissance.splash.GullyCricket;
import com.electricdroid.renaissance.splash.LanGaming;
import com.electricdroid.renaissance.splash.MadHouse;
import com.electricdroid.renaissance.splash.MadeItMyself;
import com.electricdroid.renaissance.splash.RapZap;
import com.electricdroid.renaissance.splash.StreetFootball;
import com.electricdroid.renaissance.splash.Trashion;


public class SplashEvents extends ActionBarActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView antakshriTv;
    private TextView beatTheBeatsTv;
    private TextView campusRoadiesTv;
    private TextView eatifyoucanTv;
   // private TextView footLooseTv;
    private TextView streetfootballTv;
    private TextView lanGamingTv;
    private TextView gullyCricketTv;
    private TextView madHouseTv;
    private TextView rapZapTv;
    private TextView trashionTv;
    private TextView madeItMyselfTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_events);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //    toolbar.setLogo(R.drawable.app_icon);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // inside your activity (if you did not enable transitions in your theme)


        antakshriTv = (TextView) findViewById(R.id.antakshriTv);
        beatTheBeatsTv = (TextView) findViewById(R.id.beatTheBeatsTv);
        campusRoadiesTv = (TextView) findViewById(R.id.campusRoadiesTv);
        eatifyoucanTv = (TextView) findViewById(R.id.eatifyoucanTv);
       // footLooseTv = (TextView) findViewById(R.id.footlooseTv);
        streetfootballTv = (TextView) findViewById(R.id.streetfootballTv);
        lanGamingTv = (TextView) findViewById(R.id.beatTheBeatsTv);
        gullyCricketTv = (TextView) findViewById(R.id.gullycricketTv);
        lanGamingTv = (TextView) findViewById(R.id.langamingTv);
        madHouseTv = (TextView) findViewById(R.id.madhouseTv);
        rapZapTv = (TextView) findViewById(R.id.rapzapTv);
        trashionTv = (TextView) findViewById(R.id.TrashionTv);
        madeItMyselfTv = (TextView) findViewById(R.id.madeitmyselfTv);


        antakshriTv.setOnClickListener(this);
        beatTheBeatsTv.setOnClickListener(this);
        campusRoadiesTv.setOnClickListener(this);
        eatifyoucanTv.setOnClickListener(this);
       // footLooseTv.setOnClickListener(this);
        streetfootballTv.setOnClickListener(this);
        lanGamingTv.setOnClickListener(this);
        gullyCricketTv.setOnClickListener(this);
        lanGamingTv.setOnClickListener(this);
        madHouseTv.setOnClickListener(this);
        rapZapTv.setOnClickListener(this);
        trashionTv.setOnClickListener(this);
        madeItMyselfTv.setOnClickListener(this);
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash_events, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
    @Override
    public void onClick(View v) {
        if (v == antakshriTv) {
            startActivity(new Intent(this, Antakshri.class));
        } else if (v == beatTheBeatsTv) {
            startActivity(new Intent(this, BeatTheBeats.class));
        } else if (v == campusRoadiesTv) {
            startActivity(new Intent(this, CampusRoadies.class));
        } else if (v == eatifyoucanTv) {
            //eatitufyoucan is changed to chefs corner
            startActivity(new Intent(this, ChefsCorner.class));
        }  else if (v == streetfootballTv) {
            startActivity(new Intent(this, StreetFootball.class));
        } else if (v == gullyCricketTv) {
            startActivity(new Intent(this, GullyCricket.class));
        } else if (v == lanGamingTv) {
            startActivity(new Intent(this, LanGaming.class));
        } else if (v == madHouseTv) {
            startActivity(new Intent(this, MadHouse.class));
        } else if (v == rapZapTv) {
            startActivity(new Intent(this, RapZap.class));
        } else if (v == trashionTv) {
            startActivity(new Intent(this, Trashion.class));
        } else if (v == madeItMyselfTv) {
            startActivity(new Intent(this, MadeItMyself.class));
        }

    }

}