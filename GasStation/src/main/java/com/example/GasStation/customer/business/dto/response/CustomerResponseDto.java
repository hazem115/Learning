package com.example.GasStation.customer.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDto {

    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String address;
    private String phone;
}
