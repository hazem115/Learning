package com.example.mapstruct.product.presintation.controller;

import com.example.mapstruct.product.business.dto.ProductDto;
import com.example.mapstruct.product.business.dto.ProductMapper;
import com.example.mapstruct.product.presistance.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private ProductMapper productMapper;
    @GetMapping
    public ProductDto getProduct() {
        return productMapper.entityToDto(new Product());
    }
}
