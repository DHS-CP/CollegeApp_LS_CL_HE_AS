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
    EditText mFirstNameEdit;
    TextView mLastNameText;
    EditText mLastNameEdit;

    //2.1.5 step 9 in line 23
    FamilyMember mMember=new FamilyMember();


    //2.1.4 steps 23-26 implemented in lines 30-34
    @Override
    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_family_member, two, false);


        //2.1.5 step 11 in lines 34-41 below
        TextView mFirstNameText = rootView.findViewById(R.id.FirstNameText);
        EditText mFirstNameEdit;
        TextView mLastNameText = rootView.findViewById(R.id.LastNameText);
        EditText mLastNameEdit;

        
        mFirstNameText.setText(mMember.getFirstName());
        mLastNameText.setText(mMember.getLastName());

        return rootView;
    }
}
