package com.example.GasStation.transactions.presistance.repo;

import com.example.GasStation.transactions.presistance.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    Transaction getByRefNo(String refNo);
}
