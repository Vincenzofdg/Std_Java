package com.study.cinehub.models;

public class Film {
    private String name;
    private String description;
    private int timeMinute;
    private int releaseYear;
    private boolean plan;
    private float rate;
    private int totalRate;

    public void showFilmFile () {
        System.out.println("Film name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void rateMovie (int currentRate) {
        rate += currentRate;
        totalRate++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float rateAvg () {
        return rate / totalRate;
    }

    public int getTotalRate () {
        return totalRate;
    }
}
