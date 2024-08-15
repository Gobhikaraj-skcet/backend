package com.example.specs.service;

 // This is the package where the service interface belongs

import java.util.List; // Importing the List interface from java.util package

import com.example.specs.dto.dto;

 // Importing the Data Transfer Object (DTO) for Todo

// Service interface for managing Todo items
public interface service {

    // Method to add a new Todo item
    dto addTodo(dto todoDto);
    List<dto> getAllUsers();
//    // Method to get a specific Todo item by its ID
//    TodoDto getTodo(Long id);
//
//    // Method to get a list of all Todo items
//    List<TodoDto> getAllTodos();
//
//    // Method to update an existing Todo item by its ID
//    TodoDto updateTodo(TodoDto todoDto, Long id);
//
//    // Method to delete a specific Todo item by its ID
//    void deleteTodo(Long id);
//
//    // Method to mark a specific Todo item as complete by its ID
//    TodoDto completeTodo(Long id);
//
//    // Method to mark a specific Todo item as incomplete by its ID
//    TodoDto inCompleteTodo(Long id);
}

