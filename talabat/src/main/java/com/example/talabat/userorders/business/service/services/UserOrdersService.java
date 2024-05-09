package com.example.talabat.userorders.business.service.services;

import com.example.talabat.userorders.business.dto.request.UserOrdersRequestDto;
import com.example.talabat.userorders.business.dto.response.UserOrdersResponseDto;

import java.util.Set;

public interface UserOrdersService {

    Set<UserOrdersResponseDto> getUserOrders();

    UserOrdersResponseDto saveUserOrders(UserOrdersRequestDto request);

    UserOrdersResponseDto getUserOrdersByRefNo(String refNo);
}
