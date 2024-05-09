package com.example.GasStation.carserviceTransaction.presistance.repo;

import com.example.GasStation.carserviceTransaction.presistance.entity.CarServiceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarServiceTransactionRepo extends JpaRepository<CarServiceTransaction, Long> {
    CarServiceTransaction getByRefNo(String refNo);
}
