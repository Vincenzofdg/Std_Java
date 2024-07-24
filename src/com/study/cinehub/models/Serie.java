package com.study.cinehub.models;

import com.study.cinehub.interfaces.Classification;

public class Serie extends Title implements Classification {
    private int seasons;
    private int epPerSeason;
    private int minutesPerEp;
    private boolean active;

    // This constructor must have the attributes from de super (TITLE)
    public Serie (String name, String description, int releaseYear, int epPerSeason, int seasons, int minutesPerEp) {
        super(name, description, releaseYear);

        this.epPerSeason = epPerSeason;
        this.seasons = seasons;
        this.minutesPerEp = minutesPerEp;

        this.setTimeMinute();
    }

    // Getters
    public int getSeasons() {
        return seasons;
    }

    public int getEpPerSeason() {
        return epPerSeason;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public boolean isActive() {
        return active;
    }

    // Setters
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpPerSeason(int epPerSeason) {
        this.epPerSeason = epPerSeason;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int getTimeMinute() {
        return seasons * epPerSeason * minutesPerEp;
    }

    public void setTimeMinute() {
        int totalCalc = seasons * epPerSeason * minutesPerEp;
        super.setTimeMinute(totalCalc);
    }

    public void showTitle() {
        super.showTitle();

        System.out.println("Number os season: " + seasons);
        System.out.println("Ep per season: " + epPerSeason);
        System.out.println("Minutes per EP: " + minutesPerEp);
        System.out.println("Is active: " + active);
    }

    @Override
    public int getClassification() {
        return (int) (5 * getRateAvarage()) / 10;
    }
}
