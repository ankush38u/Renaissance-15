package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class Aero extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>C Block Reception<br>19th March 2015<br>9:30 AM - 1:00 PM </p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Rohit Kapoor\n" +

                "Aacharan Jain\n" +

                "Mahesh Gupta\n" +

                "Kamlesh Kumawat ");
        details = Html.fromHtml("<b>Details</b><p>The event explores one’s passion to fly and age long desire to conquer the skies. The event here gives its participants a chance to achieve both.</p>" +
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>Maximum 2 Participants allowed in a team.<br>" +
                "<br>" +
                "Round 1 : (Paper Wings)<br>" +
                "Time limit for this round = 15 min + 15 min<br>" +
                "Participants are allowed to build 2 paper airplanes. The airplane should be designed to fly<br>" +
                "as far as possible and also try to remain in the air for a longer duration.<br>" +
                "<br>" +
                "Instructions :<br>" +
                "1. Handout 4 A4 paper sheets to each team. The students must use them, though they may choose to use one or two sheets per airplane<br>" +
                "2. Provide the optional materials for each team<br>" +
                "3. All competitors are allowed to work on their airplane for ½ hour for completion.<br>" +
                "<br>" +
                "Testing :<br>" +
                "For design category, each team throw its air paper plane while the coordinators record distances in feet and inches ( or m and cm ). All the distances are measured from the starting line to the point where the plane first touches the ground. Each team has 2 chances per airplane ( total of 4 ) to get their best distance.<br>" +
                "For time category, corresponding recording of the time is done with an accurate stopwatch. Time is measure in seconds and hundredths of a second.<br>" +
                "<br>" +
                "The team who makes the airplane that flies the farthest and for the longest time will be declared as winner. Decision of the organizers will be final.<br>" +
                "<br>" +
                "Round 2 : (Haul Down)<br>" +
                "Time limit for this round = 2 hours + 1 hour<br>" +
                "Teams will be challenged to design and build a parachute that will bring down the potato/ object to the ground as slowly as possible. The materials to be used for the parachute are given as above, will be provided on the spot.<br>" +
                "<br>" +
                "Instructions :<br>" +
                "1. The parachute may be of any size or shape, such that it will haul down slowly at the desired location.<br>" +
                "2. The materials which would be required are provided.<br>" +
                "3. The contestants will be allowed to work on their parachute for 2 hours.<br>" +
                "4. Potato/ object acting as load will be hooked up to the completed parachute with strings.<br>" +
                "<br>" +
                "Testing:<br>" +
                "The loaded parachute will be released by participants standing on the 1st floor ( or 2nd floor ).<br>" +
                "The judges will measure the time of fall with a stopwatch. Also, the distance the load fell away from the intended target would be measure using appropriate measuring tape.<br>" +
                "<br>" +
                "Winning Criteria : The team with maximum time and most proximity to the target will be declared as winners.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "8764395451";
        coordinator1Name = "Rohit Kapoor";
        coordinator2Name = "Aacharan Jain";
        phn2 = "9772243554";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
