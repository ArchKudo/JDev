package org.deen;

public class Main {

    public static void main(String[] args) {

        Computer abacus = new Computer("Abacus", 8, 0,
                true, "Calculations, Showing Off!");

        abacus.displaySpecs();

        DesktopPC ryzenBuild = new DesktopPC(800000000, 4000,
                true, "Linux", 16, "AMD");

        ryzenBuild.displaySpecs();


    }
}
