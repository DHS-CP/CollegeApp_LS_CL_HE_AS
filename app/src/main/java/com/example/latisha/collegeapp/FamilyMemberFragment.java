package com.example.latisha.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Latisha on 12/4/17.
 */

public class FamilyMemberFragment extends Fragment {
    //2.1.5 step 7 in lines 17-20
    TextView mFirstNameText;
    EditText eFirstNameEdit;
    TextView mLastNameText;
    EditText mLastNameEdit;

    //2.1.5 step 9 in line 23
    FamilyMember mMember=new FamilyMember();

    //2.1.4 steps 23-26 implemented in lines 16-20
    @Override
    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_family_member, two, false);
        return rootView;
    }
}
