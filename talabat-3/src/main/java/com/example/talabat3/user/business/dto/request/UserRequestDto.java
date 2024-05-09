package com.example.talabat3.user.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String address;
}
