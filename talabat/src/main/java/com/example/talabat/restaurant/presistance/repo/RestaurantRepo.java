package com.example.talabat.restaurant.presistance.repo;

import com.example.talabat.restaurant.presistance.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {
    Restaurant getRestaurantByRefNo(String refNo);
}
