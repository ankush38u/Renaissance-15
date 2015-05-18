package com.electricdroid.renaissance.quanta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.electricdroid.renaissance.R;
import com.electricdroid.renaissance.quanta.robofiesta.FormulaZero;
import com.electricdroid.renaissance.quanta.robofiesta.LineFollower;
import com.electricdroid.renaissance.quanta.robofiesta.RoboWar;

public class RoboFiesta extends ActionBarActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView roboWarTv;
    private TextView formulazeroTv;
    private TextView linefollowerTv;
    private TextView prizeRobo;
    // private TextView rcCarTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robo_fiesta);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        roboWarTv = (TextView) findViewById(R.id.robowarTv);
        formulazeroTv = (TextView) findViewById(R.id.formulaZeroTv);
        linefollowerTv = (TextView) findViewById(R.id.linefollowerTv);
        //  rcCarTv = (TextView) findViewById(R.id.rcCarTv);
        prizeRobo = (TextView) findViewById(R.id.prize_robo);
        roboWarTv.setOnClickListener(this);
        formulazeroTv.setOnClickListener(this);
        linefollowerTv.setOnClickListener(this);
        //   rcCarTv.setOnClickListener(this);
       prizeRobo.setOnClickListener(this);

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_robo_fiesta, menu);
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
        if (v == roboWarTv) {
            startActivity(new Intent(this, RoboWar.class));
        } else if (v == formulazeroTv) {
            startActivity(new Intent(this, FormulaZero.class));
        } else if (v == linefollowerTv) {
            startActivity(new Intent(this, LineFollower.class));
        }// else if (v == rcCarTv) {
        //   startActivity(new Intent(this, RCCar.class));
        // }
        else if(v==prizeRobo){
            Toast.makeText(this,"RoboFiesta Events combinely hold Prize Money of 43,000 Rs.",Toast.LENGTH_LONG).show();
        }
    }
}
