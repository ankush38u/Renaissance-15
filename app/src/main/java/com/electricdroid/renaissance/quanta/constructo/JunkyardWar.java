package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class JunkyardWar extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>BH 2 Lawns<br>19th March 2015<br>9:30 AM - 12:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Nitish Pandey\n" +
                "Zeeshan Ali\n" +
                "Naresh Yadav\n" +
                "Vishal Sharma\n" +
                "Ghanshyam Kumawat");
        details = Html.fromHtml("<b>Details</b><p>Put your creativity to test and produce something highly innovative out of it.<br>" +
                " The 'Junk Yard Wars' will challenge the participants to create products like hovercrafts, cross-bows and remote controlled cars or something creative  from petty materials like, pencil buds, broken toys and ice-cream. So are you ready to take on the challenge......??<br>" +
                "<br>" +
                "<b>Team Specifications :</b><br>" +
                "<br>" +
                "1. A team may consist of a maximum of 3 members.<br>" +
                "2. Each and every participant team should have a valid ID card.<br>" +
                "3. Each team must declare a name for their object at the time of competition.<br></p>"+
                "<b>SCORING :</b><p>" +
                "1. Scoring will be done upon the creativity of team and how perfectly they will achieve their task.<br>"+
                "2. In case of a tie one who has scored more points will be given preference over other(s).<br>" +
                "Final decision in any case shall rest with the judge.</p>"+
                "<b>1st Prize:</b>" + "<p>3,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "1. The teams must adhere to the spirit of healthy competition. The teams must not damage the opponent's machine in any way. Judges reserve the right to disqualify any team indulging in misbehaviour.<br>" +
                "2. The organizers reserve all rights to change any or all of the above rules as they deem fit.<br>" +
                "3. Point description will be disclosed on the spot before commencement of event.<br>" +
                "<br>" +
                "<u>Change in rules, if any, will be highlighted on the website and notified to the registered teams.</u><br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹ Per Team</p>");


        phn1 = "8824881815";
        coordinator1Name = "Nitish Pandey";
        coordinator2Name = "Vishal Sharma";
        phn2 = "9602535451";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
