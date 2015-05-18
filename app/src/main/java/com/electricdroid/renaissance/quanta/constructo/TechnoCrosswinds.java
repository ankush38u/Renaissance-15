package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class TechnoCrosswinds extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Reference Library & ER<br>20th March 2015<br>10:30 AM - 12:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Bhanu Agarwal\n" +
                "Anmol Agarwal\n" +
                "Twishi Gautam\n" +
                "Surbhi Parikh\n" +
                "Tanisha Mangal");
        details = Html.fromHtml("<b>Details</b><p>It is a technical crossword puzzle solving competition that contains questions relating to engineering and science </p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>Techno crosswinds is a technical event comprising three rounds.<br>" +
                "Participants can come in the team of 2 members or there can be a single participant.<br>" +
                "Registered participants should inform of their arrival 30mins before event.<br>" +
                "<br>" +
                "Registration for the event will close 30 Mins. before the event.<br>" +
                "<br>" +
                "Round 1 (Brain War) :<br>" +
                "This round will contain two papers related to logical reasoning, aptitude and mathematics in first and English and G.K. in second. Time limit for first paper will be 15mins and for second will be 10mins.<br>" +
                "There will be elimination on the basis of common result.<br>" +
                "<br>" +
                "Round 2 (Techno Weapon) :<br>" +
                "This round will contain technical questions in the form of a crossword.<br>" +
                "Time limit for this round will be 30mins.<br>" +
                "In the case of tie, the total time taken for completion will be considered.<br>" +
                "Decision of judges or conducting authority will be final.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "7732881216";
        coordinator1Name = "Anmol Agarwal";
        coordinator2Name = "Bhanu Agarwal";
        phn2 ="8233779048";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
