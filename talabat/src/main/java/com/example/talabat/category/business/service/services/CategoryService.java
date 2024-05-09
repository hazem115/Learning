package com.example.talabat.category.business.service.services;

import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import com.example.talabat.category.business.dto.response.CategoryResponseDto;
import com.example.talabat.category.presistance.entity.Category;

import java.util.Set;

public interface CategoryService {

    Set<CategoryResponseDto> getAllCategories();

    CategoryResponseDto saveCategory(CategoryRequestDto request);

    CategoryResponseDto getCategoryByRefNo(String refNo);

    void deleteCategoryById(Long id);

    CategoryResponseDto getById(Long id);
}
