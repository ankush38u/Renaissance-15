package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class BeatTheBeats extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Auditorium<br>19th March 2015<br>10:30 AM - 12:30 PM</p>");
        coordinatorNames = Html.fromHtml("Anuj Jain<br>Ankit Bhardwaj<br>Kshonish Marothia<br>" +
                "Indarpreet Singh<br>");
        details = Html.fromHtml("<b>Details</b><p>One thing good about beats... when it hits you, you FEEL! The character of instrumental music, let the emotions radiate and shine in their own character without presuming to display them as real or imaginary representations.</p>"
                + "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>A MTS HomeSpot Wi-Fi</p>");
        rules = Html.fromHtml("<b>Rules<br></b><p>Instruments allowed are :<br>" +
                "<br>" +
                "    1. Guitar<br>" +
                "    2. Keyboard<br>" +
                "    3. Drums<br>" +
                "    4. Flute<br>" +
                "    5. Percussion instruments" +
                "<br>" +
                "<br>Note: Only electric and semi-electric guitars.<br>" +
                "<br>" +
                "    Participants have to bring their own instruments(Only Basic Drum Set will be Provided to Participants)<br>" +
                "    Basic sound setup will be provided.<br>" +
                " <br>   Professional judges will be present. The decision of the judges will be final and absolutely binding.<br>" +
                "    Any damage to the instruments will be the sole responsibility of the participant.<br></p>" +
                "<b>Technical Rules</b>" + "<p> There will be three rounds.<br> " +
                "<br>" +
                "    1. First round: Participant will be given 3 minutes. He/she can play original composition or cover.<br>" +
                "    2. Second round: Every participant should have a backing track. Backing track can be of any song which is of the participant's choice. If a participant is not able to arrange backing track he/she is allowed to bring one person to accompany them.<br>" +
                "    3. Final round: This will be the last round.<br>" +
                "<br>" +
                "</p>" + "<b>Criterion For Judging:</b>" + "<p><br>" +
                "    1. Performance<br>" +
                "    2. Confidence<br>" +
                "    3. Handling of the instrument<br>" +
                "    4. Theme<br>" +
                "    5. Genre<br>" +
                "    6. Stage presence<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹</p>");


        phn1 = "9950982074";
        coordinator1Name = "Anuj Jain";
        coordinator2Name = "Ankit Bhardwaj";
        phn2 = "9462575946";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
