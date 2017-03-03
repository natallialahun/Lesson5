package com.epam.lesson5;

import java.util.*;


/**
 * Created by Natallia_Lahun on 02/23/2017.
 */
public class Notebook extends ArrayList<Note>{


    public void sortByLastName(){
       Collections.sort(this,Comparator.comparing(Note::getLastName));
    }

    public void sortByFirstName(){
        Collections.sort(this,Comparator.comparing(Note::getFirstName));
    }

    public void sortByPhoneNumber(){
        Collections.sort(this,Comparator.comparing(Note::getPhoneNumber));
    }

    public List<Note> getByPhoneNumber(String phoneNumber){
        List<Note> result = new ArrayList<>();
        for (Note note: this) {
            if (note.getPhoneNumber().equals(phoneNumber)) {
                result.add(note);
            }

        }
        return result;
    }

    public List<Note> getByLastName(String lastName){
        List<Note> result = new ArrayList<>();
        for (Note note: this) {
            if (note.getLastName().equals(lastName)) {
                result.add(note);
            }

        }
        return result;
    }

    public List<Note> getByFirstName(String firstName){
        List<Note> result = new ArrayList<>();
        for (Note note: this) {
            if (note.getFirstName().equals(firstName)) {
                result.add(note);
            }

        }
        return result;
    }
}
