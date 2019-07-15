package com.stackroute;

import com.stackroute.SpringDomain.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainDemo
{
    public static void main(String[] args) {

        System.out.println("///////////////Using ApplicationContext/////////////");
        //ApplicationContext with Annotation
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //BeanLifeCycleDemoBean object creation
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean(BeanLifecycleDemoBean.class);
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = context.getBean(BeanPostProcessorDemoBean.class);
        //closing down the context of ApplicationContext
        context.registerShutdownHook();


    }
}
