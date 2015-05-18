package com.electricdroid.renaissance;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Alumni extends Activity {
 private TextView alumanitext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);
        alumanitext = (TextView) findViewById(R.id.alumanitext);
        alumanitext.setText(Html.fromHtml("<b>Description</b><p>" +
                "<br>" +
                "Time and memories hold a very special relation, both grow in exact opposite directions. It always easy to drift away from people. But one who matters should always be held close.<br>" +
                "<br>" +
                "This time in Renaissance we have taken this initiative to recollect, share and make memories to create a strong alumni base with our alumni who have brought laurels to the foundation. Our alumni are the custodians of our heritage and off-course are the actual Heroes of the Renaissance.<br></p>"+
        "<b>Events: </b><p>ALUMNI ENTREPRENEUR SESSION:<br>" +
                "<br>" +
                "Date : 01:00 PM, 19th March 2015<br>" +
                "<br>" +
                "Venue : Conference Hall, JECRC<br>" +
                "<br>" +
                "DEBATE :<br>" +
                "<br>" +
                "Date : 10:30 AM 21st March 2015<br>" +
                "<br>" +
                "Venue : Auditorium, JECRC</p>"+
        "<b>Contact Us: </b><p>" +
                "<br>" +
                "For your queries regarding alumni events contact<br>" +
                "<br>" +
                "Sahil Gulati : 99289-12384 / 99826-82451<br></p>"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alumani, menu);
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
