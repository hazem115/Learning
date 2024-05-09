package com.example.talabat.userorders.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserOrdersRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String restaurantName;
    private String orderDate;
    private String orderDesc;
    private double orderPrice;
}
