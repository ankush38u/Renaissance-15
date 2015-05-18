package com.electricdroid.renaissance.quanta.computerkingdom;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 16-02-2015.
 */
public class StepToStock extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Reference Library B Block<br>18th March 2015<br>12:00 PM -3:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Palak Saria\nPrashant Jain\nChitrang Goyal" +
                "\n" +
                "Akshay Kumar Tak" +
                "\n" +
                "Prakash Kumar");
        details = Html.fromHtml("<b>Details</b><p>Step to Stock provides exposure to the world of stock trading giving a chance to work in real market scenarios in form of virtual money</p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>" +
                "1. Maximum no of participants are 2.<br>" +
                "2. Virtual initial amount: Rs1,00,000<br>" +
                "3. The team with maximum profit will declaread as winner.<br>" +
                "4. Each slots will be of 10 mins.<br>" +
                "5. The process is repeated 7 times with a virtual money amount of rs100000/- at the beginning.<br>" +
                "6. The decision of buying & selling can be evaluated with upcoming news during the process of trading.<br>" +
                "<br>" +
                "Note : Last date for registration of respective events will be 8th March 2015. Failing the number of sufficient entries, the event will be cancelled.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "8290791041";
        coordinator1Name = "Chitrang Goyal";
        coordinator2Name = "Prashant Jain";
        phn2 = "7877781927";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }

}
