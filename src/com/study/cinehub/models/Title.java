package com.study.cinehub.models;

public class Title {
    private String name;
    private String description;
    private int releaseYear;
    private boolean onPlan;
    private float rate;
    private int totalRate;
    private int timeMinute;

    public void showTitle () {
        System.out.println("Film name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void rateTitle (int newRate) {
        rate += newRate;
        totalRate++;
    }

    public float getRateAvarage () {
        return rate / totalRate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isOnPlan() {
        return onPlan;
    }

    public float getRate() {
        return rate;
    }

    public int getTotalRate() {
        return totalRate;
    }

    public int getTimeMinute() {
        return timeMinute;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setOnPlan(boolean onPlan) {
        this.onPlan = onPlan;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setTotalRate(int totalRate) {
        this.totalRate = totalRate;
    }

    public void setTimeMinute(int timeMinute) {
        this.timeMinute = timeMinute;
    }
}
