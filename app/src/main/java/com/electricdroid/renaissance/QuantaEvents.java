package com.electricdroid.renaissance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.electricdroid.renaissance.quanta.ComputerKingdom;
import com.electricdroid.renaissance.quanta.Constructo;
import com.electricdroid.renaissance.quanta.RoboFiesta;


public class QuantaEvents extends ActionBarActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView constructoTv;
    private TextView computerKingdomTv;
    private TextView robofiestaTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanta_events);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //    toolbar.setLogo(R.drawable.app_icon);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        computerKingdomTv = (TextView) findViewById(R.id.computerKingdomTv);
        constructoTv = (TextView) findViewById(R.id.constructoTv);
        robofiestaTv = (TextView) findViewById(R.id.robofiestaTv);

        computerKingdomTv.setOnClickListener(this);
        constructoTv.setOnClickListener(this);
        robofiestaTv.setOnClickListener(this);

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quanta_events, menu);
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

        if(v == constructoTv){
            startActivity(new Intent(this, Constructo.class));
            overridePendingTransition(R.anim.scale_from_corner,R.anim.fadeout);
        }
        else if( v == robofiestaTv){
            startActivity(new Intent(this, RoboFiesta.class));
            overridePendingTransition(R.anim.scale_from_corner,R.anim.fadeout);
        }
        else if( v == computerKingdomTv ){
            startActivity(new Intent(this, ComputerKingdom.class));
            overridePendingTransition(R.anim.scale_from_corner,R.anim.fadeout);
        }


    }
}
