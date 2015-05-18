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
import com.electricdroid.renaissance.quanta.constructo.Aero;
import com.electricdroid.renaissance.quanta.constructo.BrainWiz;
import com.electricdroid.renaissance.quanta.constructo.Combatant;
import com.electricdroid.renaissance.quanta.constructo.Dexterity;
import com.electricdroid.renaissance.quanta.constructo.Embryo;
import com.electricdroid.renaissance.quanta.constructo.ForkLifter;
import com.electricdroid.renaissance.quanta.constructo.JunkyardWar;
import com.electricdroid.renaissance.quanta.constructo.ReverseEngineering;
import com.electricdroid.renaissance.quanta.constructo.SandIt;
import com.electricdroid.renaissance.quanta.constructo.SpellBee;
import com.electricdroid.renaissance.quanta.constructo.TechnoCrosswinds;
import com.electricdroid.renaissance.quanta.constructo.Zenith;

public class Constructo extends ActionBarActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView aeroTv;
    private TextView brainwizTv;
    private TextView combatantTv;
    private TextView dexterityTv;
    private TextView embryoTv;
    private TextView forkLifterTv;
    private TextView junkyardwarTv;
    private TextView reverseengineeringTv;
    private TextView sanditTv;
    private TextView spellbeeTv;
    private TextView technocrosswindsTv;
    private TextView zenithTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructo);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        aeroTv = (TextView) findViewById(R.id.aeroTv);
        brainwizTv = (TextView) findViewById(R.id.brainwizTv);
        combatantTv = (TextView) findViewById(R.id.combatantTv);
        dexterityTv = (TextView) findViewById(R.id.dexterityTv);
        embryoTv = (TextView) findViewById(R.id.embryoTv);
        forkLifterTv = (TextView) findViewById(R.id.forklifterTv);
        junkyardwarTv = (TextView) findViewById(R.id.junkyardwarTv);
        reverseengineeringTv = (TextView) findViewById(R.id.reverseengineeringTv);
        sanditTv = (TextView) findViewById(R.id.sanditTv);
        spellbeeTv = (TextView) findViewById(R.id.spellbeeTv);
        technocrosswindsTv = (TextView) findViewById(R.id.technocrosswindsTv);
        zenithTv = (TextView) findViewById(R.id.zenithTv);


        aeroTv.setOnClickListener(this);
        brainwizTv.setOnClickListener(this);
        combatantTv.setOnClickListener(this);
        dexterityTv.setOnClickListener(this);
        embryoTv.setOnClickListener(this);
        forkLifterTv.setOnClickListener(this);
        junkyardwarTv.setOnClickListener(this);
        reverseengineeringTv.setOnClickListener(this);
        sanditTv.setOnClickListener(this);
        spellbeeTv.setOnClickListener(this);
        technocrosswindsTv.setOnClickListener(this);
        zenithTv.setOnClickListener(this);

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_constructo, menu);
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

        if(v==aeroTv){
           startActivity(new Intent(this, Aero.class));
        }
        else if(v==brainwizTv){
            startActivity(new Intent(this, BrainWiz.class));
        }
        else if(v==combatantTv){
            startActivity(new Intent(this, Combatant.class));
        }
        else if(v==dexterityTv){
            startActivity(new Intent(this, Dexterity.class));
        }
        else if(v==embryoTv){
            startActivity(new Intent(this, Embryo.class));
        }
        else if(v==forkLifterTv){
            startActivity(new Intent(this, ForkLifter.class));
        }
        else if(v==junkyardwarTv){
            startActivity(new Intent(this, JunkyardWar.class));
        }
        else if(v==reverseengineeringTv){
            startActivity(new Intent(this, ReverseEngineering.class));
        }
        else if(v==sanditTv){
            startActivity(new Intent(this, SandIt.class));
        }
        else if(v==spellbeeTv){
            startActivity(new Intent(this, SpellBee.class));
        }
        else if(v==technocrosswindsTv){
            startActivity(new Intent(this, TechnoCrosswinds.class));
        }
        else if(v==zenithTv){
            startActivity(new Intent(this, Zenith.class));
        }


    }
}