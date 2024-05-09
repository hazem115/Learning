package com.example.talabat2.restaurant.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String address;
    private String phone;

}
