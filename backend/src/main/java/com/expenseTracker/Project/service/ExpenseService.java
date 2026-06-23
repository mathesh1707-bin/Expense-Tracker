package com.expenseTracker.Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.expenseTracker.Project.model.Expense;
import com.expenseTracker.Project.repository.ExpenseRepository;

@Service
public class ExpenseService {
    private ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }
    
    public Expense createExpense(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getExpenses() {
        return repo.findAll();
    }

    public Expense getExpensebyId(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Expense not found"));
    }
    
    public Expense updateExpense(Long id, Expense expense) {
        Expense existing = repo.findById(id).orElseThrow(() -> new RuntimeException("Expense not found"));
        existing.setTitle(expense.getTitle());
        existing.setAmount(expense.getAmount());
        existing.setDate(expense.getDate());
        existing.setNote(expense.getNote());
        return repo.save(existing);
    }

    public void deleteExpense(Long id) {
        repo.deleteById(id);
    }

}
