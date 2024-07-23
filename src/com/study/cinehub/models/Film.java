package com.study.cinehub.models;

import com.study.cinehub.interfaces.Classification;

public class Film extends Title implements Classification {
    String director;

    // Constructor
    public Film(String name) {
        this.setName(name);
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
        return "Film: "  + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
