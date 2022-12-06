package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.Lession2.CollaborativeFilter;
import com.nbstech.spring.basic.movierecommendersystem.Lession2.ContentBasedFilter;
import com.nbstech.spring.basic.movierecommendersystem.Lession2.Movierecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
		//Movierecommender recommender = new Movierecommender();
		Movierecommender recommender = new Movierecommender(new ContentBasedFilter());
		//Movierecommender recommender = new Movierecommender(new CollaborativeFilter());
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));

	}
}
