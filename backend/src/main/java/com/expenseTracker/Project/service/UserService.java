package com.expenseTracker.Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.expenseTracker.Project.model.User;
import com.expenseTracker.Project.repository.UserRepository;

@Service
public class UserService {
    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    //Post
    public User createUser(User user) {
        return repo.save(user);
    }
    //Get
    public List<User> getUsers() {
        return repo.findAll();
    }
    //Get
    public User getUserbyId(Long id) {
        return repo.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
    }
    //Put
    public User updateUser(Long id, User user) {
        User existingUser = repo.findById(id).orElseThrow(() -> new RuntimeException("User not Found"));
        existingUser.setUsername(user.getUsername());
        existingUser.getEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        return repo.save(existingUser);
        
    }
    //Delete
    public void DeleteUser(Long id) {
        repo.deleteById(id);
    }
}
