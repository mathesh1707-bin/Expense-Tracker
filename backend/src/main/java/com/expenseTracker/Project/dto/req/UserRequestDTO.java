package com.expenseTracker.Project.dto.req;

import lombok.Getter;



@Getter
// no need for setter and constructor 
// since we are only going to retrive the data and send it over

public class UserRequestDTO {
    private String username;
    
    private String password;
    private String role;

}
