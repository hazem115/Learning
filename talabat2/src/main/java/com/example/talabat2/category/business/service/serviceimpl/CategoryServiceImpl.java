package com.example.talabat2.category.business.service.serviceimpl;

import com.example.talabat2.category.business.dto.CategoryMapper;
import com.example.talabat2.category.business.dto.request.CategoryRequestDto;
import com.example.talabat2.category.business.dto.response.CategoryResponseDto;
import com.example.talabat2.category.business.service.services.CategoryService;
import com.example.talabat2.category.presistance.entity.Category;
import com.example.talabat2.category.presistance.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;
    @Override
    public CategoryResponseDto saveCategory(CategoryRequestDto request) {
        Category category = categoryRepo.save(categoryMapper.dtoToEntity(request));
        return categoryMapper.entityToDto(category);
    }
    @Override
    public CategoryResponseDto updateCategory(String refNo, CategoryRequestDto request) {
        Category oldCategory = categoryRepo.getCategoryByRefNo(refNo);
        Category categoryToUpdate = categoryMapper.dtoToEntity(request);
        categoryToUpdate.setId(oldCategory.getId());
        return categoryMapper.entityToDto(categoryRepo.save(categoryToUpdate));
    }
    @Override
    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }
    @Override
    public Set<CategoryResponseDto> getAllCategories() {
        List<Category> result = categoryRepo.findAll();
        return categoryMapper.entityToDto(new HashSet<>(result));
    }
    @Override
    public CategoryResponseDto getCategoryByRefNo(String refNo) {
        Category category = categoryRepo.getCategoryByRefNo(refNo);
        return categoryMapper.entityToDto(category);
    }
    @Override
    public CategoryResponseDto getCategoryById(Long id) {
        Category category = categoryRepo.findById(id).orElse(null);
        return categoryMapper.entityToDto(category);
    }
}
