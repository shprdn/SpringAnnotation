package com.stackroute.SpringDomain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //creating actor beans for Actor class
    @Bean
    public Actor actor1()
    {
        Actor actor1 = new Actor("ShahRukh Khan","Male",53);
        return actor1;
    }
    @Bean
    public Actor actor2()
    {
        Actor actor2 = new Actor("Kartik Aaryan","Male",28);
        return actor2;
    }
    @Bean
    public Actor actor3()
    {
        Actor actor3 = new Actor("Deepika Padukone","Female",32);
        return actor3;
    }
    //creating bean for movie class
    @Scope("prototype")
    @Bean
    public Movie movie(){
        Movie m = new Movie(actor1(),actor2(),actor3());
        return m;
    }

}
