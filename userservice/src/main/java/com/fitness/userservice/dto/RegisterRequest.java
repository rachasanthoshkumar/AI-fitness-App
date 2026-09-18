package com.fitness.userservice.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank
    @Email(message = "Email should not be blank")
    private String email;

    @NotBlank
    @Size(min = 6,max = 20)
    private String password;

    private String firstName;
    private String lastName;
}
