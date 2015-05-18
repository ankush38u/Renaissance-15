package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class Dexterity extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>C Block Lawns<br>18th March 2015<br>11:30 AM-2:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Jitendra Gupta\n" +
                "Harshit Khandelwal\n" +
                "Siddharth Kumar\n" +
                "Aaditya Ambar");
        details = Html.fromHtml("<b>Details</b><p>Problem statement:- Design a bridge model having dimensions given below.<br>" +
                "Materials will be provided on the spot.<br>" +
                "Dimensions:- -Length (span): 50 cm.<br>" +
                "Clearance:-10 cm on each side -Width: 10 cm.<br>" +
                "There should not be any variations in the dimensions of the bridge. Limiting to an error of 1 cm in width and 2 cm in length.</p>"+
                "<b>1st Prize:</b>" + "<p>3,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>Dexterity is a technical event comprising of 2 rounds. Participants can come in a team of 3 members, participants from different institution can form a team.<br>" +
                "<br>" +
                "Round 1 :- This round will contain multiple choice questions related to bridges. Time limit will be 15 minutes. There will be elimination on the basis of marks obtained.<br>" +
                "<br>" +
                "Round 2 :- Bridge Model Designing<br>" +
                "Design a bridge model using 200 Popsicle sticks and adhesive which will be provided on the spot. It is not compulsory to use all the sticks. Use of material other than given is not permitted.<br>" +
                "<br>" +
                "Judging Criteria:-<br>" +
                "Shape: Structure could be of absolutely any shape satisfying the above constraints.<br>" +
                "Once the structure is weighed, you are not allowed to modify your structure in any way.<br>" +
                "If the structure fails to satisfy any of the above constraints then it will be summarily rejected.<br>" +
                "Any structure that is not ready within the time limit will be disqualified immediately.<br>" +
                "Judges’ decision shall be final and binding to all.<br>" +
                "The organizers reserve all rights to change any or all of the above rules at any point of the event.<br>" +
                "<br>" +
                "Winning Criteria:-<br>" +
                "The lightest bridge (that meets the given constraints & dimensions) supporting maximum weight at centre will be declared as the winner.<br>" +
                "<br>" +
                "Efficiency ratio = Load taken / weight of the bridge</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹ Per Team</p>");


        phn1 = "9782997229";
        coordinator1Name = "Jitendra Gupta";
        coordinator2Name = "Harshit Khandelwal";
        phn2 = "9782232250";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
