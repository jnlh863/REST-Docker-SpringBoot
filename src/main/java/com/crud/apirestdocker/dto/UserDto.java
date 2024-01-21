package com.crud.apirestdocker.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    
    private Long id;

    private String firstname;

    private String lastname;

    private String email;

}
