package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class RagaNight extends EndeavourEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Raga Night Prelims<br>LT-8<br>18th March 2015<br>9:30 AM-11:30 AM<br><br>Raga Night<br>Central Lawn<br>18th March 2015<br>4:30 PM-6:30PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Chetna\nRajat Jain\nTanu Verma\nDeepak Tolani");
        details = Html.fromHtml("<b>Details</b><p>Everyone was singing,the house was alive and singing and the very air was SONG!<br>" +
                "So take your inner singer out,leap and be a part of what \"RAGA NIGHT\" has to offer.<br>" +
                "It is a solo/duet singing competition. So grab the opportunity and showcase your singing talent!</p>"+
                "<b>1st Prize:</b>" + "<p>6,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>3,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>The event comprises Eliminations followed by Finals.</p>"+
        "<b>Eliminations: </b><p><br>" +
                        "1. The contestant will have to perform an Indian song of his/her choice in the auditions.<br>" +
                        "2. The contestants should prepare at least three different songs.<br>" +
                        "3. The contestants will also be tested on sense of scale and beat.<br>" +
                        "4. No accompanists are allowed.<br>" +
                        "5. Elims will be held on March 18 th 2015.<br>" +
                        "6. Only limited number of participants would be allowed and the criteria would be on the first come first registered basis.<br>" +
                        "7. Duets are also allowed (optional). Entry fees per person.<br>" +
                        "8. Any rendition must be a film song/album song.<br></p>"+
                "<b>Criteria for judgement : </b><p><br>" +
                        "1. Selection of song<br>" +
                        "2. Co-ordination with music<br>" +
                        "3. Overall impact<br>" +
                        "4. Quality of Singing<br></p>"+
                "<b>Finals : </b><p><br>" +
                        "1. A song bank will be made available to the finalists after the elimination round.<br>" +
                        "2. All songs in this stage must be from the song bank.<br>" +
                        "3. Live orchestration will be provided.<br></p>"+
                        "<b>Note : </b><p><br>" +
                        "1. Participants must carry an iPod or MP3 player.<br>" +
                        "2. Decision of the judges in all matters will be final and binding.<br>" +
                        "3. Last date for the entries of the respective event is 8th march 2015.Failing sufficient no.of entries , event will be cancelled and you will be notified about the same.<br>" +
                        "4. Participants must carry their ID cards.<br></p>"
        );
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹ Per Team</p>");


        phn1 = "9509157558";
        coordinator1Name = "Rajat Jain";
        coordinator2Name = "Deepak Totlani";
        phn2 = "7737409979";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
