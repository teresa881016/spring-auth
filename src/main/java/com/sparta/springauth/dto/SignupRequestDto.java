package com.sparta.springauth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

//    @Email // @Pattern(정규표현식)
//    @Pattern(regexp = "^(.+)@(.+)$")
//    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    @Pattern(regexp = "^[A-Za-z0-9+_!#$%&*+/=?`{|}~^.-]+@[A-Za-z0-9+_.-]+$")
    @NotBlank
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}