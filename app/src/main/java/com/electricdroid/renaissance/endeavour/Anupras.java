package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class Anupras extends EndeavourEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Auditorium<br>21th March 2015<br>12:00 PM - 2:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Sawan Nirala\n" +
                "Somendra Singh\n" +
                "Gopal Jha\n" +
                "Aman Goyal");
        details = Html.fromHtml("<b>Details</b><p>" +
                "“Words of a poem are mightier than a sword”<br>" +

                "ANUPRAS kavi sammelan,gives you a platform to showcase your expertise & proficiency in poetry.</p>" +
                "<b>1st Prize:</b>" + "<p>3,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "1. Individual entries will be allowed.<br>" +

                "2. Maximum of 5 min will be given to each candidate. Negative marking will bedone if one exceeds the mentioned time limit.<br>" +

                "3. Self composed and original poems will be given preference.<br>" +

                "4 .The poem should not contain any vulgarity or obscenity, if found the participant will be immediately disqualified.<br>" +

                "5.  The decision made by the judges will be final.<br>" +

                "6.  The poems based on current issues, engineering life, quoted with fun, satire and message will be given preference.<br>" +

                "7. Last date for the entries of the respective event is 8th march 2015.Failing sufficient no. of entries , event will be cancelled and you will be notified about the same. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "7688852767";
        coordinator1Name = "Gopal Jha";
        coordinator2Name = "Aman Goyal";
        phn2 = "8107570912";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
