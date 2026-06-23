package com.expenseTracker.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expenseTracker.Project.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{

     
}
