package org.deen;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /* A doubly linked list */
        // Each node contains reference to the previous as well as next location

        // Creating a new linked list
        LinkedList<String> places = new LinkedList<>();
        places.add("Japan");
        places.add("Sydney");
        places.add("USA");
        places.add("Iran");
        places.add("Hawaii");

        printLinkedList(places);

        // Adding element at position
        places.add(3, "South Africa");

        printLinkedList(places);

        // Removing an element from position
        places.remove(5);
        printLinkedList(places);

    }

    private static void printLinkedList(LinkedList<String> linkedList) {
        // Iterate over a collection
        Iterator<String> iterator = linkedList.iterator();
        // hasNext - Checks whether next element exists
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("~~~ END ~~~");
    }
}
