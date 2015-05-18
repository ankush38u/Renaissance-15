package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class Trashion extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>LT-7<br>20th March 2015<br>1:00 PM - 3:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Arpit Sharma\nMahita Sharma\nLakshi Bansal");
        details = Html.fromHtml("<b>Details</b><p>Sustainability is a serious issue and we know you care about leading the way and engaging people in your efforts. Wouldn’t it be a great to throw a little fun and creativity into the mix in order to achieve the elusive unexpected.<br>" +
                "We bring you a fashion designing competition with a twist grace the face and build your own fashion with the things which are generally thrown out as trash. Show the designer in you!<br></p>"
        +
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,000₹</p>" );
        rules = Html.fromHtml("<b>Rules</b><p>1. Participants in a team of  three are required to make hairstyle and apply makeup on one of the team members.(limited materials)<br>" +
                "2. Materials would be given by organizer prior to event and any other materials are not allowed.<br>" +
                "3. Participants in team of at most three are required to make an outfit from the material provided by the organizers (limited material).<br>" +

                "4. Decision of judges will be final<br>" +
                "5. Rules are prior to change on the spot .<br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>300₹</p>");


        phn1 = "9983506536";
        coordinator1Name = "Mahita Sharma";
        coordinator2Name = "Arpit Sharma";
        phn2 = "9166047480";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }

}
