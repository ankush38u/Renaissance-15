package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class Rockathon extends EndeavourEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Central Lawn<br>19th March 2015<br>3:30 PM - 6:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Rahul Jaiman\nAman Gupta\nTushaar sharma\nAnkita Saxena");
        details = Html.fromHtml("<b>Details</b><p>A perfect blend of the adrenaline rush of a battle, boisterousness of a moshpit and rhapsodical music, ROCK-ATHON is the battle of bands organised by JECRC foundation Jaipur which aims to promote the underground music scene in India.</p>"+
                "<b>1st Prize:</b>" + "<p>15,000₹" +
                "<br></p>");
        rules = Html.fromHtml("<b>Rules</b><p>1.Each band will be given a max time of 20+5 mins including the sound check.<br>" +
                "2. Marks will be deducted if the band exceeds the allotted time limit.<br>" +
                "3. Each band will be provided with a standard drum kit including one ride & one hi-hat. The drummers must carry their extra drum cymbals.<br>" +
                "4. Use of slang words is strictly prohibited. <br>" +
                "5. The guitarists are advised to carry their own processors & adapters. <br>" +
                "6. Bands are required to mail their Band profile along with the video links of their performances at the email addresses provided.<br>" +
                "7. On the basis of the entries received, the top 6 bands will be selected to perform at the event.<br>" +
                "8. Bands can have a maximum of 8 members and no member can be a part of more than one bands.<br>" +
                "9. Final decision regarding any matter lies in the hands of the organizers and judges and is binding.<br>" +
                "10. Any team violating the above rules is subject to direct elimination.<br></p>"+
        "<b>General Information: </b><p>Interested bands please send two of yours good quality videos of live performances & one recorded OC to undersigned<br>" +
                "Also mention the names of the band members, contact number & email id of the band manager and facebook profile link of the band.<br>" +
                "Selected bands will be notified via email or call.<br>" +
                "<br>" +
                "Last date for the entries of the respective event is 8th march 2015.Failing sufficient no.of entries , event will be cancelled and you will be notified about the same. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>1,200₹ Per Team</p>");


        phn1 = "7737046814";
        coordinator1Name = "Aman Gupta";
        coordinator2Name = "Tushaar sharma";
        phn2 = "8233601018";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
