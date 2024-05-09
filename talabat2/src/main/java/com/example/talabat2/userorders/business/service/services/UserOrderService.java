package com.example.talabat2.userorders.business.service.services;

import com.example.talabat2.userorders.business.dto.response.UserOrderResponseDto;

import java.util.Set;

public interface UserOrderService {
    Set<UserOrderResponseDto> getAllUserOrders();
}
