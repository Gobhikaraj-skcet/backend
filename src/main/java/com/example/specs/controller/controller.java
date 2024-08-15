package com.example.specs.controller;

 // This is the package where the controller class belongs

import lombok.AllArgsConstructor; // Importing Lombok annotation to generate a constructor with all arguments

import com.example.specs.dto.dto; // Importing the Data Transfer Object (DTO) for Todo
import com.example.specs.service.*; // Importing the service layer for Todo

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // Importing Spring's @Autowired for dependency injection
import org.springframework.http.HttpStatus; // Importing HttpStatus to set the HTTP response status
import org.springframework.http.ResponseEntity; // Importing ResponseEntity to handle HTTP responses
//import org.springframework.security.access.prepost.PreAuthorize; // Importing security annotations (commented out)
import org.springframework.web.bind.annotation.*; // Importing Spring Web annotations for REST controllers

//import java.util.List; // Importing List from java.util (commented out)

@CrossOrigin(origins="http://localhost:3000") // Allowing cross-origin requests from any source
@RestController // Marks the class as a RESTful web service controller
@RequestMapping("api/todos") // Sets the base URL for all endpoints in this controller
@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
public class controller {

    @Autowired // Automatically injects the TodoService bean into this field
    private service todoService;
    
    // Endpoint to add a new Todo item
    @PostMapping("/signup")
    public ResponseEntity<dto> addTodo(@RequestBody dto todoDto) {
        // Calls the service layer to add a new Todo item and save the returned object
        dto savedTodo = todoService.addTodo(todoDto);
        
        // Returns the saved Todo item with a 201 Created HTTP status
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }
    
    @GetMapping("/signin")
    public ResponseEntity<List<dto>> getAllusers(){
    	return ResponseEntity.ok(todoService.getAllUsers());
    }
    
    
}
