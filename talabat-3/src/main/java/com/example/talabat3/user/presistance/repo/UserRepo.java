package com.example.talabat3.user.presistance.repo;

import com.example.talabat3.user.presistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User getByRefNo(String refNo);
}
