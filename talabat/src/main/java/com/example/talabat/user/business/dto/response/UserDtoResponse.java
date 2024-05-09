package com.example.talabat.user.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDtoResponse {

    private String name;
    private String email;
    private String address;
    private String phone;
    private String refNo = UUID.randomUUID().toString();


}
