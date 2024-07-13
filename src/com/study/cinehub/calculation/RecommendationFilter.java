package com.study.cinehub.calculation;

import com.study.cinehub.interfaces.Classification;

public class RecommendationFilter {
    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Best Titles");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Well rated");
        } else {
            System.out.println("Add to watch later");
        }
    }
}
