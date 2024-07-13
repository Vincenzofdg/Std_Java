package com.study.cinehub.models;

import com.study.cinehub.interfaces.Classification;

public class Film extends Title implements Classification {
    String director;

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
        return (int) getRateAvarage() / 2;
    }
}
