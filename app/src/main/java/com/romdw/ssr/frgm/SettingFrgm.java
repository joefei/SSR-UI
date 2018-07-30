package com.romdw.ssr.frgm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.romdw.ssr.R;


/**
 * UserFrgm
 * Created on 2018-07-30 07:26:35.
 */
public class SettingFrgm extends Fragment {


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frgm_user, container, false);
    }

}