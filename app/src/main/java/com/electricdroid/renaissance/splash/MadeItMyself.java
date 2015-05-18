package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class MadeItMyself extends SplashEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>18th March 2015<br>2:30 PM - 4:30 PM</p>");
        coordinatorNames = Html.fromHtml("<b>Face Painting</b><p>Shubham Prajapti<br>Honey Rathore</p><b>Rangoli</b><p>Akriti Goyal<br>Bhumika</p>");
        details = Html.fromHtml("<b>Details</b><p>Imagination is the beginning of creation.<br>" +
                " To add colors to your imagination, we have another event awaiting for you.<br>" +
                " Show your creativity with the beauty of colors and more and more colors to your ways. <br>" +
                " <br>" +
                "The event includes the following two events: <br>" +
                "1. Face Painting <br>" +
                "2. Rangoli<br></p>"+
                "<b>Rangoli Prize:</b>" + "<p>1,500₹</p>" +
                "<b>Face Painting Prize:</b>" + "<p>1000₹ + 2 MTS HomeSpot Wi-Fi</p>");
        rules = Html.fromHtml("<b>Rules</b><p><h1>Face Painting:</h1> <p>" +
                "1. Participants are not allowed to bring any sort of references during the event. If found with any sort of reference materials, their registration will be cancelled.<br>" +
              
                "2. Create your design using the colors provided.<br>" +
               
                "3. You may use sponges, brushes however stencils is not allowed.<br>" +
                
                "4. Do not include costumes, wigs, accessories, gemstones, glitter, feathers, silicon or prosthetics.<br>" +
                
                "5. Design your own original artwork.<br>" +
               
                "6. No logos, licensed characters or other copyrighted work may be used in your painting.<br>" +
                
                "7. Profane and offensive painting will be disqualified.<br></p>" +
                "<p><h1>Rangoli:</h1><p>1.Maximum number of participants in a team should be 3. <br>" +
                "2. Registration would be done on the basis of first come first serve. <br>" +
                "3. Participants have to work with the Materials that are provided which will be same for everyone<br>" +
                "4. The decision given by the judges shall be entertained as final. <br>" +
                "<b>JUDGING CRITERIA (for both the events): </b><br>" +
                "1. Innovativeness (30) <br>" +
                "2. Elements of fine arts (fineness in painting, creativity, neatness, etc.) (30) <br>" +
                "3. Elements of fun (10) <br>" +
                "4. Message conveyed (15) <br>" +
                "5. Overall impact (10)  and Other Criteria (5) <br></p></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p><b>Rangoli</b><p>150₹</p><b>Face Painting</b><p>100₹</p></p>");


        phn1 = "8952098249";
        coordinator1Name = "Shubham Prajapti";
        coordinator2Name = "Akriti Goyal";
        phn2 = "8058810093";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
