import com.study.cinehub.models.Film;

public class Main {
    public static void main(String[] args) {
        Film movie = new Film();

        movie.name = "The Lord of the Rings: The Fellowship of the Ring";
        movie.releaseYear = 2002;
        movie.description = "Is renowned for its rich storytelling, complex characters, and detailed world-building. It has significantly influenced the fantasy genre and was adapted into a critically acclaimed film in 2001.";
        movie.timeMinute = 178;
        movie.plan = true;

        movie.showFilmFile();

        movie.rateMovie(70);
        movie.rateMovie(40);
        movie.rateMovie(67);
        movie.rateMovie(59);

        System.out.println(movie.getTotalRate());
        System.out.println(movie.rateAvg());
    }
}
