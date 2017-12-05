package com.example.latisha.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Latisha on 12/4/17.
 */

public class FamilyMemberFragment extends Fragment {
    //steps 23-26 implemented in lines 16-20
    @Override
    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_family_member, two, false);
        return rootView;
    }
}
