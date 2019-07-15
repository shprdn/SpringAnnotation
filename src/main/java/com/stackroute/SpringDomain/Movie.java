package com.stackroute.SpringDomain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware,BeanNameAware,BeanFactoryAware{
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;
    private ApplicationContext context=null;
    private BeanFactoryAware bean;

    //constructor DI

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


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.bean=bean;
        System.out.println("This is BeanFactory.....");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name:"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=context;
        System.out.println("This is ApplicationContextAware.......");
    }
}
