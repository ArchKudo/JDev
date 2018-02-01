package org.deen;

import java.util.Scanner;

public class Main {

    // Get user input
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize an array of size 10
        int[] newIntArray = new int[10];

        // Setting values
        newIntArray[5] = 10;
        System.out.println(newIntArray[5]);

        // A double array
        double[] newDoubleArray = {1d, 1.5d, 3d};

        for (int i = 0; i < newDoubleArray.length; i++) {
            System.out.println("Element " + i + " of array is " + newDoubleArray[i]);
        }

        System.out.println("~~~ Get Average ~~~");

        System.out.println(intArrAvg(getIntegers()));

        displayArr(sortArrays(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));

        // Multi-dimensional arrays
        int[][] scores = {{1, 2, 3}, {4, 5, 6}};
        for (int[] score : scores) {
            for (int val : score) {
                System.out.println("The value is " + val);
            }
        }

        // Discouraged array notation
        int badArray[] = {1, 2, 3};
        int[] superUglyArray[] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(java.util.Arrays.toString(badArray));
        System.out.println(java.util.Arrays.toString(superUglyArray[0]));
        System.out.println(java.util.Arrays.toString(superUglyArray[1]));
    }

    private static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " = " + arr[i]);
        }
    }

    private static int[] getIntegers() {
        System.out.println("Enter size of array");
        int sizeOfArray = sc.nextInt();
        System.out.println("Enter a list of " + sizeOfArray + " numbers.");
        int[] inputIntegers = new int[sizeOfArray];
        for (int i = 0; i < inputIntegers.length; i++) {
            inputIntegers[i] = sc.nextInt();
        }

        return inputIntegers;
    }

    private static double intArrAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }

    private static int[] sortArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(i, j, arr);
                }
            }
        }
        return arr;
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
