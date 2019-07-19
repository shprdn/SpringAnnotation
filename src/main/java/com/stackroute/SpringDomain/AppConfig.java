package com.stackroute.SpringDomain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
   //bean for actor 1
    @Bean 
    public Actor actor1()
    {
        Actor actor1 = new Actor();
        actor1.setName("ShahRukh Khan");
        actor1.setGender("Male");
        actor1.setAge(53);
        return actor1;
    }
     //bean for actor 2
    @Bean
    public Actor actor2()
    {
        Actor actor2 = new Actor();
        actor2.setName("Kartik Aaryan");
        actor2.setGender("Male");
        actor2.setAge(28);
        return actor2;
    }
    // //bean for actor 3
    @Bean
    public Actor actor3()
    {
        Actor actor3 = new Actor();
        actor3.setName("Deepika Padukone");
        actor3.setGender("Female");
        actor3.setAge(32);
        return actor3;
    }
    //specifying the scope
     //bean for movie 
    @Scope("prototype")
    @Bean
    public Movie movie(){
        Movie m = new Movie();
        m.setActor1(actor1());
        m.setActor2(actor2());
        m.setActor3(actor3());
        return m;
    }

}
