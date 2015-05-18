package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class ReverseEngineering  extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Reference Library & ER<br>20th March 2015<br>9:30 AM -12:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Ritesh Jain\n" +
                "Neelam\n" +
                "Nitin Singhal\n" +
                "Anurag Khandewal");
        details = Html.fromHtml("<b>Details</b><p>This event is divided into two stages. <br>" +
                "In the first stage each team (2-3 Members) has to clear an objective type test paper, only the qualified teams will be allowed to enter in the second stage. In the second stage each team will be provided an electronic device which they have to disassemble and then again assemble it to the original state.</p>"+
                "<b>1st Prize:</b>" + "<p>2,000₹ + 2 MTS HomeSpot Wi-Fi</p>" +
                "<b>2nd Prize:</b>" + "<p>2,000₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>Stage 1: This stage is to test the technical skills of the participants. Each team should answer 40 MCQ within 20 minutes where for each correct answer 3 marks will be awarded and 1 mark will be deducted for a wrong answer.<br>" +
                "<br>" +
                "Stage 2 : This Stage will be further divided into 2 phases.<br>" +
                "A : Disassembling & Assembling of a small electronic device within 15 minutes.<br>" +
                "B : Solve a Surprise task within 15 minutes<br>" +
                "<br>" +
                "Stage 3: Teams have to disassemble the device up to the last component, identify and note its components.After that teams have to assemble the device to the original state. Duration for this stage will be 30 minutes<br>" +
                "<br>" +
                "Upon the completion of the tasks, a judge will test the knowledge of the participants and award marks.<br>" +
                "It should be clearly kept in mind that any damage caused to the device, no matter how insignificant, will lead to disqualification.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>350₹ Per Team</p>");


        phn1 = "9784366488";
        coordinator1Name = "Ritesh Jain";
        coordinator2Name = "Nitin Singhal";
        phn2 = "9636206624";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
