package com.example.talabat.restaurant.business.dto.response;

import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import com.example.talabat.category.business.dto.response.CategoryResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantResponseDto {

    private String restaurantName;
    private String address;
    private double rating;
    private String refNo = UUID.randomUUID().toString();
}
