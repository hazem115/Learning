package com.example.talabat2.category.presintation.controller;

import com.example.talabat2.category.business.dto.request.CategoryRequestDto;
import com.example.talabat2.category.business.dto.response.CategoryResponseDto;
import com.example.talabat2.category.business.service.services.CategoryService;
import com.example.talabat2.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat2.restaurant.business.dto.response.RestaurantResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Ref;
import java.util.Set;

@RestController
@RequestMapping("api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/allCategories")
    public Set<CategoryResponseDto> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @PostMapping("/saveCategory")
    public CategoryResponseDto saveCategory(@RequestBody CategoryRequestDto request){
        return categoryService.saveCategory(request);
    }
    @PutMapping("/updateCategory/{refNo}")
    public CategoryResponseDto updateCategory(@PathVariable String refNo,@RequestBody CategoryRequestDto request){
        return categoryService.updateCategory(refNo ,request);
    }

    @DeleteMapping("/deleteCategoryById/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

    @PutMapping("/getCategoryByRefNo/{refNo}")
    public CategoryResponseDto getCategoryByRefNo(@PathVariable String refNo){
        return categoryService.getCategoryByRefNo(refNo);
    }

    @GetMapping("/getCategoryById/{id}")
    public CategoryResponseDto getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
}
