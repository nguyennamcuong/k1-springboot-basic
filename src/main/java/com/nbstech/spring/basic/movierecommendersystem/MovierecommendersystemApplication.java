package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.Lession3.Movierecommender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@SpringBootApplication
@ComponentScan
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//		ApplicationContext appContext = SpringApplication.run(MovierecommendersystemApplication.class, args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovierecommendersystemApplication.class);
		Movierecommender recommender = appContext.getBean(Movierecommender.class);

		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
		appContext.close();

	}
}
