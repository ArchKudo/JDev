package org.deen;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private String artistName;
    private LinkedList<Song> tracks = new LinkedList<>();

    Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
    }

    public void addSong(String songTitle, double timeDuration) {
        tracks.add(new Song(songTitle, timeDuration));
    }

    public void playAlbum(boolean reverse) {
        System.out.println("Playing album: " + albumName + " by " + artistName);
        if (reverse) {
            ListIterator<Song> iterator = tracks.listIterator(tracks.size() - 1);
            while (iterator.hasPrevious()) {
                Song song = iterator.previous();
                System.out.println("Playing " + song.getSongTitle() + " for " + song.getTimeDuration() + " minutes.");
            }
        } else {
            ListIterator<Song> iterator = tracks.listIterator(0);
            while (iterator.hasNext()) {
                Song song = iterator.next();
                System.out.println("Playing " + song.getSongTitle() + " for " + song.getTimeDuration() + " minutes.");
            }
        }
    }

}

class Song {

    private String songTitle;
    private double timeDuration;

    Song(String songTitle, double timeDuration) {
        this.songTitle = songTitle;
        this.timeDuration = timeDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public double getTimeDuration() {
        return timeDuration;
    }
}
