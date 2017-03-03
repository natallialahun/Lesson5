package com.epam.lesson5;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.*;

/**
 * Created by Natallia_Lahun on 02/23/2017.
 */
public class Note implements Comparator<Note>{
    private String lastName;
    private String firstName;
    private String phoneNumber;

    public Note(String lastName, String firstName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }


    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (!(o instanceof Note)) {
            return false;
        }

        Note note = (Note) o;
        return (lastName.equals(note.lastName) && (firstName.equals(note.firstName)) && (phoneNumber.equals(phoneNumber)));
    }

    @Override
    public String toString () {
        return lastName+" "+ firstName + ": phone number: " + phoneNumber;
    }

    @Override
    public int hashCode () {
        final int code = 31;
        return lastName.hashCode()*code + firstName.hashCode()*code + phoneNumber.hashCode()*code;
    }

    @Override
    public int compare(Note note, Note note1){
       return note.hashCode()-note1.hashCode();
    }



}
