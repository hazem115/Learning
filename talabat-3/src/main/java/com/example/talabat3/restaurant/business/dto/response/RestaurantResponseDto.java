package com.example.talabat3.restaurant.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantResponseDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String address;
    private String phone;
}
