package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class Embryo extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Conference Hall(A Block)<br>19th March 2015<br>9:30 AM - 12:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Setu Bhatnagar\n" +
                "Akshay Baura\n" +
                "Astha Sharma\n" +
                "Bhumika Marolia");
        details = Html.fromHtml("<b>Details</b><p>Embryo- A National level paper presentation competition dwells in the depth of scientific researches and discoveries and works as a displayer of one’s presentation skills.<br>" +
                " So, brush up your skills, gather your research and get ready for Embryo-15</p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹ + 2 MTS HomeSpot Wi-Fi</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "1. First stage involves submitting an abstract of about 500 words at this <a href=\"https://www.bit.ly/r15embryo\">URL</a>\n" +
                "2. Entries shortlisted will be called to present their papers in Renaissance-15 at JECRC Jaipur campus.<br>" +
                "3. Maximum 2 students per team are allowed to present a paper.<br>" +
                "4. In case of team participation, both the members are required to be present at the time of the event.<br>" +
                "5. The decision of the judges will be final and binding.<br>" +
                "<br>" +
                "Guidelines:- Presentations should be in .ppt or .pdf format .<br>" +
                "For the presentations, a LCD projector, a computer , a mike and speakers will be provided.<br>" +
                "The time for one presentation will be 6-8 minutes.<br>" +
                "One buzzer will be rung after 6 minutes to remind the participants about the time and final buzzer will be rung after 8 minutes.<br>" +
                "Any extension in the allotted time will result in the loss of points.<br>" +
                "No request regarding change in schedule and date of paper presentation will be entertained under any circumstances.<br>" +
                "The papers will be judged on the basis of their innovation, in depth knowledge of the field and presentation skills.<br></p>");

        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "9509652553";
        coordinator1Name = "Setu Bhatnagar";
        coordinator2Name = "Akshay Baura";
        phn2 = "9530464127";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
