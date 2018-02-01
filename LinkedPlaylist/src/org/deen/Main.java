package org.deen;

public class Main {

    public static void main(String[] args) {
        Album ram = new Album("Random Access Memories", "Daft Punk");
        ram.addSong("Instant Crush", 8.0d);
        ram.addSong("Touch", 4.5d);
        ram.addSong("Motherboard", 3.0d);
        ram.addSong("Moroder", 5.0d);

        ram.playAlbum(false);
        ram.playAlbum(true);
    }
}
