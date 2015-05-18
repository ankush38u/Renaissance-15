package com.electricdroid.renaissance.quanta;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.electricdroid.renaissance.R;


public class QuantaEvent extends ActionBarActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private TextView detailTv;
    private TextView rulesTv;
    private TextView venueTv;
    private TextView coordinatorTv;
    private TextView registrationTv;
    private LinearLayout llDetails;
    private LinearLayout llForCoordinators;
    public TextView singleTextView;

    //for the framelayout of co ordinators
    public TextView coordinatornameTv;
    public TextView coordinator1;
    public TextView coordinator2;


    //these variables with b hidden by subclass variables/fields
    public Spanned venue;
    public Spanned coordinatorNames;
    public Spanned details;
    public Spanned rules;
    public Spanned registration;


    public String phn1;
    public String phn2;
    public String coordinator1Name;
    public String coordinator2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_event);    //used same layout od splash event as a modified it later
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.scrollBar).setHorizontalScrollBarEnabled(false);

        detailTv = (TextView) findViewById(R.id.detailTv);
        rulesTv = (TextView) findViewById(R.id.rulesTv);
        venueTv = (TextView) findViewById(R.id.venueTv);
        coordinatorTv = (TextView) findViewById(R.id.coordinatorTv);
        registrationTv = (TextView) findViewById(R.id.registrationTv);

        detailTv.setOnClickListener(this);
        rulesTv.setOnClickListener(this);
        venueTv.setOnClickListener(this);
        coordinatorTv.setOnClickListener(this);
        registrationTv.setOnClickListener(this);

        llDetails = (LinearLayout) findViewById(R.id.lldetails);
        llForCoordinators = (LinearLayout) findViewById(R.id.llForCoordinator);
        singleTextView = (TextView) findViewById(R.id.singleTextView);
        singleTextView.setMovementMethod(LinkMovementMethod.getInstance());
        singleTextView.setClickable(false);
        //     setDetailsText();  //to update details when activity opens


        coordinatornameTv = (TextView) findViewById(R.id.coordinatornameTv);
        coordinatornameTv.setClickable(false);
        coordinator1 = (TextView) findViewById(R.id.coordinator1);
        coordinator2 = (TextView) findViewById(R.id.coordinator2);
        coordinator1.setOnClickListener(this);
        coordinator2.setOnClickListener(this);

    }

    /*
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_test_event, menu);
            return true;
        }
    */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if (v == registrationTv) {
            llDetails.setVisibility(View.VISIBLE);
            llForCoordinators.setVisibility(View.INVISIBLE);
            registrationTv.setBackgroundColor(getResources().getColor(R.color.primaryColor));
            registrationTv.setTextColor(Color.WHITE);

            detailTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            venueTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            coordinatorTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            rulesTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));

            detailTv.setTextColor(getResources().getColor(R.color.secondaryText));
            venueTv.setTextColor(getResources().getColor(R.color.secondaryText));
            coordinatorTv.setTextColor(getResources().getColor(R.color.secondaryText));
            rulesTv.setTextColor(getResources().getColor(R.color.secondaryText));

            setRegistrationText();

        } else if (v == detailTv) {
            llDetails.setVisibility(View.VISIBLE);
            llForCoordinators.setVisibility(View.INVISIBLE);
            detailTv.setBackgroundColor(getResources().getColor(R.color.primaryColor));
            detailTv.setTextColor(Color.WHITE);

            registrationTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            venueTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            coordinatorTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            rulesTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));


            registrationTv.setTextColor(getResources().getColor(R.color.secondaryText));
            venueTv.setTextColor(getResources().getColor(R.color.secondaryText));
            coordinatorTv.setTextColor(getResources().getColor(R.color.secondaryText));
            rulesTv.setTextColor(getResources().getColor(R.color.secondaryText));
            setDetailsText();

        } else if (v == venueTv) {
            llDetails.setVisibility(View.VISIBLE);
            llForCoordinators.setVisibility(View.INVISIBLE);
            venueTv.setBackgroundColor(getResources().getColor(R.color.primaryColor));
            venueTv.setTextColor(Color.WHITE);

            detailTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            registrationTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            coordinatorTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            rulesTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));

            detailTv.setTextColor(getResources().getColor(R.color.secondaryText));
            registrationTv.setTextColor(getResources().getColor(R.color.secondaryText));
            coordinatorTv.setTextColor(getResources().getColor(R.color.secondaryText));
            rulesTv.setTextColor(getResources().getColor(R.color.secondaryText));
            setVenueText();
        } else if (v == coordinatorTv) {
            // except in coordinators we will use llDetails view in all
            llDetails.setVisibility(View.INVISIBLE);
            llForCoordinators.setVisibility(View.VISIBLE);
            coordinatorTv.setBackgroundColor(getResources().getColor(R.color.primaryColor));
            coordinatorTv.setTextColor(Color.WHITE);

            detailTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            registrationTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            venueTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            rulesTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));

            detailTv.setTextColor(getResources().getColor(R.color.secondaryText));
            registrationTv.setTextColor(getResources().getColor(R.color.secondaryText));
            venueTv.setTextColor(getResources().getColor(R.color.secondaryText));
            rulesTv.setTextColor(getResources().getColor(R.color.secondaryText));
            setCoordinatorText();
        } else if (v == rulesTv) {
            llDetails.setVisibility(View.VISIBLE);
            llForCoordinators.setVisibility(View.INVISIBLE);
            rulesTv.setBackgroundColor(getResources().getColor(R.color.primaryColor));
            rulesTv.setTextColor(Color.WHITE);

            detailTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            registrationTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            venueTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));
            coordinatorTv.setBackgroundColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_dark));

            detailTv.setTextColor(getResources().getColor(R.color.secondaryText));
            registrationTv.setTextColor(getResources().getColor(R.color.secondaryText));
            venueTv.setTextColor(getResources().getColor(R.color.secondaryText));
            coordinatorTv.setTextColor(getResources().getColor(R.color.secondaryText));
            setRulesText();
        } else if (v == coordinator1) {
            String uri = "tel:" + phn1.trim();
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(uri));
            startActivity(intent);
        } else if (v == coordinator2) {
            String uri = "tel:" + phn2.trim();
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(uri));
            startActivity(intent);
        }
    }

    public void setVenueText() {
        //these all methods will b defined in sub class
        singleTextView.setText(venue);
    }

    public void setCoordinatorText() {
        coordinatornameTv.setText(coordinatorNames);
        coordinator1.setText(coordinator1Name);
        coordinator2.setText(coordinator2Name);
    }

    public void setDetailsText() {
        singleTextView.setText(details);
    }

    public void setRulesText() {
        singleTextView.setText(rules);
    }

    public void setRegistrationText() {
        singleTextView.setText(registration);
    }
}
