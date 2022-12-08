package com.nbstech.spring.basic.movierecommendersystem.Lession3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Movierecommender {

    @Autowired
    @Qualifier("cuong")
    MovieFilter collaborativeFilter;


//    public Movierecommender(MovieFilter movieFilter) {
//        this.movieFilter = movieFilter;
//    }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = collaborativeFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
