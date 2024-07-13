package com.study.cinehub.models;

import com.study.cinehub.interfaces.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Serie serie;
    private int timesViewed;

    // Getters
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getTimesViewed() {
        return timesViewed;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setTimesViewed(int timesEvaluated) {
        this.timesViewed = timesEvaluated;
    }

    @Override
    public int getClassification() {
        if (timesViewed > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
