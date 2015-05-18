package com.electricdroid.renaissance.quanta.computerkingdom;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class JustC extends QuantaEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>IBM Lab<br>19th March 2015<br>9:30 AM - 11:30 AM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Abhimanyu Singh Tanwar\nAman Sharma\nAnkit Soni\nDeepak Kumar Paliwal");
        details = Html.fromHtml("<b>Details</b><p>JUST C is an event based on C programming language.<br>" +
                " Questions of error output and C programs will be its ingredients.<br>" +
                " Participants are required to be in a team of 2 members. Two rounds of the event will be conducted.</p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "<b>Online Round</b><p>There is a online Round in which we will be asking a question each day and certain no. of teams or individuals answering questions correctly " +
                "in a time duration will be getting a sort of wild card entry directly in the second Round.</p>"+
                "Round 1:<br>" +
                "In this task each team have to solve MCQ’s. Time duration is of 45 minutes. For each correct answer 2 points will be awarded and negative 1 point for each incorrect answer. However no marks will be deducted for not attempting the question. Qualified teams will be eligible for next round.<br>" +
                "<br>" +
                "Round 2:<br>" +
                "Teams are required to code C programs on provided computer system within given time duration.Team completing task in minimum time will be awarded.<br>" +
                "Decision of judges will be final.<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "9529913551";
        coordinator1Name = "Abhimanyu";
        coordinator2Name = "Aman Sharma";
        phn2 = "9461011411";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
