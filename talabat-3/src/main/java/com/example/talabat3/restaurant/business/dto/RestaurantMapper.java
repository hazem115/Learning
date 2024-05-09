package com.example.talabat3.restaurant.business.dto;

import com.example.talabat3.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat3.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat3.restaurant.presistance.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RestaurantMapper {
    RestaurantResponseDto entityToDto(Restaurant restaurant);
    Set<RestaurantResponseDto> entityToDto(Set<Restaurant> restaurant);
    Restaurant dtoToEntity(RestaurantRequestDto request);
    Set<Restaurant> dtoToEntity(Set<RestaurantRequestDto> request);
}
