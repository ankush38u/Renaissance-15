package com.electricdroid.renaissance;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.electricdroid.renaissance.endeavour.BootStrapping;


public class SplashScreen extends ActionBarActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mediaPlayer = MediaPlayer.create(SplashScreen.this, R.raw.music);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        Boolean music = sharedPreferences.getBoolean("chkbox",true); //key,default value
if(music == true) {
    mediaPlayer.start();
}
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashScreen.this, Renaissance.class));
                    finish();
                }


            }
        });

        timer.start();


    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash_screen, menu);
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
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
        finish();

    }
}