package com.example.latisha.collegeapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import java.util.Date;


/**
 * Created by Latisha on 12/5/17.
 */
//2.1.4 step 28 is this whole file
public class ProfileFragment extends Fragment{

    TextView mFirstName;
    TextView mLastName;
    DatePicker date;

    //2.1.5 step 13 line 24
    public Profile mPerson = new Profile();
    
    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_profile, two, false);

        //2.1.5 step 13 in lines 31-33 below
        final TextView mFirstNameText = rootView.findViewById(R.id.FirstNameText);
        final TextView mLastNameText = rootView.findViewById(R.id.LastNameText);

        //2.1.5 step 19 implemented in lines 36-54 below
        final EditText mFirstNameEdit = rootView.findViewById(R.id.FirstNameEdit);
        final EditText mLastNameEdit = rootView.findViewById(R.id.LastNameEdit);
        //2.1.6 step 26
        final DatePicker dateEdit = rootView.findViewById(R.id.datePicker);

        Button mSumbitButton = (Button) rootView.findViewById(R.id.mSubmitButton);

        mFirstNameText.setText(mPerson.getFirstName());
        mLastNameText.setText(mPerson.getLastName());
        mFirstNameEdit.setText(mPerson.getFirstName());
        mLastNameEdit.setText(mPerson.getLastName());

        mSumbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPerson.setFirstName(mFirstNameEdit.getText().toString());
                mPerson.setLastName(mLastNameEdit.getText().toString());
                mFirstNameText.setText(mPerson.getFirstName());
                mLastNameText.setText(mPerson.getLastName());
            }
        });
        return rootView;
    }
}
