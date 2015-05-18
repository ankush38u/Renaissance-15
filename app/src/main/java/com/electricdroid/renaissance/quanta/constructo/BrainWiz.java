package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class BrainWiz  extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>LT 7, LT 8<br>20th March 2015<br>1:00 PM -3:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Devesh Singh\n" +
                "Saket Kishore\n" +
                "Sanjeet Kumar\n" +
                "Dheeraj barnwal");
        details = Html.fromHtml("<b>Details</b><p>Brainwiz squeez the every drop of potential that a person has in his cerebellum. <br>" +
                "The students will have to answer first to a rapid-fire round. Then the next round involves a buzzer round. <br>" +
                "The question will completely based on IQ.</p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "Each Team must comprise of 3 members.<br>" +
                "<br>" +
                "1st Round:-<br>" +
                "IQ based paper of 35 to 40 questions.<br>" +
                "It's an elimination round<br>" +
                "Time duration=30 mins<br>" +
                "<br>" +
                "2nd Round:-<br>" +
                "This round is divided in two parts.<br>" +
                "(A) Rapid fire of 5 min for each team individually. One question for each team(visual round).<br>" +
                "Time duration=30 mins.<br>" +
                "(B) Buzzer Round(Tie breaker round).<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "9694506914";
        coordinator1Name = "Devesh Singh";
        coordinator2Name = "Saket Kishore";
        phn2 = "9785230992";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
