package gr.tsagi.jekyllforandroid.app.fragments

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.preference.PreferenceFragment

import gr.tsagi.jekyllforandroid.app.R

/**
\* Created with IntelliJ IDEA.
\* User: jchanghong
\* Date: 9/9/13
\* Time: 19:51
\*/
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
class PrefsFragment : PreferenceFragment() {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences)
    }
}