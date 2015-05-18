package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 14-02-2015.
 */
public class Antakshri extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>21st March 2015<br>12:00 PM - 2:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Akanksha Kumawat\nPooja Sharma\nDiksha Raina\nShruti Jaiswal");
        details = Html.fromHtml("<b>Details</b><p> Baithe - Baithe kya kare karna hai kuch kaam…<br> " +
                "The basic game that comes from all our houses has now become a national competition;<br>" +
                " we call you to showcase your talent. Do you have that spirit in you? <br> Come and show us!<br></p>" +
                "<b>1st Prize:</b>" + "<p>2,100₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>\n" +
                "1. A team should comprise of 3 members.<br>" +
                "2. The game will be organized in various rounds.<br>" +
                "3. Only Hindi movie songs are allowed (no album songs).<br>" +
                "4. The team will be promoted to next round on the basis of elimination.<br>" +
                "5. Entries would be entertainment on first come first registered basis.<br>" +
                "6. In case of any discrepancies, the decision of the judges will be final and binding.<br>" +
                "7. Prizes will be given to the teams which stood first and second.<br> </p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>150₹</p>");


        phn1 = "9929174600";
        coordinator1Name = "Akanksha Kumawat";
        coordinator2Name = "Diksha Raina";
        phn2 = "9602608997";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }

}