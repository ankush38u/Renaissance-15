package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class MadHouse extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>"+
                "Mad House Prelims<br>LT-7<br>19th March 2015<br>9:30 AM -11:30 AM<br><br>Mad House<br>LT-7<br>19th March 2015<br>1:00 PM -3:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("\n" +
                "Ankit Sharma\n" +
                "Cheena Middha\n" +
                "Akanksha Bansal");
        details = Html.fromHtml("<b>Details</b><p>Pagalpanti bhi zaroori hai…. Qki there is no great genius without some touch of madness." +
                "<br> Explore the madness in you with the fun and mad events this Renaissance. </p>"+
                "<b>1st Prize:</b>" + "<p>1,200₹</p>" +
                "<b>2nd Prize:</b>" + "<p>800₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. It is a group event. <br>" +
                "2. Number of participants should be 2 in each group. <br>" +
                "3. Props or music if any as per the requirements of the task will be provided. <br>" +
                "4. Teams should inform of their arrival before 1 hour of the commencement of event. <br>" +
                "5. On the spot registration would close 3 hours before the beginning of event. <br>" +
                "6. Decision of the judges and the organizing committee would be final on any issue. <br>" +
                "7. Any kind of indecency will lead to disqualification. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>100₹</p>");


        phn1 = "9024435917";
        coordinator1Name = "Ankit Sharma";
        coordinator2Name = "Cheena Middha";
        phn2 = "9950197457";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
