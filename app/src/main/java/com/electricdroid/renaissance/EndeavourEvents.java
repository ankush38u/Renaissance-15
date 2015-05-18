package com.electricdroid.renaissance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.electricdroid.renaissance.endeavour.Adaa;
import com.electricdroid.renaissance.endeavour.Anupras;
import com.electricdroid.renaissance.endeavour.BootStrapping;
import com.electricdroid.renaissance.endeavour.NukkadNatak;
import com.electricdroid.renaissance.endeavour.RagaNight;
import com.electricdroid.renaissance.endeavour.Rockathon;
import com.electricdroid.renaissance.endeavour.StepUp;
import com.electricdroid.renaissance.endeavour.VinylWar;


public class EndeavourEvents extends ActionBarActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView adaaTv;
    private TextView anuprasTv;
    private TextView bootstrappingTv;
    private TextView nukkadnatakTv;
    private TextView raganightTv;
    private TextView rockathonTv;
    private TextView stepupTv;
    private TextView vinylwarTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endeavour_events);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //    toolbar.setLogo(R.drawable.app_icon);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        adaaTv = (TextView) findViewById(R.id.adaaTv);
        anuprasTv = (TextView) findViewById(R.id.anuprasTv);
        bootstrappingTv = (TextView) findViewById(R.id.bootstrappingTv);
        nukkadnatakTv = (TextView) findViewById(R.id.nukkadnatakTv);
        raganightTv = (TextView) findViewById(R.id.raganightTv);
        rockathonTv = (TextView) findViewById(R.id.rockathonTv);
        stepupTv = (TextView) findViewById(R.id.stepupTv);
        vinylwarTv = (TextView) findViewById(R.id.vinylwarTv);

        adaaTv.setOnClickListener(this);
        anuprasTv.setOnClickListener(this);
        bootstrappingTv.setOnClickListener(this);
        nukkadnatakTv.setOnClickListener(this);
        raganightTv.setOnClickListener(this);
        rockathonTv.setOnClickListener(this);
        stepupTv.setOnClickListener(this);
        vinylwarTv.setOnClickListener(this);

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_endeavour_events, menu);
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
        if (v == adaaTv) {
            startActivity(new Intent(this, Adaa.class));
        } else if (v == anuprasTv) {
            startActivity(new Intent(this, Anupras.class));
        } else if (v == bootstrappingTv) {
            startActivity(new Intent(this, BootStrapping.class));

        } else if (v == nukkadnatakTv) {
            startActivity(new Intent(this, NukkadNatak.class));
        } else if (v == raganightTv) {
            startActivity(new Intent(this, RagaNight.class));
        } else if (v == rockathonTv) {
            startActivity(new Intent(this, Rockathon.class));
        } else if (v == stepupTv) {
            startActivity(new Intent(this, StepUp.class));
        } else if (v == vinylwarTv) {
            startActivity(new Intent(this, VinylWar.class));
        }
    }

}
