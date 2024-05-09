package com.example.Hahhahaahah.hattem.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HattemRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
}
