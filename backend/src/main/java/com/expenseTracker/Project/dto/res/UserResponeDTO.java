package com.expenseTracker.Project.dto.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
//unlike Req. here object is being created so we need all 4 annotations

public class UserResponeDTO {

    private String username;
    private String email;
    private String password;
    private String role;
}
