package com.example.specs.repository;
 // This is the package where the repository interface belongs

import org.springframework.data.jpa.repository.JpaRepository; // Importing Spring Data JPA's JpaRepository interface

import com.example.specs.entity.entity;

// This interface extends JpaRepository to provide CRUD (Create, Read, Update, Delete) operations for the Todo entity
public interface repo extends JpaRepository<entity, Long> {
    // JpaRepository provides all the necessary methods for interacting with the Todo table in the database
    // We don't need to write any additional code here for basic CRUD operations
}