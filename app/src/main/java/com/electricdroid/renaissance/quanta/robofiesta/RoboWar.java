package com.electricdroid.renaissance.quanta.robofiesta;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class RoboWar extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>19th March 2015<br>11:30 AM - 3:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Prasant Sharma\nJatin Kumar\nNeha Parkya\nAkash Atal\nPrateek Ranjan");
        details = Html.fromHtml("<b>Details</b><p>Robowar is a combat robotics championship, where two custom-build machines use varied methods of destroying or immobilising the other.<br>" +
                " Robowar promises to be an ultimate battlefield where the bots fight for life and the survival is the only victory.<br>" +
                " Build the fiercest, meanest, toughest and strongest bot to pave your way through the arena and defeat the opponent in this one-on-one combat.</p>");
        rules = Html.fromHtml("<b>Rules</b><p>The teams need to register in the group of 6(six).<br>" +
                "The maximum duration of each round will be 5 minutes. Any team that is not ready at the time specified will be disqualified. The name of your machine must be prominently displayed on the machine.<br>" +
                "<br>" +
                "Immobility (if robot is unable to travel at least 10 cm for 15 seconds) would lead to disqualification.<br>" +
                "The organizers reserve the rights to change any or all of the above rules as they deem fit. Change in rules, if any will be highlighted on the website and notified to the registered teams.<br>" +
                "Violation of any of the above rules will lead to disqualification.</p>"+
        "<p><b>Safety/Warning Rules: </b><br>" +
                "1. Weapons attached to the robot, if found unfit for the competition would be straightway disqualified (unfit refers to the potentially harmful thing for the persons in the vicinity of arena or to the arena).Though safe and innovative kind of mechanism is always invited and appreciated.<br>" +
                "2. Each robot will have safety inspection before each match failing it lead to the disqualifications; all teams are instructed to disclose all weaponry and mechanisms to the safety team.<br>" +
                "3. All weapons, especially sharp edges should be properly covered so as not to harm anyone while carrying it or testing it.<br>" +
                "4. Contestants are instructed not to test their robots outside the playing arena.<br>" +
                "5. No part of the robot should be detached from the robot at any instance during the course of game.<br>" +
                "6. Owners are solely responsible for their robot whether or not it complies with the rules of RoboWARS.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>700₹ Per Team</p>");


        phn1 = "9509605993";
        coordinator1Name = "Prasant Sharma";
        coordinator2Name = "Jatin Kumar";
        phn2 = "9694000834";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
