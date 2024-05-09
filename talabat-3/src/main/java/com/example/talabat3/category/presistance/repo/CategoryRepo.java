package com.example.talabat3.category.presistance.repo;

import com.example.talabat3.category.presistance.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    Category getCategoryByRefNo(String refNo);
}
