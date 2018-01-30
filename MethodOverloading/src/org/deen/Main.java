package org.deen;

public class Main {

    public static void main(String[] args) {

        display("Ajay", 20, 4221);
        display("Vijay");

        boolean eligibleCitizen = display("Marques", true);

        if (!eligibleCitizen) {
            System.out.println("Citizenship denied");
        }
    }

    // display #1
    private static void display(String nameOfPerson, int ageOfPerson, int uidOfPerson) {
        System.out.println("Name: " + nameOfPerson + "\n" +
                "Age: " + ageOfPerson + "\n" +
                "UID: " + uidOfPerson + "\n");
    }

    // display #2 - Changed parameters
    private static void display(String nameOfPerson) {
        System.out.println("Record for " + nameOfPerson + " is incomplete");
    }

    // display #3 - Change return value
    private static boolean display(String nameOfPerson, boolean appliedCitizenship) {
        System.out.println("Name of Person is " + nameOfPerson);
        return appliedCitizenship && nameOfPerson.length() < 5;
    }
}
