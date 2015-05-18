package com.electricdroid.renaissance.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.electricdroid.renaissance.R;

public class GalleryView extends ActionBarActivity {
    Integer[] pics = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6,
            R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13,
            R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20,
            R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27,
            R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33};
    LinearLayout imageView;
    private Toolbar toolbar;
    TouchImageView touchImageView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //    toolbar.setLogo(R.drawable.app_icon);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        try {
            // InputStream in = (new URL("www.google.com").openStream());
        } catch (Exception e) {
            e.getMessage();
        }
        final Gallery ga = (Gallery) findViewById(R.id.Gallery01);

        ga.setAdapter(new ImageAdapter(this));

        imageView = (LinearLayout) findViewById(R.id.ImageView01);
        ga.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
              /*  Toast.makeText(
                        getBaseContext(),
                        "You have selected picture " + (arg2 + 1)
                                + " of Antartica", Toast.LENGTH_SHORT).show();
                */
                try {
                    imageView.removeAllViews();
                } catch (Exception e) {
                    e.getMessage();
                }

                touchImageView = new TouchImageView(
                        GalleryView.this);
                touchImageView.setImageResource(pics[arg2]);
                LayoutParams lp = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
                imageView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
                touchImageView.setLayoutParams(lp);
                imageView.addView(touchImageView);
                imageView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);

/*
             // mod code by ankush
             //start
                ga.setVisibility(View.INVISIBLE);


                touchImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      // Toast.makeText(GalleryView.this, "iv clicked", Toast.LENGTH_SHORT).show();
                        ga.setVisibility(View.VISIBLE);
                       // imageView.setVisibility(View.INVISIBLE);
                        try {
                            imageView.removeAllViews();
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                });

                //end
   */         }

        });



    }

    public class ImageAdapter extends BaseAdapter {

        private Context ctx;
        int imageBackground;

        public ImageAdapter(Context c) {
            ctx = c;
            TypedArray ta = obtainStyledAttributes(R.styleable.Gallery1);
            imageBackground = ta.getResourceId(
                    R.styleable.Gallery1_android_galleryItemBackground, 1);
            ta.recycle();
        }

        @Override
        public int getCount() {

            return pics.length;
        }

        @Override
        public Object getItem(int arg0) {

            return arg0;
        }

        @Override
        public long getItemId(int arg0) {

            return arg0;
        }


        public Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                      int reqWidth, int reqHeight) {

// First decode with inJustDecodeBounds=true to check dimensions
            final BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(res, resId, options);

// Calculate inSampleSize
            options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

// Decode bitmap with inSampleSize set
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(res, resId, options);
        }


        public int calculateInSampleSize(
                BitmapFactory.Options options, int reqWidth, int reqHeight) {
// Raw height and width of image
            final int height = options.outHeight;
            final int width = options.outWidth;
            int inSampleSize = 1;

            if (height > reqHeight || width > reqWidth) {

                final int halfHeight = height / 2;
                final int halfWidth = width / 2;

// Calculate the largest inSampleSize value that is a power of 2 and keeps both
// height and width larger than the requested height and width.
                while ((halfHeight / inSampleSize) > reqHeight
                        && (halfWidth / inSampleSize) > reqWidth) {
                    inSampleSize *= 2;
                }
            }

            return inSampleSize;
        }


        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            ImageView iv = new ImageView(ctx);
            iv.setImageBitmap(decodeSampledBitmapFromResource(getResources(), pics[arg0], 150, 120));
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setLayoutParams(new Gallery.LayoutParams(150, 120));
            iv.setBackgroundResource(imageBackground);
            return iv;
        }
    }
}