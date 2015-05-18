package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class GullyCricket extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>GH Lawn & BH-2 Lawn<br>18th March 2015  - 11:30 AM - 3:30 PM<br>21st March 2015  - 9:30 AM - 1:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Nikhil Nama\nAditya\nNivesh\naaditya Ambar");
        details = Html.fromHtml("<b>Details</b><p>India doesn’t need world cup to stimulate them to play cricket.<br>" +
                " We have been playing cricket since we remember friendship and siblings.<br>" +
                " Many people criticize cricket for overshadowing the many other game but we find this game one of the many reasons that connects us.<br>" +
                " We have got gully cricket that’s a favorite version of the game we have got”1 tappi 1 hand” since our childhood.</p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. Participants must register in a team of five members . <br>" +
                "2. One tip one hand catch will be considered as out. <br>" +
                "3. If balls went directly over the rope,the batsman will be out. <br>" +
                "4. 5 balls per over in 4 over  match. <br>" +
                "5. 3 miss continuously ,will be considered as out. <br>" +
                "6. No player can play from two teams. <br>" +
                "7. No running between the wickets . <br>" +
                "8. No leg byes,ball hitting the body will be considered as a miss. <br>" +
                "9. Next ball after a wide ball ,will be considered as a free hit. <br>" +
                "10. The batsman cannot be changed unless he is out. <br>" +
                "11. Team may include female players if they want. <br>" +
                "12. Any further changes in the rules will be notified at the time of event. <br>" +
                "13. Team has to bring their own bats for the match. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹</p>");


        phn1 = "8385096773";
        coordinator1Name = "Nikhil Nama";
        coordinator2Name = "Aditya";
        phn2 = "9887117901";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
