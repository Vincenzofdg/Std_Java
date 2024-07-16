import com.study.cinehub.calculation.RecommendationFilter;
import com.study.cinehub.calculation.SumTime;
import com.study.cinehub.models.Film;
import com.study.cinehub.models.Serie;

public class Main {
    public static void main(String[] args) {
        Film newFilm = new Film();
        Serie newSerie = new Serie();

        // The Lord of the Rings (Film)
        newFilm.setName("The Lord of the Rings");
        newFilm.setDescription("In the Second Age of Middle-earth, the lords of Elves, Dwarves, and Men are given Rings of Power. Unbeknownst to them, the Dark Lord Sauron forges the One Ring in Mount Doom, instilling into it a great part of his power to dominate the other Rings and conquer Middle-earth.");
        newFilm.setReleaseYear(2001);
        newFilm.setOnPlan(true);
        newFilm.setRate(835);
        newFilm.setTotalRate(87);
        newFilm.setTimeMinute(558);

        newFilm.setDirector("Peter Jackson");

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
        calculator.addTitle(newFilm);
        calculator.addTitle(newSerie);

//        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();

        filter.filter(newFilm);

        filter.filter(newSerie);
    }
}
