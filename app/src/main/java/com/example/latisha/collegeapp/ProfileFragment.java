package com.example.latisha.collegeapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Latisha on 12/5/17.
 */
//2.1.4 step 28 is this whole file
public class ProfileFragment extends Fragment {
    //2.1.5 step 13 implemented in lines 17-22 below
    TextView mFirstNameText;
    EditText mFirstNameEdit;
    TextView mLastNameText;
    EditText mLastNameEdit;

    Profile mPerson =new Profile();

    @Override
    public View onCreateView(LayoutInflater one, ViewGroup two , Bundle three) {
        super.onCreateView(one, two, three);
        View rootView = one.inflate(R.layout.fragment_profile, two, false);

        //2.1.5 step 13 in lines 29-36 below
        TextView mFirstNameText = rootView.findViewById(R.id.FirstNameText);
        EditText mFirstNameEdit;
        TextView mLastNameText = rootView.findViewById(R.id.LastNameText);
        EditText mLastNameEdit;


        mFirstNameText.setText(mPerson.getFirstName());
        mLastNameText.setText(mPerson.getLastName());

        return rootView;
    }
}
