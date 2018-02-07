package org.deen;

public class Main {

    public static void main(String[] args) {

        PCCase pcCase = new PCCase(
                "NZXT",
                "MANTA",
                230,
                new Dimension(200, 500, 150));

        Monitor monitor = new Monitor(
                "SHARP",
                "SHP1440",
                new Resolution(1920, 1080, true),
                120,
                1.0);

        Motherboard motherboard = new Motherboard(
                "Intel",
                "ICELAKE",
                true,
                4,
                16);

        Computer computer = new Computer(pcCase, monitor, motherboard);

        computer.turnON();

        Computer genericComputer = new Computer();

        genericComputer.display();

    }
}
