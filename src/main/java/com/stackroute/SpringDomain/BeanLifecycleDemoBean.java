package com.stackroute.SpringDomain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    //overriding the method of InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am in afterPropertiesSet()..........");
    }
    //overriding the method of DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("I am in destroy()..........");
    }
    //this method will be called post construction of bean
    @PostConstruct
    public void customInit()
    {
        System.out.println("This is customInit()....");
    }
    //before destroy this method will be called
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("This is customDestroy()....");
    }
}
