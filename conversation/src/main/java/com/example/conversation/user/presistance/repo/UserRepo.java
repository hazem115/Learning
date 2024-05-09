package com.example.conversation.user.presistance.repo;

import com.example.conversation.user.presistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
