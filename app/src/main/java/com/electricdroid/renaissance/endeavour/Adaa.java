package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class Adaa extends EndeavourEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Central Lawn<br>18th March 2015<br>6:45 PM-9:45 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Gauri Jain\nHarshita Singhal\nAshish Bansal\nChavi Mishra\nPriyanka Agarwal\n");
        details = Html.fromHtml("<b>Details</b><p>"+"Everyday is a fashion show, and the world is your runway<br>"+"Chanel Step into the world of FASHION. This is your moment into spotlight, strut down the ramp and strike up a pose. Let those cameras click and flick to capture you in the perfect combination of creativity, flamboyance and attitude. <br>" +
                "Fashion is a statement, not a style... <br>" +
                "So go on, make it Your Dream Rundown..</p>"+
                "<b>1st Prize:</b>" + "<p>11,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>5,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. Team members - Max Sixteen, Min Ten.<br>" +
                "2. Duration of performance - Min 8(Eight) Minute, Max 10(Ten) Minute.<br>" +
                "3. The ramp will be I-shaped.<br>" +
                "4. The music CD and a pen-drive (both containing the musictracks) should be submitted at the help desk by 2:00 p.m. on the day of the event.<br>" +
                "5. Changing rooms will be allotted after reporting with the team.<br>" +
                "6. No extra time will be given for the introduction. Exceeding the time limit will result in negative marking.<br>" +
                "7. Please carry your college identity cards along with you.<br>" +
                "8. Please carry one stand by CD for any emergency.<br>" +
                "9. Usage of fire on the stage is prohibited and teams doing so would be disqualified.<br>" +
                "10. Backstage helpers should not exceed 3(Three) in number.<br>" +
                "11. Contestants should not wear revealing dresses.<br>" +
                "12. Criteria for judgment:- Theme (if any), Costumes(creativity, relevance to the round), Walk, Music, Originality, Coordination, Choreography<br>" +
                "13. Each team is supposed to submit names of a pair who would represent their team for Mr. /Miss contest.<br>" +
                "14. Mr./Miss Contest may comprise of some rounds(questionnaire,task oriented,etc) which would be decided on the spot or based on judges demand.<br>" +
                "15. Last date for the entries of the respective event is 8th march 2015.Failing sufficient no.of entries , event will be cancelled and you will be notified about the same.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>1500₹ Per Team</p>");


        phn1 = "7742035710";
        coordinator1Name = "Ashish Bansal";
        coordinator2Name = "Gauri Jain";
        phn2 = "8946951220";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
