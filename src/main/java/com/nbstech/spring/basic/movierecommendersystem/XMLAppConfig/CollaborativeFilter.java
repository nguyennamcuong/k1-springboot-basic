package com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Qualifier("cuong")
//@Component
public class CollaborativeFilter implements MovieFilter {

//    @Override
    public String[] getRecommendations(String movie) {

        // logic of collaborative based filter

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
