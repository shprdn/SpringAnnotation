package com.stackroute.SpringDomain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    //constructor DI
    @Autowired
    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    //displaying the values of data variables of Actor class
    public void display()
    {
        System.out.println("Name is---"+actor1.getName()+"\n"+"Gender is---"+actor1.getGender()+"\n"+"Age is---"+actor1.getAge());
        System.out.println("Name is---"+actor2.getName()+"\n"+"Gender is---"+actor2.getGender()+"\n"+"Age is---"+actor2.getAge());
        System.out.println("Name is---"+actor3.getName()+"\n"+"Gender is---"+actor3.getGender()+"\n"+"Age is---"+actor3.getAge());

    }
}
