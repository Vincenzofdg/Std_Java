package com.study.cinehub.calculation;
import com.study.cinehub.models.Title;

public class SumTime {
    private int totalTime;

    public int getTotalTime () {
        return  totalTime;
    }

    public void addTitle(Title title) {
        this.totalTime += title.getTimeMinute();
    }

    public void showTotalTime () {
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}
