package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class StepUp extends EndeavourEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block A<br>21th March 2015<br>4:00 PM - 7:00 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Kshitiz Kantoo\nNidhiBinani\nVaishnavi");
        details = Html.fromHtml("<b>Details</b><p>From the streets of USA, STEP UP: the street dance is back to set ablaze the streets of Jaipur Engineering College And Research Centre (JECRC) once again.The competition includes various forms of street dance from B-boying, Hip Hop to Jazz and many more.<br>" +
                "In the past few years JECRC has seen some of the most spectacular performances by crews like Projekt Street Dance Crew(PSD) Delhi, Refactor Dance Crew (RDC) Mumbai, Tandavas Delhi etc.<br>" +
                "We also witnessed performances by some of the members of the Fictitious Dance Crew (Winners of India’s Got Talent).<br>" +
                "Last year we witnessed the performance of AMARDEEP SINGH, who later in the year, also reached the finals of INDIA KE DANCING SUPERSTARS and was hailed as “ BIGGEST ROBOTICS SENSATION OF INDIA “</p>"+
                "<b>1st Prize:</b>" + "<p>17,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>8,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p><b>Round-1 : </b><br>" +
                "1. STEP-UP is an open event.<br>" +
                "2. The min. no. of participants will 4 and max. is 12.<br>" +
                "3. Time limit will be between 5-10 min.<br>" +
                "4. The teams must bring 2 CDs containing their sound tracks. The sound track should be in mp3 format.<br>" +
                "5. The teams should bring their own portable music system for practice.<br>" +
                "6. Participants should show the free style of dance. Power movements, acrobatics are admissible, but they should not dominate. The main thing is DANCE under music hip-hop.<br>" +
                "7. The dance floor area must be in same condition after the performances as before.<br>" +
                "8. Individuality &originality of the dance is encouraged as well as interaction & contacts with the spectators & the other dancers.<br>" +
                "9. Dancers are not restricted from performing any move but they must be aware that it is their own responsibility to ensure that they do not perform dangerous moves that could injure themselves or others.<br>" +
                "10. The use of fire works is not allowed.<br>" +
                "11. In case of situations which have not been described in rules, decision taken by judges will be final.<br>" +"<br>"+
                "<b>Round- 2 :</b> <br>" +
                "Two to four teams are selected from 1st round depending on the no. of participating teams. There will be a Street battle between both teams, a move to move challenge. Min.1 to max.5 people can come for the battle at a time. Marking in this round will be done on the basis of quality of moves & synchronization with music. The battle may be in different rounds, which includeup rocks, Down rocks, power moves, freezes etc. <br>" +
                "Any vulgar move during battle is strictly prohibited and the team doing any such movement can be disqualified.<br>" +
                "In case of any dispute, the decision of Judges will be final.<br>" +
                "<br>" +
                "Last date for the entries of the respective event is 8th march 2015.Failing sufficient no.of entries , event will be cancelled and you will be notified about the same. <br></p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>12,00₹ per Team</p>");


        phn1 = "9460055559";
        coordinator1Name = "Kshitiz Kantoo";
        coordinator2Name = "Nidhi Binani";
        phn2 = "8952018996";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
