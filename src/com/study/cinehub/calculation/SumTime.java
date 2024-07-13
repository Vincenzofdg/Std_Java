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
}
