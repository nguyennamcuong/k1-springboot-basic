package com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component
public class Movierecommender {

//    @Autowired
//    @Qualifier("cuong")
    MovieFilter movieFilter;


//    public Movierecommender(MovieFilter movieFilter) {
//        this.movieFilter = movieFilter;
//    }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = movieFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }

    public MovieFilter getMovieFilter() {
        return movieFilter;
    }

    public void setMovieFilter(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }
}
