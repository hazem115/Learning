package com.example.talabat3.category.business.service.services;

import com.example.talabat3.category.business.dto.request.CategoryRequestDto;
import com.example.talabat3.category.business.dto.response.CategoryResponseDto;

import java.util.Set;

public interface CategoryService {
    CategoryResponseDto saveCategory(CategoryRequestDto request);
    CategoryResponseDto updateCategory(String refNo, CategoryRequestDto request);
    void deleteCategory(Long id);
    CategoryResponseDto getCategoryByRefNo(String refNo);
    Set<CategoryResponseDto> getAllCategories();
    CategoryResponseDto getCategoryById(Long id);
}
