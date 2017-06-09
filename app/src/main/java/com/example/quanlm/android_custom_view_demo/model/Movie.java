package com.example.quanlm.android_custom_view_demo.model;

/**
 * Created by QuanLM on 6/9/2017.
 */

public class Movie {
    String movieThumb;
    String movieName;
    String movieDescription;

    public Movie(String movieThumb, String movieName, String movieDescription) {
        this.movieThumb = movieThumb;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
    }

    public String getMovieThumb() {
        return movieThumb;
    }

    public void setMovieThumb(String movieThumb) {
        this.movieThumb = movieThumb;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }
}
