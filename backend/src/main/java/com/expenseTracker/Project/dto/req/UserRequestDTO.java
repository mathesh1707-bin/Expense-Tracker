package com.expenseTracker.Project.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
// no need for setter and constructor 
// since we are only going to retrive the data and send it over

public class UserRequestDTO {
    private String username;
    private String email;
    private String password;
    private String role;

}
