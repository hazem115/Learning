package com.example.talabat2.user.presistance.repo;

import com.example.talabat2.user.presistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User getByRefNo(String refNo);
}
