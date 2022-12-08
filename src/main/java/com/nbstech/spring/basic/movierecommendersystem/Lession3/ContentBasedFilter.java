package com.nbstech.spring.basic.movierecommendersystem.Lession3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter  implements MovieFilter {

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"ContentBasedFilter", "Happy Feet", "Ice Age", "Shark Tale"};
    }
}
