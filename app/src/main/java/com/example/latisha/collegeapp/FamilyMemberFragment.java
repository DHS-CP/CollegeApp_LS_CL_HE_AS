package com.example.latisha.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


/**
 * Created by Latisha on 12/4/17.
 */

    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_family_member, two, false);

        //2.1.5 step 11 in lines 34-41 below

        final TextView mFirstNameText = rootView.findViewById(R.id.FirstNameText);
        final TextView mLastNameText = rootView.findViewById(R.id.LastNameText);

        //2.1.5 step 15-17 implemented in lines 39-57 below
        final EditText mFirstNameEdit = rootView.findViewById(R.id.FirstNameEdit);
        final EditText mLastNameEdit = rootView.findViewById(R.id.LastNameEdit);

        Button mSumbitButton = (Button) rootView.findViewById(R.id.mSubmitButton);

        mFirstNameText.setText(mMember.getFirstName());
        mLastNameText.setText(mMember.getLastName());
        mFirstNameEdit.setText(mMember.getFirstName());
        mLastNameEdit.setText(mMember.getLastName());

        mSumbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMember.setFirstName(mFirstNameEdit.getText().toString());
                mMember.setLastName(mLastNameEdit.getText().toString());
                mFirstNameText.setText(mMember.getFirstName());
                mLastNameText.setText(mMember.getLastName());
            }
        });
        return rootView;
    }
}
