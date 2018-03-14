package films;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {
    private String title;
    private String description;
    private int releaseDate;
    private Director director;

    public Movie() {

    }

    public Movie(String title, String description, int releaseDate, Director director) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.director = director;
    }

}