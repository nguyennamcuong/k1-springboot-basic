package com.nbstech.spring.basic.movierecommendersystem.Lession3;

public class ContentBasedFilter  implements MovieFilter {

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"ContentBasedFilter", "Happy Feet", "Ice Age", "Shark Tale"};
    }
}
