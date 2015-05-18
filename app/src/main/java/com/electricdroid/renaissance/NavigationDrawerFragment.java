package com.electricdroid.renaissance;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawerFragment extends Fragment {
    private RecyclerView recyclerView;
    private AdapterRV myAdapterForRV;
    private static final String PREF_FILE_NAME = "pref";
    private static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer";
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private View drawerView;
    private boolean mUserLearnedDrawer;
    private boolean mFromSavedInstanceState;

    public NavigationDrawerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserLearnedDrawer = Boolean.valueOf(readFromPrefrences(getActivity(), KEY_USER_LEARNED_DRAWER, "false"));
        if (savedInstanceState != null) {
            mFromSavedInstanceState = true;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.myRecyclerView);
        myAdapterForRV = new AdapterRV(getActivity(), getData());
        //myAdapterForRV.setClickListener(this);


        recyclerView.setAdapter(myAdapterForRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }

    public static List<InformationOfRV> getData() {
        List<InformationOfRV> data = new ArrayList<InformationOfRV>();
        int[] icons = {R.drawable.splash, R.drawable.endeavour,
                R.drawable.quanta, R.drawable.schedule,
                R.drawable.gallery, R.drawable.website,R.drawable.contact_us};
        String title[] = {"Splash", "Endeavour", "Quanta", "Schedule", "Gallery", "Register/Login","Contact Us"};
        for (int i = 0; i < icons.length && i < title.length; i++) {
            InformationOfRV dataObject = new InformationOfRV();
            dataObject.iconId = icons[i];
            dataObject.title = title[i];
            data.add(dataObject);

        }
        return data;
    }

    public void setUp(int id, DrawerLayout drawerLayout, final Toolbar toolbar) {
        drawerView = getActivity().findViewById(id);
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().supportInvalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                if (slideOffset > 0 && slideOffset < 0.5) {
                  if(Build.VERSION.SDK_INT >= 11) {
                      toolbar.setAlpha(1 - slideOffset); //slideoffset varies from 0 to 1
                  }
                }
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if (!mUserLearnedDrawer) {
                    mUserLearnedDrawer = true;
                    saveToPrefrences(getActivity(), KEY_USER_LEARNED_DRAWER, mUserLearnedDrawer + ""); // added "" to convert boolean to string
                }


                getActivity().supportInvalidateOptionsMenu();
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });

        if (!mUserLearnedDrawer && !mFromSavedInstanceState) {
            mDrawerLayout.openDrawer(drawerView);
        }
    }

    //using sharedprefrences
    public static void saveToPrefrences(Context context, String prefrenceName, String prefrenceValue) {
        SharedPreferences sharedPrefrences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefrences.edit();
        editor.putString(prefrenceName, prefrenceValue);
        editor.apply();
    }

    public static String readFromPrefrences(Context context, String prefrenceName, String defaultValue) {
        SharedPreferences sharedPrefrences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPrefrences.getString(prefrenceName, defaultValue);
    }


}
