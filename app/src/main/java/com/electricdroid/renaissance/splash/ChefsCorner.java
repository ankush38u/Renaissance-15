package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class ChefsCorner extends SplashEvent {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>18th March 2015<br>11:30 AM -2:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Vrinda Palodi\nVijit Nagpal\nHarshita Khandelwal\nMonika Mangal");
        details = Html.fromHtml("<b>Details</b><p>Chef’s corner, an event where students can display their culinary skills  in a cooking competition.<br>" +
                "Quoting the well acclaimed food critic  Marcel Boulestin “Cookery is not chemistry. It is an art. It requires instinct and taste rather than exact measurements.” <br>" +
                "Cooking is that spectacular art that evokes all senses at once. Ever wondered whether you could use everyday ingredients, experiment and make something magical? If yes, then come and try your culinary skills and win exciting prizes.<br>" +
                "<br>" +
                "Team Size: Solo or a team of 2<br></p>"+
                "<b>1st Prize:</b>" + "<p>500₹ + 2 MTS HomeSpot Wi-Fi</p>" +
                "<b>2nd Prize:</b>" + "<p>2 MTS HomeSpot Wi-Fi</p>");
        rules = Html.fromHtml("<b>Rules</b><b><p>Round 1: (Knowledge) : In this round, basic knowledge of cooking will be judged.<br>" +
                "<br>" +
                "Round 2:(Creativity) : This round is for judging the creativity in decoration of the salads. Basic ingredients will be provided.<br>" +
                "<br>" +
                "Round 3:(Innovation) : This round i s for judging the innovative idea in dish making. Basic ingredients will be provided.<br>" +
                "<br>" +
                "General Instructions:<br>" +

                "1) Decision of judges will be final and abiding.<br>" +

                "2) Cleanliness must be taken care of.<br>" +

                "3) A team can have 2 members at most.<br>" +

                "4) Basic ingredients will be provided.<br>" +

                "5) Participants are not allowed to bring any ingredients on their own.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>150₹</p>");


        phn1 = "789157008";
        coordinator1Name = "Vrinda Palodi";
        coordinator2Name = "Vijit Nagpal";
        phn2 = "9549222222";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }

}
