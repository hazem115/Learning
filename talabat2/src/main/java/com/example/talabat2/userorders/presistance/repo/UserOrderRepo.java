package com.example.talabat2.userorders.presistance.repo;

import com.example.talabat2.userorders.presistance.entity.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrderRepo extends JpaRepository<UserOrder, Long> {
}
