package Coding;

public class Player {
    private Song song;

    public Player(Song song) {
        this.song = song;
    }

    public void play() {
        System.out.println("Now playing: " + song.getTitle() + "-" + song.getArtist());
    }
}