package com.example.Hahhahaahah.hattem.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HattemResponseDto {
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
}
