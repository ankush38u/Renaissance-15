package com.electricdroid.renaissance;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by anki on 01-03-2015.
 */
public class Prefs extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.prefs);
    }
}
