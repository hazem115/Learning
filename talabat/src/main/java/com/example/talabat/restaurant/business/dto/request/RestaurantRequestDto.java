package com.example.talabat.restaurant.business.dto.request;

import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantRequestDto {
    private Long id;
    private String restaurantName;
    private CategoryRequestDto category;
    private String address;
    private float rating;
    private String refNo = UUID.randomUUID().toString();
}
