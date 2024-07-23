import com.study.cinehub.calculation.RecommendationFilter;
import com.study.cinehub.calculation.SumTime;
import com.study.cinehub.models.Film;
import com.study.cinehub.models.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film firstFilm = new Film("The Lord of the Rings");
        Serie newSerie = new Serie();

        // The Lord of the Rings (Film)
//        firstFilm.setName("The Lord of the Rings");
//        firstFilm.setDescription("In the Second Age of Middle-earth, the lords of Elves, Dwarves, and Men are given Rings of Power. Unbeknownst to them, the Dark Lord Sauron forges the One Ring in Mount Doom, instilling into it a great part of his power to dominate the other Rings and conquer Middle-earth.");
//        firstFilm.setReleaseYear(2001);
//        firstFilm.setOnPlan(true);
//        firstFilm.setRate(835);
//        firstFilm.setTotalRate(87);
//        firstFilm.setTimeMinute(558);

        // Interstellar (Film)
//        secondFilm.setName("Interstellar");
//        secondFilm.setDescription("A team travels through a wormhole to find a new habitable planet for humanity.");
//        secondFilm.setReleaseYear(2014);
//        secondFilm.setOnPlan(true);
//        secondFilm.setRate(735);
//        secondFilm.setTotalRate(77);
//        secondFilm.setTimeMinute(558);

        secondFilm.setDirector("Christopher Nolan");

        // Dr. Stone (Series)
        newSerie.setName("Dr. Stone");
        newSerie.setDescription("A anime about exploration and science.");
        newSerie.setReleaseYear(2020);
        newSerie.setOnPlan(true);
        newSerie.setRate(28);
        newSerie.setTotalRate(5);

        newSerie.setSeasons(3);
        newSerie.setEpPerSeason(18);
        newSerie.setMinutesPerEp(58);
        newSerie.setActive(true);

        newSerie.setTimeMinute();

//        newFilm.showTitle();
//        newSerie.showTitle();

        SumTime calculator = new SumTime();
        calculator.addTitle(firstFilm);
        calculator.addTitle(secondFilm);
        calculator.addTitle(newSerie);

//        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();

//        filter.filter(firstFilm);
//        filter.filter(newSerie);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(firstFilm);
        filmList.add(secondFilm);

        System.out.println(filmList.size());
        System.out.println(filmList.get(1).getName());

        System.out.println(filmList.get(0).toString());


    }
}
