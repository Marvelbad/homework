package Coding;

public class Solution {
    public static void main(String[] args) {
        Song song = new Song("Lose Yourself", "Eminem");
        Player player = new Player(song);
        player.play();
    }
}