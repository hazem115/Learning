package com.example.talabat2.offers.presistance.repo;

import com.example.talabat2.offers.presistance.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepo extends JpaRepository<Offer, Long> {
    Offer findByRefNo(String refNo);
}
