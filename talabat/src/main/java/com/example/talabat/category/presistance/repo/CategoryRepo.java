package com.example.talabat.category.presistance.repo;

import com.example.talabat.category.presistance.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> {
    Category getCategoryByRefNo(String refNo);

}
