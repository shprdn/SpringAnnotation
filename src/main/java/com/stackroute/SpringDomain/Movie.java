package com.stackroute.SpringDomain;

public class Movie {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    //setter for injection


    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }
        //displaying the actor members
    public void display()
    {
        System.out.println("Name is---"+actor1.getName()+"\n"+"Gender is---"+actor1.getGender()+"\n"+"Age is---"+actor1.getAge());
        System.out.println("Name is---"+actor2.getName()+"\n"+"Gender is---"+actor2.getGender()+"\n"+"Age is---"+actor2.getAge());
        System.out.println("Name is---"+actor3.getName()+"\n"+"Gender is---"+actor3.getGender()+"\n"+"Age is---"+actor3.getAge());

    }
}
