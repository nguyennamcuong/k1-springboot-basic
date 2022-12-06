package com.nbstech.spring.basic.movierecommendersystem.Lession1;

import com.nbstech.spring.basic.movierecommendersystem.Lession2.CollaborativeFilter;

public class Movierecommender {

    public Movierecommender(CollaborativeFilter collaborativeFilter) {
    }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
