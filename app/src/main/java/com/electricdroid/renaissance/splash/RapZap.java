package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class RapZap extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Auditorium<br>18th March 2015<br>12:00 PM-2:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Niharika\nBhuwanesh Pareek\nAditya Sharma\nKailash\n");
        details = Html.fromHtml("<b>Details</b><p>If your flocabulary is awesome and you are Eminem or Yo Yo of your own kind than rap-zap is all you need to showcase your talent .<br>" +
                "RAP-ZAP, a national level rapping contest ,anyone or everyone can participate .Do mark your presence.</p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>2000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. There can be max 2 members (Single entries are also accepted). <br>" +
                "2. Contestants should come prepared with at least 2 raps. <br>" +
                "3. Contestant has to bring along their own backing tracks, beats or beat boxer (compulsorily). <br>" +
                "4. Vulgarity/obscenity in content will lead to immediate disqualification. <br>" +
                "5. Having an Own/Original Rap Composition will be considered for bonus Marks. <br>" +
                "6. Contestants will be judged on basis of rhythm, clarity, attitude and stage presence. <br>" +
                "7. Decision of judges would be final and abiding. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹</p>");


        phn1 = "9509464851";
        coordinator1Name = "Bhuwanesh Pareek";
        coordinator2Name = "Aditya Sharma";
        phn2 = "8107839613";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
