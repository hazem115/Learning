package com.example.GasStation.customer.presistance.repo;

import com.example.GasStation.customer.presistance.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer findByRefNo(String refNo);
}
