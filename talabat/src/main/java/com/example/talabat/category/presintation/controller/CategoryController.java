package com.example.talabat.category.presintation.controller;

import com.example.talabat.category.business.dto.request.CategoryRequestDto;
import com.example.talabat.category.business.dto.response.CategoryResponseDto;
import com.example.talabat.category.business.service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/allCategories")
    public Set<CategoryResponseDto> getAllCategories() {
         return categoryService.getAllCategories();
    }

    @PostMapping("/saveCategory")
    public CategoryResponseDto saveCategory(@RequestBody CategoryRequestDto request) {
        return categoryService.saveCategory(request);
    }

    @GetMapping("/getCategoryByRefNo/{refNo}")
    public CategoryResponseDto getCategoryByRefNo(@PathVariable String refNo) {
        return categoryService.getCategoryByRefNo(refNo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }

    @GetMapping("/getById/{id}")
    public  CategoryResponseDto getCategoryById(@PathVariable Long id){
        return categoryService.getById(id);
    }
}
