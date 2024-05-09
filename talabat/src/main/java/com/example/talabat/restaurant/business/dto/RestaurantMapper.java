package com.example.talabat.restaurant.business.dto;

import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import com.example.talabat.category.presistance.entity.Category;
import com.example.talabat.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat.restaurant.presistance.entity.Restaurant;
import com.example.talabat.user.presistance.entity.User;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {CategoryRequestDto.class})
public interface RestaurantMapper {


    RestaurantResponseDto entityToDto(Restaurant restaurant);
    Set<RestaurantResponseDto> entityToDto(Set<Restaurant> restaurant);
    Restaurant dtoToEntity(RestaurantRequestDto request);
    Set<Restaurant> dtoToEntity(Set<RestaurantRequestDto> request);
}
