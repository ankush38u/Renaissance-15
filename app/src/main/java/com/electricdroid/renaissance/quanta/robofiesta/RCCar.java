package com.electricdroid.renaissance.quanta.robofiesta;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class RCCar extends QuantaEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Comoing Soon</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Coming Soon");
        details = Html.fromHtml("<b>Details</b><p>Direction is more important than speed. We are so busy looking at our speedometers that we forget the milestone.<br>" +
                " A bot is to be designed that can cross all the hurdles in the way to its victory. <br>" +
                "The only way to victory is “cross all the hurdles in minimum time”.</p>"+
                "<b>1st Prize:</b>" + "<p>12,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>6,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p><b>Bot Specification:</b><br>" +
                "1. The machine must fit into a box of size 30 x 30 (l x b ).(height no bar)Weight should not be more than 3kg.The motor used in machine should be maximum of 500rpm.<br>" +
                "2. The external wired/wireless remote control used to control the machine manually is not included in this size constraint.<br>" +
                "3. Machine cannot be constructed using readymade Lego kits or any readymade mechanism. Violating this clause will lead to the disqualification of the machine.<br></p>"+
        "<b>Arena Description: </b><p>The path will consist of a number of hurdles such as mud ,hurdles, grass, pebbles , marbles , slope , oily surface and many other....<br>" +
                "The challenge will be to complete the given task in minimum amount of time.<br>" +
                "Note: Track will be uploaded soon.<br>" +
                "<br>" +
                "Power supply and Control mechanism:<br>" +
                "The machine can use an externally placed or on-board electric or non-electric power supply.<br>" +
                "In case of an electric power supply, the voltage at any point on the machine must be lower than or equal to 24V at any point of time during the game.<br>" +
                "The organizers will provide a standard single phase, 230V, 50 Hz AC power supply. Any extension cords, eliminators, adaptors etc required will have to be arranged by participants themselves.<br>" +
                "The machine has to be necessarily controlled by some wired/ wireless remote control mechanism at all stages of the game.<br>" +
                "In case of wireless mechanism, to avoid frequency interference between the competing machines, each machine must have two remote control circuits (or a dual frequency remote control circuit) which can be switched to either frequency before the start of the game.<br>" +
                "In case of wired mechanism, the wire must be slack for the duration of the game. The total length of wire extending from the remote control to the machine must be a minimum of 5 meters.</p>"+
        "<b>General Rules: </b><p><br>" +
                "1. The teams must adhere to the spirit of healthy competition. The teams must not damage the opponent's machine in any way. Judges reserve the right to disqualify any team indulging in misbehavior.<br>" +
                "2. The organizers reserve all rights to change any or all of the above rules as they deem fit.<br>" +
                "3. No extra points will be awarded for the wireless mechanism.<br>" +
                "4. The track will contain certain number of check-points and if the bot goes out of the track then it has to start with the previous check-point.<br>" +
                "5. The judges hold the right to subjectively determine if the machine violates any clause.<br>" +
                "6. Point description will be disclosed on the spot before commencement of event.<br>" +
                "7. Change in rules, if any, will be highlighted on the website and notified to the registered teams.<br></p>"+
        "<b>Team Specifications: </b><p>A team may consist of a maximum of 4 members.<br>" +
                "Each and every participant team should have a valid ID card.<br>" +
                "Each team must declare a name for their machine at the time of competition.<br>" +
                "<br>" +
                "Scoring : Participant completing task in min. time will be declared winner. In case of a tie one who has scored more points will be given preference over other(s).<br>" +
                "Final decision in any case shall rest with the judge.<br>" +
                "<br>" +
                "Note :- Last date for registration of respective events will be 8th March 2015. Failing the number of sufficient entries, the event will be cancelled.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>1500₹ Per Team</p>");


        phn1 = "9999999999";
        coordinator1Name = "X";
        coordinator2Name = "X";
        phn2 = "9999999999";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }

}
