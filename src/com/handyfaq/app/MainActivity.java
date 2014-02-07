package com.handyfaq.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.RingtonePreference;
import android.preference.SwitchPreference;
import android.provider.Settings.System;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainActivity extends Activity {
		 
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);

                    // Display the fragment as the main content.
                    FragmentManager mFragmentManager = getFragmentManager();
                    FragmentTransaction mFragmentTransaction = mFragmentManager
                                            .beginTransaction();
                    PrefsFragment mPrefsFragment = new PrefsFragment();
                    mFragmentTransaction.replace(android.R.id.content, mPrefsFragment);
                    mFragmentTransaction.commit();
         
        }

        public static class PrefsFragment extends PreferenceFragment {

                    @Override
                    public void onCreate(Bundle savedInstanceState) {
                                super.onCreate(savedInstanceState);

                                // Load the preferences from an XML resource
                                addPreferencesFromResource(R.xml.device);
                    }
        }

	 }
