package com.learningspringboot.examples;

import com.learningspringboot.beans.Car;
import com.learningspringboot.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIOCInitalizationExample {
    public static void main(String[] args) {
        // BELOW OBJECT IS DECLARED USING new KEYWORD AND HENCE NOT MANAGED BY SPRING IOC CONTAINER
        Car bmw = new Car();
        bmw.setModel("BMW i7");
        System.out.println("Non Spring Managed Car Instance "+bmw);

        // SPRING IO MANAGED BEAN WHICH IS CREATED AND DESTROYED AS PER CONFIG
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var santro = context.getBean(Car.class);
        System.out.println("Spring IOC Managed Car Instance "+santro);
    }
}
