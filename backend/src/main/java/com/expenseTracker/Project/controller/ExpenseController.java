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

import com.expenseTracker.Project.model.Expense;
import com.expenseTracker.Project.repository.ExpenseRepository;
import com.expenseTracker.Project.service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<Object> createExpense(@RequestBody Expense expense) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createExpense(expense));
    }
    @GetMapping
    public ResponseEntity<Object> getExpenses() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getExpenses());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getExpenseById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getExpensebyId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateExpense(@PathVariable Long id,@RequestBody Expense expense) {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateExpense(id, expense));
    }
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
    }
    
}