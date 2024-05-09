package com.example.talabat.category.business.dto.response;

import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryResponseDto {

    private long id;
    private String refNo = UUID.randomUUID().toString();
    private String categoryName;
    private CategoryRequestDto category;
}
