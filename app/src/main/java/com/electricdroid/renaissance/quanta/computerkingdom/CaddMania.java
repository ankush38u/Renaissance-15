package com.electricdroid.renaissance.quanta.computerkingdom;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class CaddMania extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Cadd Lab<br>18th March 2015<br>2:00 PM - 4:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Aviral Jhakad\n" +
                "Divyanshu Chourasia\n" +
                "Amit Kumar Gupta\n" +
                "Ajay Singh Pal");
        details = Html.fromHtml("<b>Details</b><p>The event tests the dexterity of the participants in AutoCAD</p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>The event will be conducted in two stages.<br>" +
                "<br>Stage I:<br>" +
                "It is divided into two parts:<br>" +
                "Quiz (15 question/15 marks/10 min.)<br>" +
                "2D-drawing (1 drawing/25 marks/30 min.)<br>" +
                "<br>" +
                "Stage II:<br>" +
                "The student who qualifies 1st stage will only move to the second stage. Contestants will be given a 3D drawing and its all three views (F.V., T.V., S.V.) would have to be drawn with dimensions in 90 min. (60 marks). Final result will be declared on the basis of both stages.<br>" +
                "Evaluation Criteria will be based on Time & Accuracy.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>150₹ Per Team</p>");


        phn1 = "9782938400";
        coordinator1Name = "Aviral Jhakad";
        coordinator2Name = "Divyanshu Chourasia";
        phn2 = "9667824703";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
