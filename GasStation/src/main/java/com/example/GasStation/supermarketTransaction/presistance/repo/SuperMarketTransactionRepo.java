package com.example.GasStation.supermarketTransaction.presistance.repo;

import com.example.GasStation.supermarketTransaction.presistance.entity.SuperMarketTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperMarketTransactionRepo extends JpaRepository<SuperMarketTransaction, Long> {
    SuperMarketTransaction findByRefNo(String refNo);
}
