package com.epam.lesson5;

/**
 * Created by Natallia_Lahun on 02/21/2017.
 */
public class Task5 {

    public static void main(String[] args){
        Notebook notebook = new Notebook();
        notebook.add(new Note("Ivanov", "Ivan", "237489237589"));
        notebook.add(new Note("Petrov", "Ivan", "2373237589"));
        notebook.add(new Note("Anton", "Antonov", "35875897"));
        notebook.add(new Note("Petrov", "Petr", "1211233587"));

        notebook.sortByFirstName();
        System.out.println("Sorted by first name");
        for (Note note: notebook) {
            System.out.println(note);
        }

        String firstName = "Ivan";
        System.out.println("Search by FirstName = "+ firstName);
        for (Note note: notebook.getByFirstName(firstName)) {
            System.out.println(note);
        }
    }
}
