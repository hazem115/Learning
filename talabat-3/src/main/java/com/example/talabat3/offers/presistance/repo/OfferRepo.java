package com.example.talabat3.offers.presistance.repo;

import com.example.talabat3.category.presistance.entity.Category;
import com.example.talabat3.offers.presistance.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepo extends JpaRepository<Offer,Long>{
    Offer getByRefNo(String refNo);
}
