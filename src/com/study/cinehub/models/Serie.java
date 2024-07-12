package com.study.cinehub.models;

public class Serie extends Title {
    int seasons;
    int epPerSeason;
    int minutesPerEp;
    boolean active;

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
//        return super.getTimeMinute();
        return seasons * epPerSeason * minutesPerEp;
    }
}
