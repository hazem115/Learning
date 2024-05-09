package com.example.talabat2.restaurant.presistance.repo;

import com.example.talabat2.restaurant.presistance.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
    Restaurant getByRefNo(String refNo);
}
