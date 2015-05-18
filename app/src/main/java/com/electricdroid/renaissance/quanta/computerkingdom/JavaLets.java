package com.electricdroid.renaissance.quanta.computerkingdom;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class JavaLets extends QuantaEvent{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>IBM Lab<br>19th March 2015<br>1:00 PM - 3:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Himanshu Gaur\n" +
                "Gaurav Kandhari\n" +
                "Nisha Jangir\n" +
                "Astha mishra\n");
        details = Html.fromHtml("<b>Details</b><p>" +

                "A technical programming event involving concepts of Core JAVA only. The event will consist of 2 rounds. Rounds description is as follows:<br>" +
                "<br>" +
                "Round 1: Multiple choice questions(on desktop application)<br>" +
                "<br>" +
                "40 MCQs with a time limit of 50 minutes.<br>" +
                "<br>" +
                "Round 2: Code if you can (Tests of programming)<br>" +
                "<br>" +
                "2 Problems per team with a time limit of 60 minutes.<br></p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "1. One Computer would be provided to each team.<br>" +
                "<br>" +
                "2. Maximum 2 members per team.<br>" +
                "<br>" +
                "3. Only notepad and command prompt are allowed to open on it.<br>" +
                "<br>" +
                "4. TOP 10 participants will be promoted to Second round on the basis of First round.<br>" +
                "<br>" +
                "5. The team who will complete the given tasks in lesser duration with more accuracy will be awarded as winner.<br>" +
                "<br>" +
                "6. Programs will be verified by judges and their jurisdiction will be final.<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "9602370575";
        coordinator1Name = "Himanshu Gaur";
        coordinator2Name = "Gaurav Kandhari";
        phn2 = "9602416617";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
