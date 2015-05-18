package com.electricdroid.renaissance.quanta.computerkingdom;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class Subito extends QuantaEvent {
// subito changed to algoholic
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Algoholic");
        venue = Html.fromHtml("<b>Venue</b><p>IBM Lab<br>18th March 2015<br>11:30 AM -3:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Prakash\n"+
                "Shailesh Choyal\n" +
                "Tarun Khariwal\n" +
                "Rishabh Jindal\n" +
                "Tushar Gupta");
        details = Html.fromHtml("<b>Details</b><p>" +
                "Event Type: Algorithm based online competitive programming<br>" +
                "<br>" +
                "It is a two-participant algorithmic programming based event that requires the participant to solve simple problems using programming in any language. The event will we conducted on HackerRank.<br>" +
                "<br>" +
                "For more information and updates visit : our Facebook page<br></p>"+
                "<b>1st Prize:</b>" + "<p>3,000 + 2 MTS HomeSpot Wi-Fi</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹ + 2 MTS HomeSpot Wi-Fi</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" + ""  +
                "Timeline: The contest will consist of a single round of 2 hours<br>" +
                "<br>" +
                "Registration Deadline: Closes 1 hour before the event<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>300₹ Per Team</p>");


        phn1 = "7791073009";
        coordinator1Name = "Tarun Khariwal";
        coordinator2Name = "Rishabh Jindal";
        phn2 = "7568197585";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
