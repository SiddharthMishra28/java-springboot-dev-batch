package com.learningspringboot.config;

import com.learningspringboot.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Spring framework will scan this class with help of @Configuration annotation
 * and create the beans defined so that the spring IOC container can process
 * its lifecycle
 */
@Configuration
@ComponentScan(basePackages = "com.learningspringboot")
public class AppConfig {

    @Bean
    Car car1() {
        var santro = new Car();
        santro.setMake("Hyundai");
        santro.setModel("Santro Xing");
        santro.setSeatCapacity(5);
        return santro;
    }

    @Primary
    @Bean
    public Car anotherCar() {
        var jeep = new Car();
        jeep.setMake("Jeep");
        jeep.setModel("compass");
        return jeep;
    }

    @Bean
    String hello() {
        return "Hello there!";
    }

    @Bean
    Integer myNum() {
        return 100;
    }

}
