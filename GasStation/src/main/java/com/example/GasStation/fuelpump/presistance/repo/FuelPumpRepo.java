package com.example.GasStation.fuelpump.presistance.repo;

import com.example.GasStation.fuelpump.presistance.entity.FuelPump;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelPumpRepo extends JpaRepository<FuelPump, Long> {
    FuelPump getByRefNo(String refNo);
}
