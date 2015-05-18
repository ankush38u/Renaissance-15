package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class FootLoose extends QuantaEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("HipHop International");
        venue = Html.fromHtml("<b>Venue</b><p>Central Lawn<br>20th March 2015<br>3:00 PM - 6:00 PM</p>");
        coordinatorNames = Html.fromHtml("Aditya Pokharna<br>Aastha Gambhir<br>Arpit Somani<br>Akansha Sharma");
        details = Html.fromHtml("<b>Details</b><p>" +

                "Hip Hop International is an organization based in Los Angeles , founder of Randy Jackson presents AMERICAS BEST DANCE CREW telecast in MTV. We have an international network reach of more than 170 countries. Other events that we produce includes the World Hip Hop Dance Championship, the World Battles and Urban Moves Dance Workshops.<br>" +
                "<br>" +
                "The Indian Hip Hop Dance Championship, the National Qualifiers for the World Hip Hop dance Championship,started off in 2012, has been going on for the past 4 years. We select the best dancers from across 20 Regional Audition in India and bring them to Mumbai to compete and win the title in order to represent India at the World Hip Hop Dance Championship.<br></p>"+
        "<b>Prize: </b><p>Participants selected by the judges get direct entry to the national auditions to be held in MAY 2015 in Mumbai INDIA.</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "There will only be 1 round and Participants can participate in three categories<br>" +
                "1. Solo                3 Min.    <a href=\"http://jecrcrenaissance.in/downloads/solo.pdf\">Download Registration Form</a><br>" +
                "2. Duet                5 Min.    <a href=\"http://jecrcrenaissance.in/downloads/duet.pdf\">Download Registration Form</a><br>" +
                "3. Group(8-14 members) 8 Min.    <a href=\"http://jecrcrenaissance.in/downloads/group.pdf\">Download Registration Form</a><br>" +
                "<br>" +
                "Participants can perform on track of their choice. The track should be submitted via pen drive, to event coordinators latest by 10:00 a.m. on 20th march, 2015.<br>" +
                "<br>" +
                "Tracks must not contain obscene and offensive language.</p>");
        registration = Html.fromHtml("<p>-</p>");


        phn1 = "9602731139";
        coordinator1Name = "Aditya Pokharna";
        coordinator2Name = "Arpit Somani";
        phn2 = "9413870487";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
