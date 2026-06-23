package com.expenseTracker.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expenseTracker.Project.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
    
} 
