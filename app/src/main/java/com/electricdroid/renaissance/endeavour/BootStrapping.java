package com.electricdroid.renaissance.endeavour;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class BootStrapping extends EndeavourEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Central Lawn<br>19th March 2015<br>6:45 PM -9:45 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Harshita Mehta\nMonika Saran\nShubham Khandelwal\nArpan Mathur");
        details = Html.fromHtml("<b>Details</b><p>The eternal popularity of dance lies in its ecstatic function. Instead of transporting the dancers from a profane to a sacred state, it now transports them from what they acknowledge as \"reality\" to a realm of romance.<br>" +
                " The dance is one of the many human experiences which cannot be suppressed. <br>" +
                "Dancing has existed at all times, and among all peoples and races. The dance is a form of expression given to man just as speech, philosophy, painting or music. <br>" +
                "So come and show the insanity of your moves, the intensity of your vigor.</p>"+
                "<b>1st Prize:</b>" + "<p>11,000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>5,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>1. Max 2 teams per college are allowed and each participant shall bring his/her valid original college ID card on the day.<br>" +

                "2. The min. no. of participants should be 5 and maximum is 20[on stage- min(5) Max(15)]<br>" +

                "3. Reimbursement will be given to only 15 members.<br>" +

                "4. Pre-recorded music should be brought in a CD/DVD as well as in a pen drive in .cda AND .mp3 format only (Other formats may not be supported on the computer – use them at your own risk).<br>" +

                "5. The teams should bring their own portable music system for practice.<br>" +

                "6. Individuality & originality of the dance is encouraged.<br>" +

                "7. Dancers are not restricted from performing any move but they must be aware that it is their own responsibility to ensure that they do not perform moves that could injure themselves or others.<br>" +

                "8. Obscenity of any kind is not allowed and will lead to immediate disqualification.<br>" +

                "09. Use of only stage is allowed.<br>" +

                "10. The use of fireworks & fire acts, colors, water are not allowed.<br>" +

                "11. Time limit will be between 7+1 minutes.<br>" +
                "<br>" +
                "Criteria for judgment:- Choreography, Coordination, Expression, Innovation, Energy, Theme (If any,but judgement will be according to the above criteria)<br>" +

                "All participants in a group should belong to the same technical or management institution. Lodging, boarding and travel expenses (for outside Rajasthan entries) as per college travel policy. Decision of the judges and the organizing committee would be final on any issue.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>1,500₹ per Team</p>");


        phn1 = "9694396877";
        coordinator1Name = "Arpan Mathur";
        coordinator2Name = "Shubham Khandelwal";
        phn2 = "8560808880";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
