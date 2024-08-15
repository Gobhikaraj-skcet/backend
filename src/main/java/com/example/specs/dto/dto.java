package com.example.specs.dto;// This is the package where the Data Transfer Object (DTO) class belongs

import lombok.AllArgsConstructor; // Lombok annotation to generate a constructor with all arguments
import lombok.Getter; // Lombok annotation to generate getter methods for all fields
import lombok.NoArgsConstructor; // Lombok annotation to generate a no-argument constructor
import lombok.Setter; // Lombok annotation to generate setter methods for all fields

// Lombok annotations to reduce boilerplate code for getters, setters, and constructors
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class dto {

    private Long id; // Field for the unique identifier of the Todo item

    private String username; // Field for the title of the Todo item

    private String email;// Field for the description of the Todo item
    private String password; 

    // Field to indicate if the Todo item is completed or not
}
