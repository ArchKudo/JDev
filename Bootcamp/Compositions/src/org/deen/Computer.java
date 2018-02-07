package org.deen;

public class Computer {
    private PCCase pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    Computer(PCCase pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    Computer() {
        this(new PCCase(),
                new Monitor(),
                new Motherboard());
    }

    public void display() {
        pcCase.display();
        monitor.display();
        motherboard.display();
    }

    public void turnON() {
        pcCase.powerON();
        drawLogo();
        motherboard.loadUtility("GRUB");
    }

    private void drawLogo() {
        monitor.drawImage("Potato Inside!");
    }
}
