package com.electricdroid.renaissance;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Zarurat extends Activity {
    TextView zarurattext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zarurat);
        zarurattext = (TextView) findViewById(R.id.zarurattext);
        zarurattext.setText(Html.fromHtml("<b>About Zarurat</b><p> Zarurat - the help beyond is a social endeavor by the JECRC foundation which focuses on imparting a healthy all round development of the underprivileged children from the nearby slum areas. Keeping up with the spirit of Renaissance, the pre-Renaissance event “Zarurat - celebrating innocence” is celebrated, seeing a footfall of 350 kids from various NGOs and 200 student volunteers. <br>" +
                "<br>" +
                "The team is very fortunate to be blessed and mentored by Nobel Peace Prize Laureate Shree Kailash Satyarthi Sir who has graced the previous year's event with his benign presence.<br>" +
                "<br>" +
                "Continuing the spirit of celebration, Zarurat will be organising this year's event on 17th March 2015. The event is proposed to witness the esteemed presence of Shri Anshu Gupta, founder Goonj Foundation and Dr. D.R. Mehta sir, Founder Jaipur Foot.<br>" +
                "<br>" +
                "On behalf of the JECRC Foundation, Zarurat family invites you to be a part of the joyous event. Let us all contribute in terms of financial help or kinds to make this event a big success." +
                "</p>" +
                "<b>Events: </b><p>The gala day will witness the following events:<br>" +
                "<br>" +
                "BAL MAHOTSAV : A kids carnival for the fun and entertainment of the kids.<br>" +
                "<br>" +
                "KALAKRITI : A platform for the children to go beyond their horizons and create a world of their imagination.<br>" +
                "<br>" +
                "ENT/EYE Check-Up : Health check-up in association with one of the leading hospitals.<br>" +
                "<br>" +
                "KATHASHALA \"Story Telling\" : This session will see narration of a motivational story. The idea behind this activity is to inculcate moral values in the children.<br>" +
                "<br>" +
                "HAND WASH<br>" +
                "<br>" +
                "PRASTUTI : Performances by the kids of invited NGOs based on different talents in singing, dancing and exceptional stage performances.</p>" +
                "<b>Contact: </b><p>" +
                "<br>" +
                "Visit Zarurat.org<br>" +
                "<br>" +
                "In order to share your views and make a contribution please feel free to contact<br>" +
                "<br>" +
                "Jaswant Singh : 70231-09977</p>"));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zarurat, menu);
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
