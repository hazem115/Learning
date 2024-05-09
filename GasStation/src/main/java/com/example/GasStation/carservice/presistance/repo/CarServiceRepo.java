package com.example.GasStation.carservice.presistance.repo;

import com.example.GasStation.carservice.presistance.entity.CarService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarServiceRepo extends JpaRepository<CarService, Long> {

    //Optional<CarService> findByRefNo(String refNo);

    CarService findByRefNo(String refNo);
}
