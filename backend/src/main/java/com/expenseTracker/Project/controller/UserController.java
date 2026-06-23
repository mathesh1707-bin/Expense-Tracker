package com.expenseTracker.Project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expenseTracker.Project.model.User;
import com.expenseTracker.Project.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(user));
    }
    @GetMapping
    public ResponseEntity<Object> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getUserbyId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable Long id,@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateUser(id, user));
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.DeleteUser(id);
    }
    
}