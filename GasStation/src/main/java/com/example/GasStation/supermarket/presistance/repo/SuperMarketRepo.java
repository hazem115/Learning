package com.example.GasStation.supermarket.presistance.repo;

import com.example.GasStation.supermarket.presistance.entity.SuperMarket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperMarketRepo extends JpaRepository<SuperMarket, Long> {
    SuperMarket findByRefNo(String refNo);
}
