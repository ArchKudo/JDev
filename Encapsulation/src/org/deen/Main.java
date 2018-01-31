package org.deen;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer dPrinter = new Printer(true);

        printer.printPages(100);
        printer.displayState();

        dPrinter.printPages(100);
        dPrinter.displayState();

        dPrinter. refillToner();
        dPrinter.displayState();

    }
}
