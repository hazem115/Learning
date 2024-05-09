package com.example.talabat3.category.presintation.controller;

import com.example.talabat3.category.business.dto.request.CategoryRequestDto;
import com.example.talabat3.category.business.dto.response.CategoryResponseDto;
import com.example.talabat3.category.business.service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/abi/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/saveCategory")
    public CategoryResponseDto saveCategory(@RequestBody CategoryRequestDto request){
        return categoryService.saveCategory(request);
    }
    @PutMapping("/updateCategory/{refNo}")
    public CategoryResponseDto updateCategory(@PathVariable String refNo, @RequestBody CategoryRequestDto request){
        return categoryService.updateCategory(refNo, request);
    }
    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
    @GetMapping("/getCategory/{refNo}")
    public CategoryResponseDto getCategory(@PathVariable String refNo){
        return categoryService.getCategoryByRefNo(refNo);
    }
    @GetMapping("/getAllCategories")
    public Set<CategoryResponseDto> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @GetMapping("/getCategoryById/{id}")
    public CategoryResponseDto getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
}
