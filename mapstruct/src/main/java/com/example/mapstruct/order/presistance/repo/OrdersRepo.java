package com.example.mapstruct.order.presistance.repo;

import com.example.mapstruct.order.presistance.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders, Long> {
}
