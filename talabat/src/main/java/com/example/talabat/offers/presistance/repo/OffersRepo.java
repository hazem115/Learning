package com.example.talabat.offers.presistance.repo;

import com.example.talabat.offers.presistance.entity.Offers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffersRepo extends JpaRepository<Offers, Long> {
    Offers findByRefNo(String refNo);

    Offers findRestaurantByRefNo(String refNo);
}
