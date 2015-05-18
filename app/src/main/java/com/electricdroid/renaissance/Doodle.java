package com.electricdroid.renaissance;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Doodle extends Activity {
private TextView doodleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doodle);
        setTitle("The Doodle Carnival");
    doodleText =(TextView) findViewById(R.id.doodleText);
        doodleText.setText("\n" +
                "\n" +
                "Cartoons have a very peculiar characteristic- to Entertain!\n" +
                "\n" +
                "Cartoons have a unique way of tickling the funny bone of every individual and we, childishly chuckle. When it comes to watching catoons, the age doesn’t matter. We all feel nostalgic by seeing cartoons that we used to watch in our childhood. They bring us a whole bunch of juvenile memories.\n" +
                "\n" +
                "Cartoons are being used over time to depict predicaments of society and also to convey a message. The Doodle Carnival will be a tribute to decades long legacy of cartoons. This will be a set-up depicting various Eras of Animation, Production Houses, popular Cartoon Characters and much more..\n");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_doodle, menu);
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
}
