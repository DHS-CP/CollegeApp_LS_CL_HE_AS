package com.example.latisha.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Latisha on 12/5/17.
 */
//step 28 is this whole file
public class ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_profile, two, false);
        return rootView;
    }
}
