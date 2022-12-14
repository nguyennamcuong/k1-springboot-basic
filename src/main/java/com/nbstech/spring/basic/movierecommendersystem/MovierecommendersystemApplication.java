package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.ExternalProperty.Movierecommender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
@ComponentScan(basePackages = "com.nbstech.spring.basic.movierecommendersystem.ExternalProperty")
@PropertySource("classpath:app.properties")
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//		ApplicationContext appContext = SpringApplication.run(MovierecommendersystemApplication.class, args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovierecommendersystemApplication.class);
		//== XML App Config: load the configuration file
//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		Movierecommender recommender = appContext.getBean(Movierecommender.class);

		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
		System.out.println(recommender.getFavoriteMovie());
		appContext.close();

	}
}
