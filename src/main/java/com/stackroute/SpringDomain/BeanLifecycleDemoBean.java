package com.stackroute.SpringDomain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am in afterPropertiesSet()..........");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am in destroy()..........");
    }
    @PostConstruct
    public void customInit()
    {
        System.out.println("This is customInit()....");
    }
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("This is customDestroy()....");
    }
}
