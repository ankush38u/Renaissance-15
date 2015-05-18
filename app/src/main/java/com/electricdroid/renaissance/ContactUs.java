package com.electricdroid.renaissance;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ContactUs extends ActionBarActivity {
    TextView anshul;
    TextView parikshit;
    TextView jaswant;
    TextView vijay;
    TextView ankur;
    TextView chetan;
    TextView ravi;
    TextView shubham;
    TextView rashmi;
    Toolbar toolbar;
    ImageView anshulfb;
    ImageView parikshitfb;
    ImageView jaswantfb;
    ImageView vijayfb;
    ImageView ankurfb;
    ImageView chetanfb;
    ImageView ravifb;
    ImageView shubhamfb;
    ImageView rashmifb;

    RoundedImageView anshul_image;
    RoundedImageView parikshit_image;
    RoundedImageView jaswant_image;
    RoundedImageView vijay_image;
    RoundedImageView ankur_image;
    RoundedImageView chetan_image;
    RoundedImageView ravi_image;
    RoundedImageView shubham_image;
    RoundedImageView rashmi_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //    toolbar.setLogo(R.drawable.app_icon);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        anshul = (TextView) findViewById(R.id.anshul);
        anshul.setText(Html.fromHtml("<font color=black>Anshul Mittal</font><br><font color=#b2b2b2>anshulmittal@jecrc.ac.in</font>"));
        anshul_image = (RoundedImageView) findViewById(R.id.anshul_image);
        anshul_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.anshul));
        anshulfb = (ImageView) findViewById(R.id.anshulfb);
        anshulfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/anshul.o.mittal";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        parikshit = (TextView) findViewById(R.id.parikshit);
        parikshit.setText(Html.fromHtml("<font color=black>Parikshit Hada</font><br><font color=#b2b2b2>+91-9829177318</font>"));
        parikshit_image = (RoundedImageView) findViewById(R.id.parikshit_image);
        parikshit_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.parikshit));
        parikshitfb = (ImageView) findViewById(R.id.parikshitfb);
        parikshitfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/parikshit.singhhada";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        jaswant = (TextView) findViewById(R.id.jaswant);
        jaswant.setText(Html.fromHtml("<font color=black>Jaswant Singh</font><br><font color=#b2b2b2>+91-7023109977</font>"));
        jaswant_image = (RoundedImageView) findViewById(R.id.jaswant_image);
        jaswant_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.jaswant));
        jaswantfb = (ImageView) findViewById(R.id.jaswantfb);
        jaswantfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/jassu74";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        vijay = (TextView) findViewById(R.id.vijay);
        vijay.setText(Html.fromHtml("<font color=black>Vijay Bambani</font><br><font color=#b2b2b2>+91-8764405876</font>"));
        vijay_image = (RoundedImageView) findViewById(R.id.vijay_image);
        vijay_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vijay));
        vijayfb = (ImageView) findViewById(R.id.vijayfb);
        vijayfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/vijay.bhambhani.7";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        ankur = (TextView) findViewById(R.id.ankur);
        ankur.setText(Html.fromHtml("<font color=black>Ankur Jain</font><br><font color=#b2b2b2>+91-9887264115</font>"));
        ankur_image = (RoundedImageView) findViewById(R.id.ankur_image);
        ankur_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ankur));
        ankurfb = (ImageView) findViewById(R.id.ankurfb);
        ankurfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/Ankjain30";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        chetan = (TextView) findViewById(R.id.chetan);
        chetan.setText(Html.fromHtml("<font color=black>Chetan Rathore<br>(Splash)</font><br><font color=#b2b2b2>+91-9214456434</font>"));
        chetan_image = (RoundedImageView) findViewById(R.id.chetan_image);
        chetan_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.chetan));
        chetanfb = (ImageView) findViewById(R.id.chetanfb);
        chetanfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/chetanspartan";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ravi = (TextView) findViewById(R.id.ravi);
        ravi.setText(Html.fromHtml("<font color=black>Ravi Razz<br>(Endeavour)</font><br><font color=#b2b2b2>+91-9166044722</font>"));
        ravi_image = (RoundedImageView) findViewById(R.id.ravi_image);
        ravi_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ravi));
        ravifb = (ImageView) findViewById(R.id.ravifb);
        ravifb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/ravi.razz.5832";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        shubham = (TextView) findViewById(R.id.shubham);
        shubham.setText(Html.fromHtml("<font color=black>Shubham (Quanta)</font><br><font color=#b2b2b2>+91-7726996317</font>"));
        shubham_image = (RoundedImageView) findViewById(R.id.shubham_image);
        shubham_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.shumbham));
        shubhamfb = (ImageView) findViewById(R.id.shubhamfb);
        shubhamfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/profile.php?id=100005037097220";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        rashmi = (TextView) findViewById(R.id.rashmi);
        rashmi.setText(Html.fromHtml("<font color=black>Rashmi Ranjan</font><br><font color=#b2b2b2>+91-8739960440</font>"));
        rashmi_image = (RoundedImageView) findViewById(R.id.rashmi_image);
        rashmi_image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.rashmi));
        rashmifb = (ImageView) findViewById(R.id.rashmifb);
        rashmifb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.facebook.com/rashmi.ranjan.52206";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact_us, menu);
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
}
