package entity;

import java.util.ArrayList;
import java.util.Date;

public class Movie {


    private boolean adult;
    private String backdrop_path;
    private ArrayList<Integer> genre_ids;
    private int id;
    private String original_language;
    private String original_title;
    private String overview;
    private float popularity;
    private String poster_path;
    private Date release_date;
    private String title;
    private boolean video;
    private float vote_average;
    private int vote_account;
    public Movie(String title,
                 Boolean adult,
                 int id,
                 ArrayList<Integer> genre_ids,
                 String original_language,
                 String original_title,
                 String overview,
                 float popularity,
                 Date release_date,
                 String poster_path,
                 boolean video,
                 float vote_average,
                 int vote_account,
                 String backdrop_path) {
        this.poster_path = poster_path;
        this.video = video;
        this.id = id;
        this.title = title;
        this.adult = adult;
        this.genre_ids = genre_ids;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.release_date = release_date;
        this.backdrop_path = backdrop_path;
        this.vote_account = vote_account;
        this.vote_average = vote_average;

    }

    public static MovieBuilder builder() {
        return new MovieBuilder();
    }

    public static class MovieBuilder {

        private boolean video;
        private float vote_average;
        private int vote_account;
        private String backdrop_path;
        private String poster_path;
        private boolean adult;
        private ArrayList<Integer> genre_ids;
        private int id;
        private String original_language;
        private String original_title;
        private String overview;
        private float popularity;
        private Date release_date;
        private String title;

        MovieBuilder() {
        }

        public MovieBuilder adult(boolean adult) {
            this.adult = adult;
            return this;
        }
        public MovieBuilder genre_ids(ArrayList<Integer> genre_ids) {
            this.genre_ids = genre_ids;
            return this;
        }
        public MovieBuilder id(int id) {
            this.id = id;
            return this;
        }
        public MovieBuilder original_language(String original_language) {
            this.original_language = original_language;
            return this;
        }
        public MovieBuilder original_title(String original_title) {
            this.original_title = original_title;
            return this;
        }
        public MovieBuilder overview(String overview) {
            this.overview = overview;
            return this;
        }
        public MovieBuilder popularity(float popularity) {
            this.popularity = popularity;
            return this;
        }
        public MovieBuilder release_date(Date release_date) {
            this.release_date = release_date;
            return this;
        }

        public MovieBuilder title(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder poster_path(String poster_path) {
            this.poster_path = poster_path;
            return this;
        }
        public MovieBuilder video(boolean video) {
            this.video = video;
            return this;
        }
        public MovieBuilder vote_average(float vote_average) {
            this.vote_average = vote_average;
            return this;
        }
        public MovieBuilder vote_account(int vote_account) {
            this.vote_account = vote_account;
            return this;
        }
        public MovieBuilder backdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
            return this;
        }
        public Movie build() {
            return new Movie(title, adult, id, genre_ids,
                    original_language, original_title, overview,
                    popularity, release_date, poster_path, video,
                    vote_average, vote_account, backdrop_path);
        }
    }


    @Override
    public String toString() {
        return "Grade{" +
                "title='" + title + '\'' +
                ", overview='" + overview ;}

    public String gettitle() {
        return title;
    }

    public String getoverview() {
        return overview;
    }




}

