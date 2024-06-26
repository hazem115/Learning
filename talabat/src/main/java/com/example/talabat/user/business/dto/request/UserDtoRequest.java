package com.example.talabat.user.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDtoRequest {

    private long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String address;
    private String email;
    private String phone;

}
