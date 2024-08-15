package com.example.specs.service.impl;


import lombok.AllArgsConstructor;
import com.example.specs.dto.*;
import com.example.specs.entity.*;
import com.example.specs.repository.*;
import com.example.specs.service.*;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

//import java.util.List;
//import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class serviceimpl implements service {

    private repo todoRepository;

    private ModelMapper modelMapper;

    @Override
    public dto addTodo(dto todoDto) {

        // convert TodoDto into Todo Jpa entity
        entity todo = modelMapper.map(todoDto, entity.class);
 
        // Todo Jpa entity
        entity savedTodo = todoRepository.save(todo);

        // Convert saved Todo Jpa entity object into TodoDto object

        dto savedTodoDto = modelMapper.map(savedTodo, dto.class);

        return savedTodoDto;
    }
    
    @Override 
    public List<dto> getAllUsers(){
    	List<entity> users=todoRepository.findAll();
    	return users.stream().map(user->modelMapper.map(user, dto.class)).collect(Collectors.toList());
    }
    
}
