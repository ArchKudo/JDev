package org.deen;

public class Main {

    public static void main(String[] args) {

        /* Primitive data types */

        /* Integers */
        // Size = 32 bits
        // Most types get converted into integers
        int minValueInt = -2147483648;
        int maxValueInt = 2147483647;
        System.out.println("Minimum value of integers is: " + minValueInt);
        System.out.println("Maximum value of integers is: " + maxValueInt);

        // Or a more readable form
        minValueInt = -2_147_483_648;
        maxValueInt = 2_147_483_647;
        System.out.println("Same min as previous: " + minValueInt);
        System.out.println("Same max as previous: " + maxValueInt);

        /* bytes */
        // Size = 8 bits
        byte minValueByte = -128;
        byte maxValueByte = 127;
        System.out.println("Min value for bytes is: " + minValueByte);
        System.out.println("Max value for bytes is: " + maxValueByte);

        // Doing operations on bytes require casting
        byte avgByte = (byte) ((minValueByte + maxValueByte) / 2);
        System.out.println("The average value is: " + avgByte);

        /* short */
        // Size = 16 bits
        short minValueShort = -32768;
        short maxValueShort = 32767;
        System.out.println("Min value for short is: " + minValueShort);
        System.out.println("Max value for short is: " + maxValueShort);

        // short type also require casting
        short avgShort = (short) ((minValueShort + maxValueShort) / 2);
        System.out.println("The average value is: " + avgShort);


        // Size of various primitive types
        System.out.println("Width of Integer is: " + Integer.SIZE);
        System.out.println("Width of Byte is: " + Byte.SIZE);
        System.out.println("Width of Short is: " + Short.SIZE);

        /* long */
        // Size = 64 bits
        // Notice the 'L' at the end
        long myLongValue = 100L;
        System.out.println("mylongValue has value: " + myLongValue);

        /* float */
        // Size = 32
        float newFloatValue = 5.0f;
        System.out.println("Value of float is: " + newFloatValue);

        /* double */
        // Size = 64
        // double is for double the precision of float
        double newDoubleValue = 5.4d;

        // float requires cast as Java defaults to double
        float otherFloatValue = (float) 5.4;

        // Division with floats and doubles and ints
        // ints = 0 precision
        // float = 7 digits of precision
        // double = 16 digits of precision
        float quotientFloat = 5f / 3f;
        double quotientDouble = 5d / 3d;
        int quotientInt = 5 / 3;
        System.out.println("Float Divison = " + quotientFloat +
                " | " + "Double Divison = " + quotientDouble +
                " | " + "Integer Divison = " + quotientInt);

        // Exercise
        double inKgs = toKilograms(12.32d);
        System.out.println("Weight in kg is: " + inKgs);

        /* char */
        // Size = 1 bit
        // Stores a single character
        char singleCharTick = '✔';
        System.out.println(singleCharTick + singleCharTick + singleCharTick);
        char copyrightSymbol = '\u00AE';
        System.out.println("Javasaurus" + copyrightSymbol);

        /* boolean */
        // Size = 1 bit
        boolean truthValue = true;
        boolean falseValue = false;
        boolean conditionValue = 12 > 2;
        System.out.println(truthValue + " " + falseValue + " "
                + conditionValue);

        // String is a sequence of characters
        // Not exactly a primitive
        String myString = "Java is pronounced as Yava...";
        System.out.println(myString);

        // Can append other primitive types to strings
        System.out.println(myString + " " + 100 + "% legit!");
    }

    static double toKilograms(double weightInPounds) {
        return 0.45359237d * weightInPounds;
    }
}
