package com.example.specs.entity;

import jakarta.persistence.*; // Importing JPA (Java Persistence API) annotations for database operations
import lombok.AllArgsConstructor; // Lombok annotation to generate a constructor with all arguments
import lombok.Getter; // Lombok annotation to generate getter methods for all fields
import lombok.NoArgsConstructor; // Lombok annotation to generate a no-argument constructor
import lombok.Setter; // Lombok annotation to generate setter methods for all fields

// Lombok annotations to reduce boilerplate code for getters, setters, constructors
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity // Specifies that the class is an entity and will be mapped to a database table
@Table(name = "signup") // Specifies the name of the database table to be used for mapping
public class entity {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the primary key value
    private Long id;

    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
    private String username;

    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
    private String email;
    
    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
    private String password;

    // The @Getter annotation automatically generates the following getter methods:
    // public Long getId() { return id; }
    // public String getUsername() { return username; }
    // public String getEmail() { return email; }
    // public String getPassword() { return password; }
}
