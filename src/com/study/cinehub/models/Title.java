package com.study.cinehub.models;

import java.text.DecimalFormat;

public class Title {
    private String name;
    private String description;
    private int releaseYear;
    private boolean onPlan;
    private float rate;
    private int totalRate;
    private int timeMinute;

    public Title (String name, String description, int releaseYear) {
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public void showTitle () {
        System.out.println("Title name: " + name);
        System.out.println("Description: " + description);

        System.out.println("Released year: " + releaseYear);
        System.out.println("Is on plan: " + onPlan);
        System.out.println("Rate: " + rate + "/10");
        System.out.println("Total Rate: " + totalRate);
        System.out.println("Duration: " + timeMinute);
    }

    public void rateTitle (int newRate) {
        rate += newRate;
        totalRate++;
    }

    public float getRateAvarage () {
        DecimalFormat df = new DecimalFormat("0.00");

        float notFormatRate = (rate / totalRate);
        String formateRateString = df.format(notFormatRate);

        return Float.parseFloat(formateRateString);
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
