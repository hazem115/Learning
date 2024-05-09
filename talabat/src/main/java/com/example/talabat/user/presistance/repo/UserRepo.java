package com.example.talabat.user.presistance.repo;

import com.example.talabat.user.presistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{
    User getUserByRefNo(String refNo);
}
