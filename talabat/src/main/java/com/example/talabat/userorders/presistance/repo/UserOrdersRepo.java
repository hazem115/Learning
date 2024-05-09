package com.example.talabat.userorders.presistance.repo;

import com.example.talabat.userorders.presistance.entity.UserOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrdersRepo extends JpaRepository<UserOrders, Long> {

    UserOrders getUserOrdersByRefNo(String refNo);
}
