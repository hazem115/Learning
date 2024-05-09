package com.example.talabat2.restaurant.business.service.services;

import com.example.talabat2.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat2.restaurant.business.dto.response.RestaurantResponseDto;

import java.util.Set;

public interface RestaurantService {
    Set<RestaurantResponseDto> getAllRestaurants();

    RestaurantResponseDto saveRestaurant(RestaurantRequestDto request);

    RestaurantResponseDto getByRefNo(String refNo);

    RestaurantResponseDto getById(Long id);

    void deleteById(Long id);
    RestaurantResponseDto updateRestaurant(String refNo, RestaurantRequestDto request);
}
