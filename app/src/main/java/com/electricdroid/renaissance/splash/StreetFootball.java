package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class StreetFootball extends SplashEvent {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>C Block Lawns<br>19th, 20th March 2015<br>9:30 AM- 3:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Abhishek Soni\nGurpreet Singh\nGaurav Juneja\nShivam Agiwal\n");
        details = Html.fromHtml("<b>Details</b><p>1 team, 1mission<br>" +
                "One team one goal, unity, splash of sacrifice, splash of regret, 6 players 1 heartbeat, Keep the dream alive, to game on…<br>" +
                "In life, As in football, you won’t go far unless you know where the goalposts re…." +
                "<br>So, LET’S PLAY FOOTBALL..<br></p>" +
                "<b>1st Prize:</b>" + "<p>4,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>2,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. 2 player substitutes <br>" +
                "2. All matches are knockout<br>" +
                "3. Outside are taken from roll ball<br>" +
                "4. Goal from inside the D are not considered<br>" +
                "5. Penalty is taken  from center of ground<br>" +
                "6. No offside rule<br>" +
                "7. No sledging or bullying is tolerated and will be subject to disqualification.<br>" +
                "8. 5 to6 players are allowed to play at a time<br>" +
                "9. Decision of the referee will be final.<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>600₹ per Team</p>");


        phn1 = "9636617555";
        coordinator1Name = "Abhishek Soni";
        coordinator2Name = "Gaurav Juneja";
        phn2 = "9460307438";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
