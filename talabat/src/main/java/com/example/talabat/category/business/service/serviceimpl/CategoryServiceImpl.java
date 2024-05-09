package com.example.talabat.category.business.service.serviceimpl;

import com.example.talabat.category.business.dto.CategoryMapper;
import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import com.example.talabat.category.business.dto.response.CategoryResponseDto;
import com.example.talabat.category.business.service.services.CategoryService;
import com.example.talabat.category.presistance.entity.Category;
import com.example.talabat.category.presistance.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;

    @Override
    public Set<CategoryResponseDto> getAllCategories() {
        List<Category> cats = categoryRepo.findAll();
        return categoryMapper.entityToDto(new HashSet<>(cats));
    }

    @Override
    public CategoryResponseDto saveCategory(CategoryRequestDto request) {
        Category category = categoryRepo.save(categoryMapper.dtoToEntity(request));
        return categoryMapper.entityToDto(category);
    }

    @Override
    public CategoryResponseDto getCategoryByRefNo(String refNo) {
        Category category = categoryRepo.getCategoryByRefNo(refNo);
        return categoryMapper.entityToDto(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryResponseDto getById(Long id) {
        Category category = categoryRepo.findById(id).orElse(null);
        return categoryMapper.entityToDto(category);
    }

}
