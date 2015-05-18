package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class SpellBee extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Auditorium<br>18th March 2015<br>2:30 PM - 4:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Rajat Agrawal\n" +
                "Puja Jain\n" +
                "Neelam Naruka\n" +
                "Sonali Bansal\n" +
                "Monika");
        details = Html.fromHtml("<b>Details</b><p>I.N.G.E.N.I.O.U.S, C.E.R.E.B.R.A.L, P.R.O.D.I.G.Y.<br>" +
                " If these are words that describe you best, you've reached the right space. Spell Bee is on the hunt for the best speller.<br>" +
                " If you have a P.E.N.C.H.A.N.T for spellings come here and try yourself out.</p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,200₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>"+
                "Round 1:<br>" +
                "<br>" +
                "Round one will be the rapid fire round in which you will be provided with many words…..just spell them out and gain your position in the next round.<br>" +
                "<br>" +
                "For example, try this out…..<br>" +
                "<br>" +
                "Exquisite<br>" +
                "<br>" +
                "Contagion<br>" +
                "<br>" +
                "Obnoxious (oops they are already spelled, but they won’t be there)<br>" +
                "<br>" +
                "Round 2:<br>" +
                "<br>" +
                "Round two would be a pointer round, which is again divided into 2 phases:<br>" +
                "<br>" +
                "Phase 1: the phase will be of visuals i.e. each team will be provided with some visuals which they have to guess; each correct answer will fetch you some points and incorrect will deduct the same.<br>" +
                "<br>" +
                "For example, guess these images:<br>" +
                "<br>" +
                "Phase 2: this phase is all about anagrams; teams will get some anagrams and along with some clues (a maximum of three). The points will be provided after seeing that after which clue you get your answer correct.<br>" +
                "<br>" +
                "For example, sort this out:<br>" +
                "<br>" +
                "? MYGRENA<br>" +
                "<br>" +
                "o clue1: it’s a country<br>" +
                "<br>" +
                "o clue2: it’s a member of UN, NATO, G8<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "o clue3: it’s in Europe<br>" +
                "<br>" +
                "NOTE: Each team will consist of a maximum of 2 members<br>" +
                "<br>" +
                "RESULT: The team to score maximum</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>200₹ Per Team</p>");


        phn1 = "9829881615";
        coordinator1Name = "Puja Jain";
        coordinator2Name = "Rajat Agarwal";
        phn2 = "9785711564";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
