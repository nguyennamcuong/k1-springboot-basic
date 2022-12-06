package com.nbstech.spring.basic.movierecommendersystem.Lession2;

public class Movierecommender {

    MovieFilter movieFilter;

    public Movierecommender(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = movieFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
