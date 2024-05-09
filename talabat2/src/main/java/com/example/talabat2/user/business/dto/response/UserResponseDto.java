package com.example.talabat2.user.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private String refNo = UUID.randomUUID().toString();
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String address;
}
