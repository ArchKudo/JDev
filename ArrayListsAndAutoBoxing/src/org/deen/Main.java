package org.deen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* Arraylists can be thought of as resizable arrays */
        // Creating a new ArrayList
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Homo Sapiens");
        stringArrayList.add("Cro-Magnon Man");
        System.out.println(stringArrayList.toString());

        // More Methods

        // Get Index
        System.out.println(stringArrayList.indexOf("Homo Sapiens"));

        // Get value
        System.out.println(stringArrayList.get(0));

        // Check for value
        System.out.println(stringArrayList.contains("Cro-Magnon Man"));

        // Get size
        System.out.println(stringArrayList.size());

        // Convert to arr
        String[] strings = stringArrayList.toArray(new String[stringArrayList.size()]);
        System.out.println(Arrays.toString(strings));

        // But arraylist don't work with primitive types
        // ArrayList<int> ints = new ArrayList<int>(); // This doesn't work

        // However we can use wrapper classes
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // Autoboxing
        // Converting primitive types to classes
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        // Unboxing
        // Get primitives from wrapper classes
        for (Integer anIntegerArrayList : integerArrayList) {
            System.out.printf(anIntegerArrayList.intValue() + " ");
        }
        System.out.println();
        
        // Or using the easier method
        Integer integerValue = 12; // Equivalent to Integer.valueOf(12);
        System.out.println("Value of Integer is " + integerValue);

        // Therefore, this works
        for (int i = 10; i < 20; i++) {
            integerArrayList.add(i);

        }

        System.out.println(integerArrayList);
    }
}
