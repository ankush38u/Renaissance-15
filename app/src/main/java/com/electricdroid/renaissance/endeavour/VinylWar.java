package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class VinylWar extends EndeavourEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Central Lawn<br>20th March 2015<br>7:15 PM - 9:45 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Pawan Kataria\nAnkita Sharma\nArvind Bhat");
        details = Html.fromHtml("<b>Details</b><p>Vinyl War Renaissance 15 is a DJ-ing Competition which provides a platform to best DJs around the country to show up their mixing skills.<br>" +
                " It is a 3 hour non-stop war of DJs with attractive prize money and many more.<br>" +
                " The event hosts about 5000+ pumped crowd with an awesome ambiance, best sound system and lighting.</p>"+
                "<b>1st Prize:</b>" + "<p>9,000₹ + A MTS HomeSpot Wi-Fi Dongle</p>" +
                "<b>2nd Prize:</b>" + "<p>4,500₹ + A MTS HomeSpot Wi-Fi Dongle</p>");
        rules = Html.fromHtml("<b>Rules</b><p><b>General Rules :</b><br>" +
                "1. Decision of the Judges will be final and no correspondence in this regard will be entertained.<br>" +
                "2. Participants shall not use hazardous/dangerous material as part of their act without checking with the management.<br>" +
                "3. Non Compliance of any of the contest rules & regulation shall immediately disqualify the participants.<br>" +
                "4. Management will not be responsible & liable for any damages/losses due to untoward incidences during the contest.<br>" +
                "5. Any sort of vulgarity would not be tolerated and would lead to immediate disqualification.<br>" +
                "6. Entry is open for all.<br>" +
                "7. Duet performances are also allowed.<br>" +
                "8. All the participants coming from outside Jaipur will be provided accommodation (if needed) and travelling allowance as per the travelling agreement of the college<br></p>"+
        "<p><b>Technical Rules : </b><br>" +
                "1. Each contesting DJ will be given 12 + 3 minutes of play time.<br>" +
                "2. Each contestant is required to bring his laptops (in case he/she does not want to use the console) with pre-loaded software (Virtual DJ etc.).<br>" +
                "   Any contestant using pre loaded play lists (on laptops) would be disqualified immediately.<br>" +
                "3.  Judges will award points to the participant on the following factors of originality:<br>" +
                "a. Looping Live<br>" +
                "b. Running Mixes<br>" +
                "c. Equalization and balance of sound output<br>" +
                "d. Selection of tracks.<br>" +
                "e. Live remixes<br>" +
                "f. Crowd interaction<br>" +
                "g. Rapping<br>" +
                "h. Body language<br>" +
                "i. Attitude<br>" +
                "4. DJ’s Using turn tables need to carry their own cartridges.<br>" +
                "5. Any contestant using pre loaded play lists (on laptops) would be disqualified immediately.<br>" +
                "6. Any Participant playing only CD's should change a minimum of 4CD's/ Songs during his set in the given time.<br>" +
                "7. Any DJ using less than 4 CDs will be disqualified (In case of using CDs)<br>" +
                "8. Participants will not be allowed to use PREMIXED Mixes in any format in the contest.<br>" +
                "<br>" +
                "<b>Note :</b>" +
                " For any further queries or specialized requirements kindly mention it at the Time of registration. (At least 2 hours before the commencement of the event).    <br>" +
                "Last date for the entries of the respective event is 8th march 2015.Failing sufficient no. of entries , event will be cancelled and you will be notified about the same. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>900₹ per Team</p>");


        phn1 = "7737977176";
        coordinator1Name = "Pawan Kataria";
        coordinator2Name = "Arvind Bhat";
        phn2 = "8769178304";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
