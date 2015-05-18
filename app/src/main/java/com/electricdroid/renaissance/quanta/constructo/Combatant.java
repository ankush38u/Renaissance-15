package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class Combatant  extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Communication Lab, LT-7<br>18th March 2015<br>12:30 PM -2:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Sunil Kumawat\n" +
                "Archit Sharma\n" +
                "Kajal Gupta\n" +
                "Vaishali Jain\n" +
                "Kritika Jaroli");
        details = Html.fromHtml("<b>Details</b><p>The event here provides the participants to design a circuit of their own which is calibrated at a particular efficiency.<br>" +
                " The participants will be provided some basic electric and electronics instruments using which the circuit has to be deigned. <br>" +
                "The event here requires a person’s ability to think on his feet and creativity.</p>"+
                "<b>1st Prize:</b>" + "<p>3,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,800₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "1. Combatant is a technical event comprising of 3 rounds.<br>" +
                "2. No. of team members 2-3.<br>" +
                "3. Each team should report 30 minutes before the scheduled time.<br>" +
                "4. First round will be objective type quiz on the fundamentals of electrical and electronics and aptitude.<br>" +
                "5. After the round-1 all team go to round-2 and in round-2 the participants will try to perform hardware implementation of circuit design problem which will be from basic electrical and electronics .That will be given on the spot.<br>" +
                "6. In the final and third round the teams will have to explain the working of the given circuit design.<br>" +
                "7. Winner will be judged on the basis of accuracy of the result and presentation of the circuit design.<br>+" +
                "8. Decision of judges and the conducting authority will be final.<br>" +
                "9. Registration for the event will close 1 hours before the event.<br>" +
                "10. The organizers reserve all rights to change any or all of the above rules as they deem fit. Change in rules, if any will be highlighted on the website.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹ Per Team</p>");


        phn1 = "7665363047";
        coordinator1Name = "Sunil Kumawat";
        coordinator2Name = "Archit Sharma";
        phn2 = "8769412595";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
