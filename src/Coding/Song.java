package Coding;

public class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;

        System.out.println("Song added: " + title + "-" + artist);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}