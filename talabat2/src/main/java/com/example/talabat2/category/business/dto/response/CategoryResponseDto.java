package com.example.talabat2.category.business.dto.response;

import com.example.talabat2.restaurant.presistance.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponseDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String categoryName;
    private Restaurant restaurant;

}
