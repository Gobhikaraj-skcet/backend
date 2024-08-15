package com.example.specs; // This is the package where the main application class belongs

import org.modelmapper.ModelMapper; // Importing ModelMapper for object mapping
import org.springframework.boot.SpringApplication; // Importing SpringApplication to run the Spring Boot application
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importing SpringBootApplication to mark this class as a Spring Boot application
import org.springframework.context.annotation.Bean; // Importing Bean to define a Spring bean

@SpringBootApplication // This annotation combines @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes
public class SpecssApplication {

    // Defining a bean for ModelMapper to use it throughout the application for mapping objects
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper(); // Returning a new instance of ModelMapper
    }

    public static void main(String[] args) {
        SpringApplication.run(SpecssApplication.class, args); // Running the Spring Boot application
    }
}