package com.stackroute;

import com.stackroute.SpringDomain.AppConfig;
import com.stackroute.SpringDomain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo
{
    public static void main(String[] args) {

        System.out.println("///////////////Using ApplicationContext/////////////");
        //ApplicationContext with Annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = context.getBean(Movie.class);
        movie.display();


    }
}
