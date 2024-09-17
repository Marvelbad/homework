package com.mypractice.skyscraper3;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
}
