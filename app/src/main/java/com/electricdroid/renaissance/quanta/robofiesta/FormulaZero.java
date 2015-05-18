package com.electricdroid.renaissance.quanta.robofiesta;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class FormulaZero extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>20th March 2015<br>10:30 AM - 2:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Akash Bishwas\nAshish Sharma\nVishnu Singh\nArun Kumar");
        details = Html.fromHtml("<b>Details</b><p>"
                 +
                "This competition is about balancing , challengers have to balance speed and control together. It will be face of challenge between bots.<br>" +

                "Task:<br>" +

                "1. Teams must build a manually controlled machine which can run on the track provided with minimum time.<br>" +

                "2. The bot can be wired or wireless. In case the participants use wireless mechanism, they must use dual frequency remote.<br></p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "Bot Specifications:<br>" +
                "1. The dimensions of the bot should be less than or equal to 300 mm X 300 mm X 300 mm ,failing which the team will be disqualified from the competition. The bot should be controlled manually. Teams can use both wired as well as wireless control mechanisms. In case of wired bots, the length of wire should be minimum 2 meters so that the wire remains slack at any instant of time. If the participants use wireless mechanism then it is mandatory to use a dual frequency remote.<br>" +
                "2. The dimensions of the remote are not included in the size constraint of the bot. Bot can have an on-board or off-board power supply. Irrespective of the mechanism used, only one person will be allowed to control the bot.<br>" +
                "Power Supply: The participants can use an on-board or off-board electric power supply. However the power source must be non-polluting and must satisfy the safety constraints determined by the organizers.The voltage between any two points should be less than or equal to 24V DC at all times during the run.<br>" +
                "Arena specifications: <a href=\"http://www.jecrcrenaissance.in/downloads/fzero.pdf\">Download here</a><br>" +
                "General Rules:<br>" +
                "1. The teams must adhere with the spirit of healthy competition.<br>" +
                "2. The time measured by the organizers will be final and will be used for scoring the teams. Time measured by any contestant by any means will not be accepted for scoring. Any team that is not ready at the specified time will be disqualified from the competition automatically. In case of any disputes/discrepancies, the organizers' decision will be final and binding.<br>" +
                "3. Organizers reserve the right to disqualify any team indulging in misbehavior or violating any rules. The organizers reserve the rights to change any or all of the above rules as they deem fit. Change in rules, if any will be announced before the game play.<br>" +
                "4. Note that at any point of time, the latest information will be that which is given on the day of event. The information provided in the PDF downloaded earlier may not be the latest. However, registered participants will be informed before the game play.<br>" +
                "Team Specification: A team may consist of a maximum of 4 members. Students from different educational institutes can form a team.<br>" +
                "Eligibility : All students with a valid identity card of their respective educational institutes are eligible to participate in the event.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>400₹ Per Team</p>");


        phn1 = "9529625946";
        coordinator1Name = "Akash Biswas";
        coordinator2Name = "Ashish Sharma";
        phn2 = "8233094519";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
