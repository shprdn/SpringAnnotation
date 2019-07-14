package com.stackroute;

import com.stackroute.SpringDomain.Actor;
import com.stackroute.SpringDomain.AppConfig;
import com.stackroute.SpringDomain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo
{
    public static void main(String[] args) {

        System.out.println("///////////////Using ApplicationContext/////////////");
        //ApplicationContext with Annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Actor actor1 = context.getBean("actor1",Actor.class);
        Actor actor2 = context.getBean("actor2",Actor.class);
        Actor actor3 = context.getBean("actor3",Actor.class);

        //displaying the three beans of actors
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);

        //creating movie bean
        Movie movie = context.getBean("movie",Movie.class);
        movie.display();

        //creating another movie bean for comparison
        Movie movie1 = context.getBean("movie",Movie.class);
        System.out.println("The equality result of two movies:");
        System.out.println(movie==movie1);

        //creating movie bean such that name = {movieA, movieB}
        Movie movieA = context.getBean("movieA",Movie.class);
        movieA.display();
        Movie movieB = context.getBean("movieB",Movie.class);
        movieB.display();

    }
}
