package com.electricdroid.renaissance.quanta.robofiesta;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class LineFollower extends QuantaEvent {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>LT-7<br>21st March 2015<br>11:30 AM - 3:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Saurabh Barthwal\nPiyush Menghani\nAkansha Jain\nAbhinav Jhanwar");
        details = Html.fromHtml("<b>Details</b><p>If the sound of an engine is your daily music and mechanics your religion, we invite you to show the extent of your passion.<br>" +
                "Let these mind blowing bots hit the track and fight out in the most diverse conditions.<br>" +
                "They must find their way through several turns while the clock ticks away.</p>");
        rules = Html.fromHtml("<b>Rules</b><p>A team may consist of a maximum of 4 members.<br>" +
                "Organizers will be not responsible for any minor scratches left by the previous bots on the arena.<br>" +
                "The bots would be checked for their safety before the run and would be discarded if found unsafe for other participants and spectators.<br>" +
                "Participants should not dismantle their robots before the completion of the whole competition as the machines might need to be verified by the judges at a later stage to ensure that the participants have not violated any of the rules.<br>" +
                "Judges' decision shall be treated as final and binding on all.<br>" +
                "The organizers reserve the right to change any or all of the above rules as they deem fit. Change in rules, if any, will be highlighted on the website and notified to the registered participants.</p>"+
        "<b>Bot Specifications : </b><p><br>" +
                "1. Each team is allowed to have only one bot.<br>" +
                "2. The bot must fit into a cube of dimensions 25cm * 25cm * 25cm.<br>" +
                "3. The bot must use only on-board power supply. No external off-board power supply is allowed.<br>" +
                "4. The max voltage difference between any two points must not exceed 12V<br>" +
                "5. The bot must be fully autonomous with all powering and motoring mechanisms self contained.<br>" +
                "6. Any manual (by switch) or wireless input is not allowed after turning on the power supply.<br>" +
                "7. Human operators are not permitted to enter any information into the bot during the event.<br></p>"+
        "<b>Arena Specifications</b><p>The competition platform has been designed with a white line on a black surface. The bot will have to move on this line. The line width will be 3.0 cm. Note: Track will be uploaded soon.<br>" +
                "<br>" +
                "Scoring : Complete task in minimum time.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>400₹ Per Team</p>");


        phn1 = "9782603361";
        coordinator1Name = "Piyush";
        coordinator2Name = "Abhinav Jhanwar";
        phn2 = "8290912683";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
