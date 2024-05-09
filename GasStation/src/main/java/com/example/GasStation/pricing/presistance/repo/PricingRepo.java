package com.example.GasStation.pricing.presistance.repo;

import com.example.GasStation.pricing.presistance.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepo extends JpaRepository<Pricing, Long> {
    Pricing findByRefNo(String refNo);
}
