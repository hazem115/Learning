package com.example.talabat2.category.business.service.services;

import com.example.talabat2.category.business.dto.request.CategoryRequestDto;
import com.example.talabat2.category.business.dto.response.CategoryResponseDto;

import java.util.Set;

public interface CategoryService {
    Set<CategoryResponseDto> getAllCategories();
    CategoryResponseDto saveCategory(CategoryRequestDto request);
    void deleteCategory(Long id);

    CategoryResponseDto getCategoryByRefNo(String refNo);

    CategoryResponseDto getCategoryById(Long id);

    CategoryResponseDto updateCategory(String refNo,CategoryRequestDto request);
}
