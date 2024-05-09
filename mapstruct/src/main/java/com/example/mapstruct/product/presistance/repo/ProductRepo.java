package com.example.mapstruct.product.presistance.repo;

import com.example.mapstruct.product.presistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
