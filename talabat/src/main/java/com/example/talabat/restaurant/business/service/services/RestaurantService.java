package com.example.talabat.restaurant.business.service.services;

import com.example.talabat.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat.restaurant.business.dto.response.RestaurantResponseDto;

import java.util.Set;

public interface RestaurantService {

    Set<RestaurantResponseDto> getAllRestaurants();

    RestaurantResponseDto saveRestaurant(RestaurantRequestDto request);

    RestaurantResponseDto getRestaurantByRefNo(String refNo);

    void deleteRestaurantById(Long id);
}
