package com.electricdroid.renaissance.quanta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.electricdroid.renaissance.R;
import com.electricdroid.renaissance.quanta.computerkingdom.CaddMania;
import com.electricdroid.renaissance.quanta.computerkingdom.JavaLets;
import com.electricdroid.renaissance.quanta.computerkingdom.JustC;
import com.electricdroid.renaissance.quanta.computerkingdom.StepToStock;
import com.electricdroid.renaissance.quanta.computerkingdom.Subito;

public class ComputerKingdom extends ActionBarActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private TextView javaletsTv;
    private TextView justcTv;
    private TextView steptostockTv;
    private TextView caddmaniaTv;
    private TextView subitoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_kingdom);
setTitle("Carriage Return");
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        javaletsTv = (TextView) findViewById(R.id.javaletsTv);
        justcTv = (TextView) findViewById(R.id.justcTv);
        steptostockTv = (TextView) findViewById(R.id.steptostockTv);
        caddmaniaTv = (TextView) findViewById(R.id.caddmaniaTv);
        subitoTv = (TextView) findViewById(R.id.subitoTv);


        javaletsTv.setOnClickListener(this);
        justcTv.setOnClickListener(this);
        steptostockTv.setOnClickListener(this);
        caddmaniaTv.setOnClickListener(this);
        subitoTv.setOnClickListener(this);

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_computer_kingdom, menu);
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
        if (v == javaletsTv) {
            startActivity(new Intent(this, JavaLets.class));
        } else if (v == justcTv) {
            startActivity(new Intent(this, JustC.class));
        } else if (v == steptostockTv) {
            startActivity(new Intent(this, StepToStock.class));
        } else if (v == caddmaniaTv) {
            startActivity(new Intent(this, CaddMania.class));
        } else if (v == subitoTv) {
            startActivity(new Intent(this, Subito.class));
        }
    }
}
