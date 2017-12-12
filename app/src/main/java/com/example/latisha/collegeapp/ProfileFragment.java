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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by Latisha on 12/5/17.
 */
//2.1.4 step 28 is this whole file
public class ProfileFragment extends Fragment{

    TextView mFirstName;
    TextView mLastName;
    DatePicker date;
    TextView mSetDate;

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
        //test
        final Calendar c = Calendar.getInstance();

        final int maxYear = c.get(Calendar.YEAR) - 20; // this year ( 2011 ) - 20 = 1991
        final int maxMonth = c.get(Calendar.MONTH);
        final int maxDay = c.get(Calendar.DAY_OF_MONTH);
        final int minYear = 1960;
        final int minMonth = 0; // january
        final int minDay = 25;


        //2.1.6 step 26
        date = (DatePicker) rootView.findViewById(R.id.dateofbirthPicker);
        /*date.init(maxYear - 10, maxMonth, maxDay, new DatePicker.OnDateChangedListener()
        {

            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                if (year < minYear)
                    view.updateDate(minYear, minMonth, minDay);

                if (monthOfYear < minMonth && year == minYear)
                    view.updateDate(minYear, minMonth, minDay);

                if (dayOfMonth < minDay && year == minYear && monthOfYear == minMonth)
                    view.updateDate(minYear, minMonth, minDay);


                if (year > maxYear)
                    view.updateDate(maxYear, maxMonth, maxDay);

                if (monthOfYear > maxMonth && year == maxYear)
                    view.updateDate(maxYear, maxMonth, maxDay);

                if (dayOfMonth > maxDay && year == maxYear && monthOfYear == maxMonth)
                    view.updateDate(maxYear, maxMonth, maxDay);
            }}); // BirthDateDP.init()*/
        int day = date.getDayOfMonth();
        int month = date.getMonth() + 1;
        int year = date.getYear();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy");
        final Date d = new Date(year - 1901, month, day);
        final String strDate = dateFormatter.format(d);

        final TextView mDateText = rootView.findViewById(R.id.DateText);


        Button mSumbitButton = (Button) rootView.findViewById(R.id.mSubmitButton);

        mFirstNameText.setText(mPerson.getFirstName());
        mLastNameText.setText(mPerson.getLastName());
        mFirstNameEdit.setText(mPerson.getFirstName());
        mLastNameEdit.setText(mPerson.getLastName());
        mDateText.setText(mPerson.getDate());

        mSumbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPerson.setFirstName(mFirstNameEdit.getText().toString());
                mPerson.setLastName(mLastNameEdit.getText().toString());
                mFirstNameText.setText(mPerson.getFirstName());
                mLastNameText.setText(mPerson.getLastName());
                mDateText.setText(strDate);

            }
        });
        return rootView;
    }
}
