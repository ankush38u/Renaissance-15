package com.electricdroid.renaissance.quanta.constructo;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import com.electricdroid.renaissance.quanta.QuantaEvent;

/**
 * Created by anki on 17-02-2015.
 */
public class ForkLifter extends QuantaEvent {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>Block B<br>19th March 2015<br>12:30 PM - 3:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Himanshu Jain\n" +
                "Monu Sharma\n" +
                "Vivek Sharma\n" +
                "Manpreet Kaur");
        details = Html.fromHtml("<b>Details</b><p>Bring a crane from your own by making it with proper specifications given, (Using only hydraulic<br>" +
                "<br>" +
                "mechanisms) and performing the given tasks with crane.<br>" +
                "<br>" +
                "Round 1: This will be an elimination round. In this round points will be given to each crane on the basis<br>" +
                "<br>" +
                "of maximum weight it can lift for 5 sec. Points of this round will be added in the final score of round 3.<br>" +
                "<br>" +
                "Round 2: This will also be an elimination round. Teams will be given a task to perform. The task will be of<br>" +
                "<br>" +
                "picking up balls and placing the on the specified location. Marks will be given be on the basis of time<br>" +
                "<br>" +
                "taken for complete the task.<br>" +
                "<br>" +
                "Round 3: This is final round. Selected Teams of previous round will have to build a building with blocks.<br>" +
                "<br>" +
                "There will be time limit. Points will be given on the basis of height and stability of building</p>"+
                "<b>1st Prize:</b>" + "<p>2,500₹</p>" +
                "<b>2nd Prize:</b>" + "<p>1,500₹</p>");
        rules = Html.fromHtml("<b>Rules</b><p>"+
                "Machine Specifications:\n" +
                "\n" +
                "The crane should works on hydraulic mechanism only. (Controlled by syringes only) The weight of the crane should not exceed 5 kilograms. Locomotion of any part and control of the machine should be powered by hydraulic force, springs (you can move the syringe by hand if required). Use of batteries and other power sources is prohibited. Other than favicol and other Adhesives, use of any material to make the crane is prohibited. Use of metal is prohibited in making the crane.\n" +
                "\n" +
                "Maximum of 3 members per team is allowed.\n+" +
                "The maximum time of 3 minutes is given to each team to lift as much weight as they can.\n" +
                "\n" +
                "Team members are not allowed to touch any part of crane, except the controlling syringes. So they should be mounted separately.\n" +
                "\n" +
                "Maximum of two people will be allowed to control the machine at any point of time.\n" +
                "\n" +
                "Any damage to arena or weights is not allowed. Team found damaging will be disqualified immediately.\n" +
                "\n" +
                "The organizers reserve all rights to change any of the above rules as they deem fit. Change in rules, if any will be highlighted on the website. </p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>250₹ Per Team</p>");


        phn1 = "9982680220";
        coordinator1Name = "Himanshu Jain";
        coordinator2Name = "Vivek Sharma";
        phn2 = "7725916046";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
