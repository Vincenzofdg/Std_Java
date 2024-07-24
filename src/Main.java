import com.study.cinehub.calculation.RecommendationFilter;
import com.study.cinehub.calculation.SumTime;
import com.study.cinehub.models.Film;
import com.study.cinehub.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film firstFilm = new Film(
                "The Lord of the Rings",
                "In the Second Age of Middle-earth, the lords of Elves, Dwarves, and Men are given Rings of Power. Unbeknownst to them, the Dark Lord Sauron forges the One Ring in Mount Doom, instilling into it a great part of his power to dominate the other Rings and conquer Middle-earth.",
                2001,
                228
        );

        Film secondFilm = new Film(
                "Interstellar",
                "A team travels through a wormhole to find a new habitable planet for humanity.",
                2014,
                169
        );

        Serie newSerie = new Serie(
                "Dr. Stone",
                "A anime about exploration and science.",
                2020,
                17,
                3,
                29
        );

        // SumTitle
        SumTime calculator = new SumTime();

        calculator.addTitle(firstFilm);
        calculator.addTitle(secondFilm);
        calculator.addTitle(newSerie);

        calculator.showTotalTime();

        // RecommendationFilter
        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(firstFilm);
        filter.filter(newSerie);

        ArrayList<Film> filmList = new ArrayList<>();
        // add is a method os ArrayList
        filmList.add(firstFilm);
        filmList.add(secondFilm);

        System.out.println("Film list has "
                + filmList.size() +
                " titles. The last one is "
                + filmList.get(0).toString()
                + " and the first is "
                + filmList.get(1).toString()
        );
    }
}
