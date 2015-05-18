package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class CampusRoadies extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Central Lawn<br>20th March 2015<br>10:30 AM - 2:30 PM</p>");
        coordinatorNames = Html.fromHtml("Shashank Agarwal<br>Utsav Sukla<br>Somintr Prabhakar<br>Aayushi Mathur<br>Aayushi Khandelwal");
        details = Html.fromHtml("<b>Details</b><p>  Survival of the fittest and the coolest<br>Dare to dare to take the challenge.<br>" +
                "Get ready for the challenges we bring to you this Renaissance.</p>" + "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "    1.There will be 4 members in each team.<br>" +
                "    2. All the participants of one team need not be from same college.<br>" +
                "    3. At least one member in each team must be a girl.<br>" +
                "    4. The event will be comprised of 6 rounds.<br>" +
                "    5. Every round will be an elimination round and the participants will be tested to their limits.<br>" +
                "    6. The registration will be done on the basis of first come first serve.<br>" +
                "    7. The decision of the organizing team would be final.      <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>300₹</p>");


        phn1 = "9024836799";
        coordinator1Name = "Shashank Agarwal";
        coordinator2Name = "Utsav Shukla";
        phn2 = "9571706500";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
