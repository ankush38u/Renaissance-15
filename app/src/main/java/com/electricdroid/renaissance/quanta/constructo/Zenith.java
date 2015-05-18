package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class Zenith extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>C Block Lawns<br>20th March 2015<br>9:30 AM - 12:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Shubham Agarwal\n" +
                "Shubham Gupta\n" +
                "Amarjeet Kumar\n" +
                "Jitendra Tak");
        details = Html.fromHtml("<b>Details</b><p>The event here explores the creativity and understandings of structures. <br>" +
                "In this event the participants have to construct a structure with a roof and floors standing more or less permanently in one place from provided props. </p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. The team must not comprise of more than 3 persons.<br>" +
                "2. The use of props other than provided is prohibited.<br>" +
                "3. Use of supports is however allowed.<br>" +
                "4. The winner will be decide on the basis of maximum height, maximum efficiency and material use.<br>" +
                "5. Cardboard, Newspaper, Fevicol, & Cutter will be provided to each team.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "7790993233";
        coordinator1Name = "Shubham Agarwal";
        coordinator2Name = "Amarjeet Kumar";
        phn2 = "8559937633";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
