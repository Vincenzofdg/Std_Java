public class Film {
    String name;
    String description;
    int timeMinute;
    int releaseYear;
    boolean plan;
    private float rate;
    private int totalRate;

    void showFilmFile () {
        System.out.println("Film name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    void rateMovie (int currentRate) {
        rate += currentRate;
        totalRate++;
    }

    float rateAvg () {
        return rate / totalRate;
    }

    int getTotalRate () {
        return totalRate;
    }
}
