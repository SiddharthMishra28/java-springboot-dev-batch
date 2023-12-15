package com.learningspringboot.examples;

import com.learningspringboot.beans.Car;
import com.learningspringboot.beans.Person;
import com.learningspringboot.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIOCAutowiredExample {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var santro = context.getBean(Car.class);
        Person sid = context.getBean(Person.class);
        sid.setName("Sid");
        System.out.println("Vehicle name from spring context : "+santro.getModel());
        System.out.println("Car owner by "+sid.getName()+" is "+sid.getCar().getModel());
    }
}
