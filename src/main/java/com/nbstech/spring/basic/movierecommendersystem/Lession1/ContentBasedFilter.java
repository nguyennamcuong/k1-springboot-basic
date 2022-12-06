package com.nbstech.spring.basic.movierecommendersystem.Lession1;

import com.nbstech.spring.basic.movierecommendersystem.Lession2.CollaborativeFilter;

public class ContentBasedFilter extends CollaborativeFilter {

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
