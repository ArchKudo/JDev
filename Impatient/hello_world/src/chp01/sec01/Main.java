package chp01.sec01;

import java.util.Random; // Random class belongs to the java.util package

public class Main {

    // Executed first when the program is run
    // static indicates function does not operate on any object
    public static void main(String[] args) {

        // System.out is an object representing stdout
        // out is an instance of PrintStream class
        // println is an instance method of the PrintStream class
        // Instance methods are accessed using the `.` notation
        // Thus we've Object.method(arguments);
        // Here the argument is "Hello, World!", an instance of the class String.
        System.out.println("Hello, World!");

        // Applying instance method `length()` on instance of String "Hello, World!"
        // Returns length of string, which gets printed to stdout
        System.out.println("Hello, World!".length()); // Prints 13

        // Unlike System.out and Strings we need to construct(create instance) of other objects
        // new Random() constructs an instance of class Random
        // Then we apply the nextInt instance method on it!
        System.out.println("Freshly baked random integer: " + new Random().nextInt());

        // Above is similar to:
        Random randomGenerator = new Random();
        System.out.println("randomGenerator says: " + randomGenerator.nextInt());

        System.out.println("and then: " + randomGenerator.nextInt());

        // Primitive types
        // -- end --

        // Defining constants
        // final keyword is used for declaring constants
        final int PERFECTLY_RANDOM = 4;
        System.out.println("A new random number is " + PERFECTLY_RANDOM);

        // We can defer(delay) initialization of finals
        final boolean OUT; // Initialization here

        final boolean IN = randomGenerator.nextBoolean();

        OUT = !IN; // Value assigned here

        System.out.println("IN is " + IN + "OUT is " + OUT);

        // Using Enums
        // Are always static hence cannot be defined inside methods
        // However variable declaration is possible at method level
        WeekDay startDay = WeekDay.MONDAY;
        WeekDay endDay = WeekDay.SUNDAY;
        System.out.println("Monday: " + startDay + "Sunday: " + endDay);

        // All the constants of an enum type can be obtained by calling the implicit values() method
        // Implicit Methods? WTF, Java?
        for (WeekDay i : WeekDay.values()) {
            System.out.println(i);
        }

        // Operators
        // -- end --

        // Modulus
        System.out.println("Remainder of 3/4: " + 3 % 4);
        System.out.println("Remainder of -3/4: " + -3 % 4);
        System.out.println("Or for only positive values allowed: " + ((-3 % 4) + 4));
        // Or using Math.floorMod
        System.out.println("3 % 4: " + Math.floorMod(3, 4));
        System.out.println("-3 % 4: " + Math.floorMod(-3, 4));

        // Power
        System.out.println("2^4: " + Math.pow(2, 4));
        System.out.println("2^0.5: " + Math.pow(2, 0.5));
        // Or using Math.sqrt
        System.out.println("2^0.5: " + Math.sqrt(2));

        // Getting minimum and maximum of two numbers
        System.out.println("The minimum of 3, 4 is " + Math.min(3, 4));
        System.out.println("The maximum of -3, -4 is " + Math.max(-3, -4));
        // Equivalent to:
        System.out.println("The minimum of 3, 4 is " + (3 < 4 ? 3 : 4));
        System.out.println("The maximum of 3, 4 is " + (-3 > -4 ? -3 : -4));

        // Scientific Constants in Math library include:
        System.out.println("Pi: " + Math.PI);
        System.out.println("e: " + Math.E);

        // BigIntegers and BigDecimals

    }

    // A list of finals can be declared using enums
    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
