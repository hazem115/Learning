package com.example.talabat3.restaurant.business.service.services;

import com.example.talabat3.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat3.restaurant.business.dto.response.RestaurantResponseDto;

import java.util.Set;

public interface RestaurantService {
    RestaurantResponseDto saveRestaurant(RestaurantRequestDto request);
    RestaurantResponseDto updateRestaurant(String refNo, RestaurantRequestDto request);
    void deleteRestaurantById(Long id);
    RestaurantResponseDto getByRefNo(String refNo);
    RestaurantResponseDto getById(Long id);
    Set<RestaurantResponseDto> getAllRestaurants();
}
