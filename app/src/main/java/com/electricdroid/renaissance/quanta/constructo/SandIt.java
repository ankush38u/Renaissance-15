package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class SandIt extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Badminton Court<br>19th March 2015<br>1:00 PM - 3:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Anupam Gangwal\n" +
                "Rakesh Kumar Gupta\n" +
                "Kumar Sambhav\n" +
                "Vividha Verma \n" +
                "Suman Choubisa");
        details = Html.fromHtml("<b>Details</b><p>Explore the love of playing with sand, hidden in every individual.</p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +

                "1. Maximum of three members can participate in a team.<br>" +
                "2. The event consists of two rounds(Qualifying and final).<br>" +
                "2. In qualifying round, teams have to design any shape within 20 minutes.<br>" +
                "4. Elimination will be done on the basis of height of that shape.<br>" +
                "5. In final round, Props and shape will be given to the teams according to lottery system.<br>" +
                "6. Marks will be awarded by the Judges.<br>" +
                "7. The decision of the Judges will be considered as final and no further challenges will be entertained.<br>" +
                "8. TIME LIMIT - 20 minutes(In Qualifying Round) ; 60 minutes(In Final Round)</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹ Per Team</p>");


        phn1 = "9462066891";
        coordinator1Name = "Anupam Gangwal";
        coordinator2Name = "Rakesh Kumar Gupta";
        phn2 = "9166040212";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
