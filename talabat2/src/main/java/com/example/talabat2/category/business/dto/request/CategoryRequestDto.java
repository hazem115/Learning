package com.example.talabat2.category.business.dto.request;

import com.example.talabat2.restaurant.presistance.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String categoryName;
    private Restaurant restaurant;

}
