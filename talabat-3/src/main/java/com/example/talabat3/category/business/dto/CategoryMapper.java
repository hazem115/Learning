package com.example.talabat3.category.business.dto;

import com.example.talabat3.category.business.dto.request.CategoryRequestDto;
import com.example.talabat3.category.business.dto.response.CategoryResponseDto;
import com.example.talabat3.category.presistance.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CategoryMapper {
    CategoryResponseDto entityToDto(Category category);
    Set<CategoryResponseDto> entityToDto(Set<Category> category);
    Category dtoToEntity(CategoryRequestDto request);
    Set<Category> dtoToEntity(Set<CategoryRequestDto> request);
}
