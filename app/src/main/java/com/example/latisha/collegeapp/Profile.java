package com.example.latisha.collegeapp;

import java.util.Date;

/**
 * Created by Latisha on 12/5/17.
 */
//2.1.4 step 33 creates Profile class
public class Profile {
    String firstName;
    String lastName;
    String date;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //2.1.5 step 12 implemented in lines 28-30 below
    public Profile() {
        firstName="Alan";
        lastName="Turing";
        date = "01-12-2017";

    }
}
