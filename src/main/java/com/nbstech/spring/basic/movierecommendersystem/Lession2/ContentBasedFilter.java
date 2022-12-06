package com.nbstech.spring.basic.movierecommendersystem.Lession2;

public class ContentBasedFilter extends CollaborativeFilter implements MovieFilter {

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"ContentBasedFilter", "Happy Feet", "Ice Age", "Shark Tale"};
    }
}
