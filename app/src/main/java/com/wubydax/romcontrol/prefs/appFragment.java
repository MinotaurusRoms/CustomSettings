package com.wubydax.romcontrol.prefs;

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.wubydax.romcontrol.HandlePreferenceFragments;
import com.wubydax.romcontrol.R;


public class appFragment extends PreferenceFragment {
    HandlePreferenceFragments hpf;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hpf = new HandlePreferenceFragments(getActivity(), this, "app_prefs");
    }

    @Override
    public void onResume() {
        super.onResume();
        hpf.onResumeFragment();
    }

    @Override
    public void onPause() {
        super.onPause();
        hpf.onPauseFragment();
    }


}
