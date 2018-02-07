package org.deen;

public class Printer {
    private int tonerLevel = 100;
    private int printCount = 0;
    private boolean isDuplex;

    Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    Printer() {
        this.isDuplex = false;
    }


    public void refillToner() {
        this.tonerLevel = 100;
    }

    public void printPages(int numberOfPages) {
        if (numberOfPages < 0 || tonerLevel - numberOfPages < 0) {
            System.out.println("Invalid number of pages!");
        }
        if (isDuplex) {
            printCount += numberOfPages % 2 == 0 ? (numberOfPages / 2) : (numberOfPages / 2 + 1);
        } else {
            printCount += numberOfPages;
        }
        tonerLevel -= numberOfPages;
    }

    public void displayState() {
        System.out.println("Number of Sheets printed: " + printCount + "\n" +
                "Toner Level: " + tonerLevel);
    }
}
