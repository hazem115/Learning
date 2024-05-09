package com.example.talabat2.userorders.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOrderResponseDto {

    private String refNo = UUID.randomUUID().toString();
    private String userName;
    private String restaurantName;
    private String orderDate;
    private String orderPrice;
    private String orderDiscount;
    private String orderTotal;
}
