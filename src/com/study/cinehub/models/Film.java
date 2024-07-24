package com.study.cinehub.models;

import com.study.cinehub.interfaces.Classification;

public class Film extends Title implements Classification {
    String director;

    // This constructor must have the attributes from de super (TITLE)
    public Film (String name, String description, int releaseYear, int duration) {
        super(name, description, releaseYear);

        setTimeMinute(duration);
    }

    // Getters
    public String getDirector() {
        return director;
    }

    // Setters
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (5 * getRateAvarage()) / 10;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
