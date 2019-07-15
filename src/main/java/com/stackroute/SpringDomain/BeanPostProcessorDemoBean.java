package com.stackroute.SpringDomain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

    //overriding the method of BeanPostProcessor which runs before initialization
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("This is postProcessBeforeInitialization().....");
        return o;
    }
    //overriding the method of BeanPostProcessor which runs after initialization
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("This is postProcessAfterInitialization().....");
        return o;
    }
}
