package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class NukkadNatak extends EndeavourEvent {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>21th March 2015<br>9:15 AM-11:45 AM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Alpesh\nBhavit\nMilan");
        details = Html.fromHtml("<b>Details</b><p>The idea of a \"Nukkad Natak\" is to propagate social and political messages in a humorous and sarcastic manner.<br>" +
                "Come up and show your dramatics skills </p>" +
                "<b>1st Prize:</b>" + "<p>7,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>3,500₹</p>");
        rules = Html.fromHtml("<b>Rules<br></b>" +
                "1. Street plays can be in Hindi or English.<br>" +
                "2. Time limit: 12 minutes. Marks will be deducted for exceeding the time limit.<br>" +
                "3. Usage of abusive language is strictly prohibited and may lead to disqualification.<br>" +
                "4.  Judges' collective decision will be final and binding.<br>" +
                "5. Use of any sort of hazardous element/prop is strictly prohibited.<br>" +
                "6. Performance should be confined within the Nukkad area, as defined by the organizers<br>" +
                "7. No technical support will be provided.<br>" +
                "8. No props are allowed. Teams can use banners and posters. <br>" +
                "9. Teams are allowed to use musical props as Dholak, Flute or any other music instrument of their choice, but usage of mikes, lights, or other electrical instruments is not allowed.<br>" +
                "<br>" +
                "10. Last date for the entries of the respective event is 8th march 2015.Failing sufficient no.of entries , event will be cancelled and you will be notified about the same. <br>" +
                "<p><b>Judging Criteria : </b><br>" +
                "<br>" +
                "    Creativity - 10 Marks<br>" +
                "    Humor - 10 Marks<br>" +
                "    Clarity of Message - 10 Marks<br>" +
                "    Script-10 marks<br>" +
                "    Team Work - 10 Mark<br>" +
                "<br>" +
                "Total - 50 Marks</p>" +
                "<p><b>Team Details :</b><br>" +
                        "<br>"+
                "Two entries per college. <br>" +
                "Team size: Maximum of 15 members including those handling music and minimum 5 members.<br>" +
                "No professional assistance is permitted, all team members should be certified students of the institute. Please bring along your identity cards.</p>"+
        "<p></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>1,500₹ Per Team</p>");


        phn1 = "9594949507";
        coordinator1Name = "Alpesh";
        coordinator2Name = "Bhavit";
        phn2 = "9782400010";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }}
