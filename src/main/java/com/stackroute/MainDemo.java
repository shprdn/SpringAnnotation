package com.stackroute;

import com.stackroute.SpringDomain.Actor;
import com.stackroute.SpringDomain.AppConfig;
import com.stackroute.SpringDomain.BeanLifecycleDemoBean;
import com.stackroute.SpringDomain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainDemo
{
    public static void main(String[] args) {

        System.out.println("///////////////Using ApplicationContext/////////////");
        //ApplicationContext with Annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //BeanLifeCycleDemoBean object creation
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean(BeanLifecycleDemoBean.class);
        //closing down the context of ApplicationContext
        ((AbstractApplicationContext)context).registerShutdownHook();


    }
}
