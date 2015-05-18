package com.electricdroid.renaissance;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.electricdroid.renaissance.gallery.GalleryView;

import java.util.Collections;
import java.util.List;

/**
 * Created by anki on 26-01-2015.
 */
public class AdapterRV extends RecyclerView.Adapter<AdapterRV.MyViewHolder> {
    private LayoutInflater inflator;
    private Context context;
    List<InformationOfRV> data = Collections.emptyList();
    // private MyViewHolder.ClickListener clickListener;

    AdapterRV(Context context, List<InformationOfRV> data) {
        inflator = LayoutInflater.from(context);
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = inflator.inflate(R.layout.custom_row, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        InformationOfRV current = data.get(i); //now current is an object for our info class
        viewHolder.title.setText(current.title);
        viewHolder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.tv_row);
            icon = (ImageView) itemView.findViewById(R.id.img_view_row);
        }

        @Override
        public void onClick(View view) {


            int itemPosition = getPosition();
            String item = data.get(itemPosition).title;
          //  Toast.makeText(context, item, Toast.LENGTH_LONG).show();

            if (item.equals("Splash")) {
                context.startActivity(new Intent(context, SplashEvents.class));
            } else if (item.equals("Endeavour")) {
                context.startActivity(new Intent(context, EndeavourEvents.class));
            } else if (item.equals("Quanta")) {
                context.startActivity(new Intent(context, QuantaEvents.class));
            } else if (item.equals("Schedule")) {
                context.startActivity(new Intent(context, Schedule.class));
            } else if (item.equals("Gallery")) {
                context.startActivity(new Intent(context, GalleryView.class));
            } else if (item.equals("Register/Login")) {
                context.startActivity(new Intent(context, Website.class));
            }
            else if(item.equals("Contact Us")){
                context.startActivity(new Intent(context, ContactUs.class));
            }
            //    Toast.makeText(view.getContext(), "position = " + getPosition(), Toast.LENGTH_SHORT).show();

        }

    }
}